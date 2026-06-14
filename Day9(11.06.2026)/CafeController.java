package com.example.cafe;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/coffee")
public class CafeController {
    private final CafeService service;
    public CafeController(CafeService service) {
        this.service = service;
    }
    @PostMapping
    public Cafe orderCafe(@RequestBody Cafe cafe) {
        return service.orderCafe(cafe);
    }
    @GetMapping
    public List<Cafe> getOrders() {
        return service.getOrders();
    }
}