# DEMO APPLICTION FILE-IntelliJ


package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

&#x09;public static void main(String\[] args) {

&#x09;	SpringApplication.run(DemoApplication.class, args);

&#x09;}

}



## Code explanation



package com.example.demo; --------------- This line says my java class is live inside a package(folder) called com.example.demo
                                          Packages help to organize the code and avoid name clashes 



SpringApplication;---------------------- This is the helper that stats your application or app



SpringBootApplication;------------------ Brings in spring-boot classes you need 



@SpringBootApplication ----------------- This annotation is responsible for auto-configuration of everything



main ----------------------------------- This ignites key that starts your backend server



## NOTE

&#x20;                                        

SPRING INITIALIZR: giving us a default java app called demoApplication.java  though it looks like a normal java program when we run                            		   it spring-boot wakes up , starts a web server and wait for our endpoints









