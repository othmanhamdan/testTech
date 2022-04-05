package com.testtech.testtech;

import com.testtech.testtech.dao.ModelRepository;
import com.testtech.testtech.entities.Model;
import com.testtech.testtech.web.ModelController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TesttechApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesttechApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ModelController modelController){
        return args -> {
            modelController.saveModel(new Model(null, "hamdan","othman",30));
            modelController.saveModel(new Model(null, "bouhajja","hicham",25));
            modelController.saveModel(new Model(null, "saidi","akram",36));
        };
    }

}
