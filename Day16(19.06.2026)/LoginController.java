package com.example.backend_vscode;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestBody UserLogin login){
        if("sude".equals(login.getUsername()) && "1234".equals(login.getPassword()))
            return "From backend: Login successful";
        else
            return "Login failed";
    }
    static class UserLogin{
        private String username;
        private String password;
        public String getUsername(){ return username;}
        public void setUsername(String username){ this.username=username ;}
        public String getPassword(){ return password;}
        public void setPassword(String password){ this.password=password ;}
    }
}
