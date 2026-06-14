package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name){
        return " Hi "+ name;
    }


    @GetMapping("/add/{a}/{b}")
    public String sayAdd(@PathVariable int a, @PathVariable int b){
        return " Addition: "+ (a+b);
    }
    @GetMapping("/sub/{a}/{b}")
    public String saySub(@PathVariable int a, @PathVariable int b){
        return " Subtraction: "+ (a-b);
    }
    @GetMapping("/mul/{a}/{b}")
    public String sayMul(@PathVariable int a, @PathVariable int b){
        return " Multiplication: "+ (a*b);
    }
    @GetMapping("/div/{a}/{b}")
    public String sayDiv(@PathVariable int a, @PathVariable int b){
        return " Division: "+ (a/b);
    }


    @GetMapping("/sum/{a}/{b}")
    public String saySum(@PathVariable int a, @PathVariable int b){
        if((a+b)%2==0)  return " Sum: Even";
        else  return " Sum: Odd";

    }
    @GetMapping("/name/{entername}")
    public String sayName(@PathVariable String entername){
        if(entername.equalsIgnoreCase("Sudeshna"))  return " My name is Sudeshna";
        else  return "I dont know";

    }

    @GetMapping("/climate/{temp}")
    public String sayName(@PathVariable int temp){
        if(temp<=0)  return " Shivering";
        else if(0 < temp && temp<= 15) return "Chill";
        else if(15 < temp && temp<= 24) return "Happy";
        else if(24 < temp && temp<= 30) return "Towards Hot";
        else if(30 < temp && temp<= 32) return "Hotter";
        else  return "OMG";
    }


    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro (@PathVariable String name, @PathVariable String city,@PathVariable String course) {
        return "Hello, I am " + name + " from " + city + ", welcome to " + course;
    }




    @GetMapping("/add1/{a}/{b}")
    public int sayAdded (@PathVariable int a, @PathVariable int b){
        return  a+b;
    }
    @GetMapping("/sub1/{a}/{b}")
    public int saySubtract (@PathVariable int a, @PathVariable int b){
        return a-b;
    }
    @GetMapping("/mul1/{a}/{b}")
    public int sayMultiply (@PathVariable int a, @PathVariable int b){
        return a*b;
    }
    @GetMapping("/div1/{a}/{b}")
    public int sayDivision (@PathVariable int a, @PathVariable int b){
        return a/b;
    }

}