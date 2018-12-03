package com.wantdo.security.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luanx
 */

@SpringBootApplication
@EnableEurekaServer
public class CenterBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(CenterBootstrap.class, args);
    }
}
