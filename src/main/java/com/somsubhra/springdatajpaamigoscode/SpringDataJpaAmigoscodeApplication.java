package com.somsubhra.springdatajpaamigoscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaAmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaAmigoscodeApplication.class, args);
    }


    //    Just to have few data in db on running
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student("Maria", "James", "maria@gmail.com", 20);
            studentRepository.save(maria);
        };
    }

}
