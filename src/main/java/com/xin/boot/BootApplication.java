package com.xin.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {
    private static Logger logger = LoggerFactory.getLogger(BootApplication.class);

    public static void main(String[] args) {
        logger.info("spring boot begin to start");
        SpringApplication.run(BootApplication.class, args);
        logger.info("spring boot is running");
    }

}
