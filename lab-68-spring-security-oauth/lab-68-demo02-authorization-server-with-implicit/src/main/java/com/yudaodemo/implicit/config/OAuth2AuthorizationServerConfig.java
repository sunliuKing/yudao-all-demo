package com.yudaodemo.implicit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @author sunliu
 * @ClassName OAuth2AuthorizationServerConfig
 * @Description
 * @Time 2024/9/26 15:38
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    /**
     * 用户认证 Manager
     */
    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory() // <4.1>
                .withClient("clientapp").secret("112233") // <4.2> Client 账号、密码。
                // .authorizedGrantTypes("password") // <4.2> 密码模式
                // .authorizedGrantTypes("authorization_code")
                .authorizedGrantTypes("implicit")
                .redirectUris("http://127.0.0.1:9090/callback02")
                .scopes("read_userinfo", "read_contacts") // <4.2> 可授权的 Scope
//                .and().withClient() // <4.3> 可以继续配置新的 Client
        ;
    }

}
