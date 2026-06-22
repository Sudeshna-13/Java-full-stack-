package com.example.courseMonday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/course")
    public String getCourse() {
        return "Course - Microservices 101";
    }
    @GetMapping("/student-course")
    public String getStudentCourse() {
        RestTemplate restTemplate =new RestTemplate();
        String s= restTemplate.getForObject("http://localhost:8081/student",String.class);
        String c= restTemplate.getForObject("http://localhost:8082/course",String.class);
        return s+" enrolled in " +c;
        // return s+" enrolled in " +getCourse();

    }

}
