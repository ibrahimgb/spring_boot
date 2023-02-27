package com.tuto.demo;

import com.tuto.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello(
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
