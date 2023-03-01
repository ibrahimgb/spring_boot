package com.tuto.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ibrahim = new Student(
                  "ibrahim","ibrahim@gmail.com", LocalDate.of(2000,04,5)
            );
            Student zaki = new Student(
                    "zaki","zaki@gmail.com", LocalDate.of(1998,9,5)
            );

            repository.saveAll(List.of(ibrahim,zaki));
        };
    }
}
