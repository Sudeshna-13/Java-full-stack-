package com.example.studentAndCourseMonday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @GetMapping("/c2")
    public String course(){
        return " course number:101";

    }
}
