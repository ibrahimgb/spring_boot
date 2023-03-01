package com.tuto.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(
    ) {
        return studentService.getStudents();
    }

    @PostMapping( consumes = {"application/json"})
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path= "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentID}")
    public String updateStudent(
            @PathVariable ("studentID") Long studentID,
            @RequestParam (required = false) String name,
            @RequestParam (required = false) String email
    ){
        studentService.updateStudent(studentID, name, email);
        return(name);
    }



}
