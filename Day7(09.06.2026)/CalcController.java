package com.example.frontend_backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class CalcController {
    @GetMapping("/calc/{operation}/{a}/{b}")
   // public String calculator(@PathVariable String operation,@PathVariable int a, @PathVariable int b){
    public Map<String,Object> calculator(@PathVariable String operation, @PathVariable int a, @PathVariable int b){
        if(operation.equalsIgnoreCase("add"))  return Map.of("Addition: " , (a + b));
        else if(operation.equalsIgnoreCase("sub")) return Map.of( "Subtraction: " , (a - b));
        else if(operation.equalsIgnoreCase("mul")) return Map.of( "Multiplication: " ,(a * b));
        else if(operation.equalsIgnoreCase("div")) {
            if (b != 0) return Map.of( "Division: " , (a / b));
            else return Map.of(" invalid",b);
        }
        else
            return Map.of("Invalid Operation",b);
    }
    @GetMapping("/calc/{operation}/{value}")
    public String scientific(@PathVariable String operation, @PathVariable int value) {
        if (operation.equalsIgnoreCase("log2")) return "Log2: " + String.format("%.2f",Math.log(value)/Math.log(2));
        else if (operation.equalsIgnoreCase("log10")) return "log10: " + String.format("%.2f",Math.log10(value));
        else if (operation.equalsIgnoreCase("sin")) return "sin: " + String.format("%.2f", Math.sin(Math.toRadians(value)));
        else if (operation.equalsIgnoreCase("cos")) return "cos: " + String.format("%.2f",Math.cos(Math.toRadians(value)));
        else if (operation.equalsIgnoreCase("tan")) return "tan: " + String.format("%.2f",Math.tan(Math.toRadians(value)));
        else return "invalid";
    }
    @GetMapping("/calc/spiral")
    public String spiral() {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        StringBuilder result = new StringBuilder();
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                result.append(arr[top][i] ).append(" ");
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                result.append(arr[i][right]  ).append(" ");
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.append(arr[bottom][i] ).append(" ");
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.append(arr[i][left]  ).append(" ");
                }
                left++;
            }
        }
        return result.toString();
    }

    }