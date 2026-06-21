package com.example.saturday;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SaturdayController {
    private final SaturdayRepository repo;
    public  SaturdayController(SaturdayRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/saturday")
    public List<Saturday> sayTask() {
            return repo.findAll();
    }
    @PostMapping("/sat")
    public String addSaturday(@RequestBody Saturday s) {
        repo.save(s);
        return "saved" ;
    }
}