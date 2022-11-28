/*
package com.example.rest_demo;


import com.example.rest_demo.user.User;
import com.example.rest_demo.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User anthony = new User(
                    "Anthony",
                    "Haidari",
                    "Haidariano@gmail.com",
                    "s141479"
            );

            User maryam = new User(
                    "Maryam",
                    "Haidari",
                    "mh@gmail.com",
                    "cmllslsls"

            );
            User zahra = new User(
                    "Zahra",
                    "Haidari",
                    "zh@gmail.com",
                    "sllalmndnal"

            );

            repository.saveAll(
                    Arrays.asList(anthony, maryam, zahra)
            );
        };
    }
}
*/
