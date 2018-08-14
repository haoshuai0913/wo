package com.ordosbank.wo;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WoApplication {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(WoApplication.class, args);
    }
}
