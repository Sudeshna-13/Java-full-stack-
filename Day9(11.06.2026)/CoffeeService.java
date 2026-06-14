package com.example.cofffeeOrder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CoffeeService {
    private List<String> orders = new ArrayList<>();
    public String orderCoffee(String type){
        orders.add(type);
        return  type;
    }
    public List<String> getOrders(){
        return orders;
    }
}
