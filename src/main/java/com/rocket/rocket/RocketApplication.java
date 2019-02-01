package com.rocket.rocket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rocket.rocket.mybatis")
public class RocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketApplication.class, args);
    }

}

