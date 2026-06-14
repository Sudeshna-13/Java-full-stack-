package com.example.cafe;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CafeService {
    private List<Cafe> orders = new ArrayList<>();
    private int nextId = 1;
    public Cafe orderCafe(Cafe cafe) {
        cafe.setId(nextId++);
        orders.add(cafe);
        return cafe;
    }
    public List<Cafe> getOrders() {
        return orders;
    }
}
