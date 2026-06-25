package com.example.hotelBookTuesday;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class HotelController {
    private final HotelRepository repo;
    public HotelController(HotelRepository repo){ this.repo=repo;}
    @GetMapping("/roomget")
    public List<Hotel> getHotel(){
        return repo.findAll();
    }
    @PostMapping("/roomset")
    public String setHotel(@RequestBody Hotel h){
        repo.save(h);
        return "saved";
    }
}
