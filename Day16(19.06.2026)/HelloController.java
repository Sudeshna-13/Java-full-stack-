package com.example.backend_vscode;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HelloController {
    private final HelloService service;
    public HelloController(HelloService service){
        this.service=service;
    }
    @GetMapping("/hello/{a}")
    public String sayHello(@PathVariable int a){
        return service.getTable(a);
    }
    /*  fetch method from frontend using .then , it fetches only the first function not next upcoming contents
    here it fetches only sayHello and not fetch sayHi
    public String sayHi(){
        return "Hi  from Spring Boot backend";}
    */
}
