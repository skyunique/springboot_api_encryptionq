package com.sky.springboot_api_encryption;

import cn.shuibo.annotation.EnableSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSecurity
public class SpringbootApiEncryptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiEncryptionApplication.class, args);
    }

}
