package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 伍六七
 * @date 2023/6/27 14:08
 */
@SpringBootApplication
public class AppSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AppSpringBootApplication.class);
        springApplication.run(args);
    }
}
