package com.example.studentAndCourseMonday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @GetMapping("/c1")
    public String name(){
        return "Sudeshna";
    }
}
