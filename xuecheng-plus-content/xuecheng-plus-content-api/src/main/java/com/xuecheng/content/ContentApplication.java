package com.xuecheng.content;/**
 * @title: ContentApplication
 * @projectName xuecheng-plus-project2080
 * @description:
 * @author Adidas
 * @date 2023/1/25 11:04
 */

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description TODO
 * @author Adidas
 * @date 2023/1/25 11:04
 * @version 1.0
 */
@EnableSwagger2Doc
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}

