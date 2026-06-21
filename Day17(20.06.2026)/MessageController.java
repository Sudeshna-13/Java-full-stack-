package com.example.frontendBackendDB;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {
    private final MessageRepository repo;

    public  MessageController(MessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/hello")
    public String sayHello() {
        List<Message> all = repo.findAll();
        if (all.isEmpty()) {
          repo.save(new Message("Hello from Spring Boot + DB!"));
        }
        return all.get(0).getText();
    }

    @GetMapping("/rec")
    public List<Message> sayRec() {
        return repo.findAll();
    }

        @PostMapping("/hello")
    public String addMessage(@RequestBody Message msg) {
        repo.save(msg);
        return "Saved: " + msg.getText();
    }
}