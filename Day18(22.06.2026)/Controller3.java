package com.example.studentAndCourseMonday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
    @Autowired
    Controller1 c1;
    @Autowired
    Controller2 c2;
    @GetMapping("/c3")
    public String stucour(){
        String s=c1.name();
        String c=c2.course();
        return s+" enrolled in  "+c;

    }
}
