package com.example.saturday;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saturday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private String name;
    private String date;

    public Saturday() {}

    public Long getId() { return id; }
    public String getTask() { return task; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public void setTask(String task) {this.task = task;}
    public void setName(String name) {this.name = name;}
    public void setDate(String date) {this.date = date;}



}
