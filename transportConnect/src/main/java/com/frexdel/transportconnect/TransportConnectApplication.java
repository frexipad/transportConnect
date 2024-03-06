package com.frexdel.transportconnect;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransportConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransportConnectApplication.class, args);
    }

    @Bean
    CommandLineRunner runner  (){
        return args ->{
            System.out.println("Starting...........");
        };
    }

}
