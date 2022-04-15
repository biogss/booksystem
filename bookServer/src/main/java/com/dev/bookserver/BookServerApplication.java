package com.dev.bookserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dev.bookserver.mapper")
public class BookServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServerApplication.class, args);
    }

}
