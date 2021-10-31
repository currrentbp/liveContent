package com.currentbp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.currentbp"})
public class LiveContentWebMain {
    public static void main(String[] args) {
        SpringApplication.run(LiveContentWebMain.class, args);
    }
}
