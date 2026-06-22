package com.example.Monday;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EcommerceController {
    private final EcommerceRepository repo;
    public EcommerceController(EcommerceRepository repo){ this.repo =repo;}
    @GetMapping("/getrec")
    public List<Monday> getRecord(){
        return repo.findAll();
    }
    @PostMapping("/postrec")
    public String postRecord(@RequestBody Monday s){
     repo.save(s);
     return "saved";
    }
}