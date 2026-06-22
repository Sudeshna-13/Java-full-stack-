package com.example.studentMonday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/student")

public class StudentController {
    @GetMapping
    public String getStudent(){
        return "student: Sudeshna";
    }
}
