package com.tuto.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(
    ) {

        return List.of(
                new Student(
                        1L ,
                        "ibrahim" ,
                        "ibrahim@gmail.com",
                        LocalDate.of(2000,04 , 25),
                        22

                )
        );
    }
}
