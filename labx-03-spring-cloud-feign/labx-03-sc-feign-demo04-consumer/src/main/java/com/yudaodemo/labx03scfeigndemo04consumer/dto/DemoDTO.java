package com.yudaodemo.labx03scfeigndemo04consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoDTO {

    private String username;
    private String password;
    
    // ... 省略 setter、getter 方法
}