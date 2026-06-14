package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usecontroller {
    @GetMapping("/myhtml")

    public String sayHello(){
        return "<h1 style=\"color:yellow ; background-color:darkmagenta\"> Tribute to MSD </h1>\n" +
                "<center>\n"+
                "<h1> Basic calculator</h1>\n" +
                "<input type=\"number\" id=\"n1\" placeholder=\"num1\">\n" +
                "<input type=\"number\" id=\"n2\" placeholder=\"num2\">\n" +
                "<button onclick=\"addNumbers()\">ADD</button>"+
                "<h3 id=sum></h3>\n" +
                "<script>\n" +
                "function addNumbers(){\n" +
                "let a=document.getElementById(\"n1\").value;\n" +
                "let b=document.getElementById(\"n2\").value;\n" +
                "let s=Number(a)+Number(b);\n" +
                "document.getElementById(\"sum\").textContent=\"Result: \"+s;\n" +
                "}"+
                "</script>"+
                "<p>In the Indian Premier League (IPL), Dhoni plays for Chennai Super Kings (CSK), leading them to the final on ten occasions and winning it five times (2010, 2011, 2018, 2021 and 2023) jointly sharing this record with Rohit Sharma. He has also led CSK to two Champions League T20 titles in 2010 and 2014. Dhoni is among the few batsmen to have scored more than five thousand runs in the IPL, as well as being the first wicket-keeper to do so.</p>\n" +
                "<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyLuJKpW-DWU2ch5dS6A_N_vEiQ8D0IdVAsQ&s\"></img>\n" +
                "<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAqDQKZed1ZOUFRGfS3krDE2lWYPTNXNw_Wg&s\"></img>\n" +
                "<img src=\"tech pic.jpg\"</img>\n"+
                "</center>";
    }
}
