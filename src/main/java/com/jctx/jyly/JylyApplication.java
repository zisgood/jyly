package com.jctx.jyly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class JylyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JylyApplication.class, args);
    }

}
