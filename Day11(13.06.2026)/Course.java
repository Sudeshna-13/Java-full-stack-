package com.example.studentDb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courId;
    private String courName;
    public Course() {}
    public Course(String name) { this.courName = name; }
    public Long getCourId() { return courId; }
    public String getCourName() {return courName; }
}

