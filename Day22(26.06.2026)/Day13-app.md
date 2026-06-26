## &#x09;Function(Traditional)

##### App.js



function App() {

&#x20; return (

&#x20;   <div>

&#x20;     <App1 />

&#x20;   <h1>This is App1</h1>

&#x20;   <h1>function</h1>

&#x20;

&#x20;   </div>

);

}

export default App;



\----------------------------------------------------------------------------------------------------------------------------

## &#x09;Arrow function



##### App.js



const App=()=> {

&#x20; return (

&#x20;   <div>

&#x20;     <App1 />

&#x20;   <h1>This is App1</h1>

&#x20;   <h1>arrow function</h1>

&#x20;

&#x20;   </div>

);

}

export default App;



\-----------------------------------------------------------------------------------------------------------------------------



## &#x09;Direct export-(arrow function mandatory)

##### App.js



export const App=()=> {

&#x20; return (

&#x20;   <div>

&#x20;     <App1 />

&#x20;   <h1>This is App1</h1>

&#x20;   <h1>direct export</h1>

&#x20;

&#x20;   </div>

);

}



##### index.js



import {App} from './App';



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;Event handling

##### App.js



export const Compute =()=>

{

&#x20;   const n=300

&#x20;   function handleClick(){

&#x20;       alert("my event"+n)

&#x20;   }

&#x20;   return(

&#x20;       <div>

&#x20;       <h1>Event handling:</h1>

&#x20;        <button onClick={handleClick}>click</button>

&#x20;        </div>

&#x20;   );

}



\----------------------------------------------------------------------------------------------------------------------------

## &#x09;Arrow function and print output

##### App.js



export const Compute =()=>

{

&#x20;   const n=300

&#x20;   const handleClick=()=>{

&#x20;       document.getElementById("res").innerText="Button clicked " +n

&#x20;   }

&#x20;   return(

&#x20;       <div>

&#x20;       <h1>Event handling:</h1>

&#x20;        <button onClick={handleClick}>click</button>

&#x20;        <h1 id="res"></h1>

&#x20;        </div>

&#x20;   );

}



\----------------------------------------------------------------------------------------------------------------------------

## &#x09;DOM Manipulation

##### App.js



export const Compute =()=>

{

&#x20;   const n=300

&#x20;   const handleClick=()=>{

&#x20;       document.getElementById("res").innerText="Button clicked " +n

&#x20;       const msg=document.getElementById("res")

&#x20;       msg.textContent="good dog"

&#x20;       msg.style.color="lightblue"

&#x20;   }

&#x20;       return(

&#x20;       <div>

&#x20;       <h1>Event handling:</h1>

&#x20;        <button onClick={handleClick}>click</button>

&#x20;        <h1 id="res"></h1>

&#x20;        </div>

&#x20;   );

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;Image conversion

##### App.js



export const Compute =()=>ssroom



{

&#x20;   const n=300

&#x20;   const handleClick=()=>{

&#x20;       document.getElementById("res").src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFQLcJ1qnAUVtgFqNmazjnyycV4\_X-Zg2xxw\&s"

&#x20;   }

&#x20;   return(

&#x20;       <div>

&#x20;       <h1>Event handling:</h1>

&#x20;

&#x20;        <img id="res" onClick={handleClick} src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKBG31ebB3TtvujGzoS2l99z4Q1ez7902rWQ\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&s"></img>

&#x20;

&#x20;        </div>

&#x20;   );

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;Using props

##### App.js





export const Greeting =(props)=> {

&#x20;

&#x20; return (

&#x20;   <div>

&#x20;   <h1>Hello,{props.name}!</h1>

&#x20;   <p>You are {props.age} years old.</p>

&#x20;

&#x20;   </div>

);

};

export const App=()=>{

&#x20; return(

&#x20;   <div>

&#x20;   <Greeting name="Aaa" age={25}/>

&#x20;   <Greeting name="Bbb" age={20}/>

&#x20;   </div>

&#x20; );

};



\-----------------------------------------------------------------------------------------------------------------------------

## &#x20;       Clock \[+ and -](without state)

##### Clock.js



import React from 'react'

export const Clock = () => {

&#x20;   let n=0;

&#x20;   const Plus =() =>{

&#x20;       n=n+1;

&#x20;       document.getElementById("res").textContent= n;

&#x20;   }

&#x20;   const Minus =() =>{

&#x20;       n=n-1;

&#x20;       document.getElementById("res").textContent= n;

&#x20;   }

&#x20; return (

&#x20;   <div>

&#x20;       <button onClick={Plus}>+</button>

&#x20;       <button onClick={Minus}>-</button>

&#x20;       <h1 id="res">{n}</h1>

&#x20;       </div>

&#x20; )

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;Clock \[+,-,0](with state)

##### Clock.js



import React,{useState} from 'react'

export const Clock = () => {

&#x20;   const \[count,setCount]=useState(0)

&#x20;   const Plus =() =>{

&#x20;     setCount(count+1);

&#x20;   }

&#x20;   const Minus =() =>{

&#x20;       setCount(count-1);

&#x20;   }

&#x20;   const Reset =() =>{

&#x20;       setCount(0);

&#x20;   }

&#x20; return (

&#x20;   <div>

&#x20;       <button onClick={Plus}>+</button>

&#x20;       <button onClick={Minus}>-</button>

&#x20;       <button onClick={Reset}>0</button>

&#x20;       <h1 >{count}</h1>

&#x20;       </div>

&#x20; )

}



\------------------------------------------------------------------------------------------------------------------------------

## &#x09;Clock \[+,-,0](with state , without external function call)

##### Clock.js



import React,{useState} from 'react'

export const Clock = () => {

&#x20;   const \[count,setCount]=useState(0)

&#x20; return (

&#x20;   <div style={{textAlign:"center"}}>

&#x20;       <button onClick={()=>setCount(count+1)}>+</button>

&#x20;       <button onClick={()=>setCount(count-1)}>-</button>

&#x20;       <button onClick={()=>setCount(0)}>0</button>

&#x20;       <h1 >{count}</h1>

&#x20;       </div>

&#x20; )

}



\---------------------------------------------------------------------------------------------------------------------------------

## &#x09;useEffect



#### Effecthook.js



import React,{useState,useEffect} from 'react'

export const Effecthook = () => {

&#x20;   const \[message,setMessage]=useState("Loading");

&#x20;   useEffect(()=>{

&#x20;       const timer=setTimeout(()=>{

&#x20;           setMessage("Hello, this is new effect");

&#x20;       },5000);

&#x20;       return ()=> clearTimeout(timer);

&#x20;   },\[]);

&#x20; return (

&#x20;   <div>

&#x20;       <h1>{message}</h1>

&#x20;   </div>

&#x20; );

}







#### Example:

import React, { useEffect } from "react";



export const Effecthook = () => {



&#x20; useEffect(() => {

&#x20;   alert("Component Loaded");

&#x20; }, \[]);



&#x20; return (

&#x20;   <div>

&#x20;     <h1>Hello React</h1>

&#x20;   </div>

&#x20; );

};



\-------------------------------------------------------------------------------------------------------------------

## &#x09;Login page (if-else)



#### LoginValidation.js



import React from 'react'

export const LoginValidation = () => {

&#x20;   const handleClick=()=>{

&#x20;       const n="sude";

&#x20;       const p="1234";

&#x20;       const name=document.getElementById("userid").value;

&#x20;       const password=document.getElementById("psid").value;

&#x20;       if(n==name \&\& p==password) document.getElementById("res").textContent="login successful";

&#x20;       else{

&#x20;           if(n!=name \&\& p!=password)  document.getElementById("ans").textContent=" name and password are incorrect - login failed, try again!";

&#x20;           else if(p!=password) document.getElementById("ans").textContent="password is incorrect - login failed, try again!";

&#x20;           else  document.getElementById("ans").textContent="name is incorrect - login failed, try again!";

&#x20;       }

&#x20;   }

&#x20; return (

&#x20;   <div style = {{color:"blue"}}>

&#x20;       <label>**Enter Name**</label>

&#x20;       <input type="text" id="userid"></input>

&#x20;       <br></br>

&#x20;       <br></br>

&#x20;       <label>**Enter Password**</label>

&#x20;       <input type="password" id="psid"></input>

&#x20;       <br></br>

&#x20;       <br></br>

&#x20;       <button id="bt" onClick={handleClick}>Login</button>

&#x20;       <h1 style={{color:"green"}} id="res"></h1>

&#x20;       <h1 style={{color:"red"}} id="ans"></h1>

&#x20;   </div>

&#x20; )

}



\-------------------------------------------------------------------------------------------------------------------------------

## &#x09;Login page (useState)



#### LoginValidation.js



import React,{useState} from 'react'

export const LoginValidation = () => {

&#x20;   const\[name,setName]=useState("")

&#x20;   const\[password,setPassword]=useState("")

&#x20;   const\[resultName,setResultName]=useState("")

&#x20;   const\[resultPassword,setResultPassword]=useState("")

&#x20;       const n="sude";

&#x20;       const p="1234";

&#x20;   const handleClick=()=>{

&#x20;      setResultName(name);

&#x20;      setResultPassword(password);

&#x20;       if(n==name \&\& p==password) document.getElementById("res").textContent="login successful";

&#x20;       else{

&#x20;           if(n!=name \&\& p!=password)  document.getElementById("ans").textContent=" name and password are incorrect - login failed, try again!";

&#x20;           else if(p!=password) document.getElementById("ans").textContent="password is incorrect - login failed, try again!";

&#x20;           else  document.getElementById("ans").textContent="name is incorrect - login failed, try again!";

&#x20;       }

&#x20;   }

&#x20; return (

&#x20;   <div style = {{color:"orange", background:"lightblue"}}>

&#x20;       <label>**Enter Name**</label>

&#x20;       <input type="text" value={name} onChange={(e) => setName(e.target.value)}></input>

&#x20;       <br></br>

&#x20;       <br></br>

&#x20;       <label>**Enter Password**</label>

&#x20;       <input type="password" value={password} onChange={(e) => setPassword(e.target.value)}></input>

&#x20;       <br></br>

&#x20;       <br></br>

&#x20;       <button id="bt" onClick={handleClick}>Login</button>

&#x20;       <h1 style={{color:"green"}} id="res"></h1>

&#x20;       <h1 style={{color:"red"}} id="ans"></h1>

&#x20;       <h1 style={{color:"blue"}}>{resultName}</h1>

&#x20;       <h1 style={{color:"blue"}}>{resultPassword}</h1>

&#x20;   </div>

&#x20; )

}



\-----------------------------------------------------------------------------------------------------------------------------------



## &#x09;Routing(single file)



#### MyRouting.js:



import React from 'react'

import {BrowserRouter, Routes, Route, Link} from "react-router-dom";

import {Home} from './Home';

import {About} from './About';

import {Contact} from './Contact';

export const MyRouting = () => {

&#x20; return (

&#x20;   <BrowserRouter>

&#x20;   <div style={{textAlign:"center"}}>

&#x20;   <h1>Routing example</h1>

&#x20;   <nav>

&#x20;       <Link to="/">Home | </Link>

&#x20;       <Link to="/about">About  | </Link>

&#x20;       <Link to="/contact">Contact </Link>

&#x20;   </nav>

&#x20;   <Routes>

&#x20;       <Route path="/" element={<h1> this is the home page output see on screen</h1>}/>

&#x20;       <Route path="/about" element={<h1> this is the about page output see on screen </h1>}/>

&#x20;       <Route path="/contact" element={<h1> this is the contact page output see on screen</h1>}/>

&#x20;   </Routes>

&#x20;   </div>

&#x20;   </BrowserRouter>

&#x20;

&#x20; );

}



\----------------------------------------------------------------------------------------------------------------------------------------------------



## &#x09;Routing(multiple file)







#### MyRouting.js:



import React from 'react'

import {BrowserRouter, Routes, Route, Link} from "react-router-dom";

import {Home} from './Home';

import {About} from './About';

import {Contact} from './Contact';

export const MyRouting = () => {

&#x20; return (

&#x20;   <BrowserRouter>

&#x20;   <div style={{textAlign:"center"}}>

&#x20;   <h1>Routing example</h1>

&#x20;   <nav>

&#x20;       <Link to="/">Home | </Link>

&#x20;       <Link to="/about">About  | </Link>

&#x20;       <Link to="/contact">Contact </Link>

&#x20;   </nav>

&#x20;   <Routes>

&#x20;       <Route path="/" element={<Home />}/>

&#x20;       <Route path="/about" element={<About />}/>

&#x20;       <Route path="/contact" element={<Contact />}/>

&#x20; </Routes>

&#x20;   </div>

&#x20;   </BrowserRouter>

&#x20;

&#x20; );

}



#### Home.js:



import React from 'react'



export const Home = () => {

&#x20; return (

&#x20;           <div style={{textAlign:"center"}}>

&#x20;       <h1>🏠 Home page</h1>

&#x20;       <h1 style={{color:"yellow"}}>Welcome to my website</h1>

&#x20;       </div>

&#x20; )

}



#### About.js



import React from 'react'



export const About = () => {

&#x20; return (

&#x20;   <div>

&#x20;       <h1>✅ About page</h1>

&#x20;       <h2 style={{color:"yellow"}}>This page includes the information regarding the website</h2>

&#x20;   </div>

&#x20; )

}



#### Contact.js



import React from 'react'



export const Contact = () => {

&#x20; return (

&#x20;   <div>

&#x20;       <h1>🤙 Contact us</h1>

&#x20;       <h2 style={{color:"yellow"}}>Reach out : website@gmail.com </h2>

&#x20;   </div>

&#x20; )

}



\--------------------------------------------------------------------------------------------------------------------------------------

## &#x09;Multiplication Table





#### Frontend: FrontendSpringboot.js (in vs code-react)



import React,{useState} from 'react'

export const FrontendSpringboot = () => {

&#x20; const\[msg,setMsg]=useState("");

&#x20;  const\[number,setNumber]=useState()

&#x20; function handleClick(){

&#x20;     fetch("http://localhost:8080/hello/"+number)

&#x20;     .then((res)=>res.text())

&#x20;     .then((data)=>setMsg(data));

&#x20; }

&#x20; return (

&#x20;   <div style={{textAlign:"center"}}>

&#x20;     <h1>This is REACT frontend page</h1>

&#x20;     <input type="number" value={number} onChange={(e)=>setNumber(e.target.value)}/>

&#x20;     <button onClick={handleClick}>Generate table</button>

&#x20;     <pre>Tables:{msg}</pre>

&#x20;   </div>

&#x20; )

}







#### Backend: backendvscode (in IntelliJ)



#### HelloController.java:



package com.example.backend\_vscode;

import org.springframework.web.bind.annotation.\*;



@RestController

@CrossOrigin(origins="http://localhost:3000")

public class HelloController {

&#x20;   private final HelloService service;

&#x20;   public HelloController(HelloService service){

&#x20;       this.service=service;

&#x20;   }

&#x20;   @GetMapping("/hello/{a}")

&#x20;   public String sayHello(@PathVariable int a){

&#x20;       return service.getTable(a);

&#x20;   }

&#x20;   /\*  fetch method from frontend using .then , it fetches only the first function not next upcoming contents

&#x20;   here it fetches only sayHello and not fetch sayHi

&#x20;   public String sayHi(){

&#x20;       return "Hi  from Spring Boot backend"; }

&#x20;   \*/

}



#### HelloService.java:



package com.example.backend\_vscode;

import org.springframework.stereotype.Service;



@Service

public class HelloService {

&#x20;   public String getTable(int a){

&#x20;       String res=" ";

&#x20;       for(int i=1;i<11;i++){

&#x20;           res += "\\n"+i+" \* " +a+" = "+(i\*a) ;

&#x20;       }

&#x20;   return res;

&#x20;   }

}



\-----------------------------------------------------------------------------------------------------------------------------



## &#x09;Login(frontend and backend)



#### Frontend: FrontendSpringboot.js (in vs code-react)



import React,{useState} from "react";



export const FrontendSpringboot = () => {

&#x20; const\[user,setUser]=useState("");

&#x20; const\[pswd,setPswd]=useState("");

&#x20; const handleclick=()=>{

&#x20;   fetch("http://localhost:8080/login",{

&#x20;     method:"POST",

&#x20;     headers:{"Content-Type":"application/json"},

&#x20;     body:JSON.stringify({username:user,password:pswd})

&#x20;   })

&#x20;   .then((res)=>res.text())

&#x20;   .then((data)=>alert(data))

&#x20;   .catch(()=>alert("Backend not reachable"));

&#x20; }

&#x20; return (

&#x20;   <div>

&#x20;     <h1>Login page</h1>

&#x20;     <input type="text" placeholder="Username" value={user} onChange={(e)=>setUser(e.target.value)}/>

&#x20;     <br/><br/>

&#x20;     <input type="password" placeholder="Password" value={pswd} onChange={(e)=>setPswd(e.target.value)}/>

&#x20;     <br/><br/>

&#x20;     <button onClick={handleclick}>Login</button>

&#x20;   </div>

&#x20; )

}





#### Backend: backendvscode (in IntelliJ)



#### LoginController.java:



package com.example.backend\_vscode;

import org.springframework.web.bind.annotation.\*;

@RestController

@CrossOrigin(origins="http://localhost:3000")

public class LoginController {

&#x20;   @PostMapping("/login")

&#x20;   public String login(@RequestBody UserLogin login){

&#x20;       if("sude".equals(login.getUsername()) \&\& "1234".equals(login.getPassword()))

&#x20;           return "From backend: Login successful";

&#x20;       else

&#x20;           return "Login failed";

&#x20;   }

&#x20;   static class UserLogin{

&#x20;       private String username;

&#x20;       private String password;

&#x20;       public String getUsername(){ return username;}

&#x20;       public void setUsername(String username){ this.username=username ;}

&#x20;       public String getPassword(){ return password;}

&#x20;       public void setPassword(String password){ this.password=password ;}



&#x20;   }

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;S-Single Responsibility Principle



#### Without SRP:



class PartyManager {

&#x20;   void playMusic() { System.out.println("Playing music..."); }

&#x20;   void cookFood() { System.out.println("Cooking food..."); }

&#x20;   void serveDrinks() { System.out.println("Serving drinks..."); }

}



#### With SRP:



public class Main{

&#x20;   public static void main(String\[] args){

&#x20;       Food c=new Food();



&#x20;       c.cookFood();

&#x20;   }

}

class Music {

&#x20;   void playMusic() {

System.out.println("Playing music...");

&#x20;}

}

class Food{

&#x20;   void cookFood() {

&#x20;System.out.println("Cooking food...");

&#x20;}

}

class Drink{

&#x20;   void serveDrinks() {

System.out.println("Serving drinks...");

&#x20;}

}





##### \------> You are building a LibraryManager class that handles book inventory, user registration, and fine calculation. The code works but is hard to maintain. Refactor the design so each class has a single responsibility



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       BookInventory i=new BookInventory();

&#x20;       UserRegistration u= new UserRegistration();

&#x20;       FineCalculation f=new FineCalculation();

&#x20;       i.inventory();

&#x20;       u.user();

&#x20;       f.fine();

&#x20;   }

}

class BookInventory {

&#x20;   void inventory(){

&#x20;       System.out.println("book stock is available");

&#x20;   }

}

class UserRegistration {

&#x20;   void user(){

&#x20;       System.out.println("User enrolled");

&#x20;   }

}

class FineCalculation {

&#x20;   void fine(){

&#x20;       System.out.println("Fine need to be pay ");

&#x20;   }

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;O-Open / Close Principle



#### Without OCP:



class DiscountCalculator {

&#x20;   double calculate(String type, double amount) {

&#x20;       if(type.equals("Diwali")) return amount \* 0.9;

&#x20;       else if(type.equals("NewYear")) return amount \* 0.8;

&#x20;       return amount;

&#x20;   }

}





#### With OCP:



interface Discount {

&#x20;   double calculate(double amount);

}

class DiwaliDiscount implements Discount {

&#x20;   public double calculate(double amount) {

&#x20;       return amount \* 0.9;

&#x20;   }

}

class NewYearDiscount implements Discount {



&#x20;   public double calculate(double amount) {



&#x20;       return amount \* 0.8;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Discount discount = new DiwaliDiscount();

&#x20;       Discount newyear = new NewYearDiscount();

&#x20;       System.out.println(discount.calculate(2000));

&#x20;       System.out.println(newyear.calculate(5000));



&#x20;   }

}

##### 

##### \-----> Your company introduces new types of discounts every festival season. The current FestivalDiscount class uses if-else chains to handle each case. Redesign the system so new discounts can be added without modifying existing code.



interface Discount {

&#x20;   double calculate(double amount);

}

class DiwaliDiscount implements Discount {

&#x20;   public double calculate(double amount) {

&#x20;       return amount \* 0.20;

&#x20;   }

}

class PongalDiscount implements Discount {

&#x20;   public double calculate(double amount) {

&#x20;       return amount \* 0.15;

&#x20;   }

}

class ChristmasDiscount implements Discount {

&#x20;   public double calculate(double amount) {

&#x20;       return amount \* 0.25;

&#x20;   }

}

class FestivalDiscount {



&#x20;   public double getDiscount(Discount discount, double amount) {

&#x20;       return discount.calculate(amount);

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       FestivalDiscount fd = new FestivalDiscount();

&#x20;       Discount d1 = new DiwaliDiscount();

&#x20;       System.out.println("Diwali Discount = " + fd.getDiscount(d1, 1000));

&#x20;       Discount d2 = new PongalDiscount();

&#x20;       System.out.println("Pongal Discount = " + fd.getDiscount(d2, 1000));

&#x20;       Discount d3 = new ChristmasDiscount();

&#x20;       System.out.println("Christmas Discount = " + fd.getDiscount(d3, 1000));

&#x20;   }

}





\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;L-Liskov Substitution Principle



#### Without LSP:



class Bird {

&#x20;   void fly() { System.out.println("Flying..."); }

}

class Ostrich extends Bird {

&#x20;   void fly() { throw new UnsupportedOperationException(); }

}





#### With LSP:

##### With Class:



class Bird {

&#x20;   void fly() { System.out.println("Flying..."); }

}



class Pegion extends Bird {

&#x20;   void fly() { System.out.println("I can Fly........."); }

}



class Ostrich extends Bird {

&#x20;   void fly() { throw new UnsupportedOperationException(); }

}



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Pegion p = new Pegion();

&#x20;       p.fly();

&#x20;       Ostrich o = new Ostrich();

&#x20;       o.fly();

&#x20;   }

}





##### With Interface:



interface Bird {

&#x20;   public void fly();

}



class Pegion implements Bird { //Pegion -> Bird (Obeys LSP)

&#x20;   public void fly() { System.out.println("I can Fly........."); }

}



class Ostrich implements Bird { // Ostrich -> Bird (Violates LSP)

&#x20;   public void fly() { throw new UnsupportedOperationException(); }

}



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Pegion p = new Pegion();

&#x20;       p.fly();

&#x20;       Ostrich o = new Ostrich();

&#x20;       o.fly();

&#x20;   }

}





##### \---->You have a Shape base class with a calculateArea() method. A Line subclass throws an exception when calculateArea() is called. Redesign the hierarchy so all subclasses can be substituted without breaking functionality



abstract class AreaShape {

&#x20;   abstract double calculateArea();

}

class Rectangle extends AreaShape {

&#x20;   double length;

&#x20;   double width;

&#x20;   Rectangle(double length,double width){

&#x20;       this.length=length;

&#x20;       this.width=width;

&#x20;}

&#x20;   double calculateArea(){

&#x20;       return length \* width;

&#x20;   }

}

class Circle extends AreaShape {

&#x20;   double radius;

&#x20;   Circle(double radius){

&#x20;       this.radius=radius; }

&#x20;   double calculateArea(){

&#x20;       return 3.14 \* radius \* radius;

&#x20;   }

}

class Line {

&#x20;   double length;

&#x20;   Line(double length){

&#x20;       this.length=length;

&#x20;  }

&#x20;   double getLength(){

&#x20;       return length;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       AreaShape s1 =new Rectangle(10,5);

&#x20;       AreaShape s2 =new Circle(7);

&#x20;       System.out.println(s1.calculateArea());

&#x20;       System.out.println(s2.calculateArea());

&#x20;       Line l = new Line(20);

&#x20;       System.out.println(l.getLength());

&#x20;   }

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;I-Interface Segregation Principle



#### Without ISP:



interface RestaurantService {

&#x20;   void orderStarter();

&#x20;   void orderMainCourse();

&#x20;   void orderDessert();

}



class FastFood implements RestaurantService {

&#x20;   public void orderStarter() { throw new UnsupportedOperationException(); }

&#x20;   public void orderMainCourse() { System.out.println("Burger ordered..."); }

&#x20;   public void orderDessert() { throw new UnsupportedOperationException(); }

}







#### With ISP:



interface StarterService {

&#x20;   void orderStarter();

}

interface MainCourseService {

&#x20;   void orderMainCourse();

}

interface DessertService {

&#x20;   void orderDessert();

}

class FullCourseRestaurant implements StarterService, MainCourseService, DessertService {

&#x20;   public void orderStarter() {

&#x20;       System.out.println("Soup ordered...");

&#x20;   }

&#x20;   public void orderMainCourse() {

&#x20;       System.out.println("Biryani ordered...");

&#x20;   }

&#x20;   public void orderDessert() {

&#x20;       System.out.println("Ice Cream ordered...");

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       FullCourseRestaurant res = new FullCourseRestaurant();

&#x20;       res.orderStarter();

&#x20;       res.orderMainCourse();

&#x20;       res.orderDessert();

&#x20;   }

}



##### \------> You created a SmartDevice interface with methods playMusic(), makeCall(), and browseInternet(). A BasicPhone class implements it but throws exceptions for unsupported features. Split the interface so classes only implement what they actually support.



interface Calling {

&#x20;   void call();

}



interface Music {

&#x20;   void playMusic();

}

class BasicPhone implements Calling {

&#x20;   public void call() {

&#x20;       System.out.println("Calling from Basic Phone...");

&#x20;   }

}

class SmartPhone implements Calling, Music {

&#x20;   public void call() {

&#x20;       System.out.println("Calling from Smart Phone...");

&#x20;   }

&#x20;   public void playMusic() {

&#x20;       System.out.println("Playing Music...");

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       BasicPhone bp = new BasicPhone();

&#x20;       bp.call();

&#x20;       System.out.println();

&#x20;       SmartPhone sp = new SmartPhone();

&#x20;       sp.call();

&#x20;       sp.playMusic();

&#x20;   }

}

\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;D-Dependency Inversion Principle



#### Without DIP:



class Remote {

&#x20;   private SonyTV tv = new SonyTV();

&#x20;   void pressPower() { tv.turnOn(); }

}



class SonyTV {

&#x20;   void turnOn() { System.out.println("Sony TV ON"); }

}



#### With DIP:



interface TV {

&#x20;   void turnOn();

}

class SonyTV implements TV {

&#x20;   public void turnOn() {

&#x20;       System.out.println("Sony TV ON");

&#x20;   }

}

class Remote {

&#x20;   private TV tv;

&#x20;   Remote(TV tv) {

&#x20;       this.tv = tv;

&#x20;   }

&#x20;   void pressPower() {

&#x20;       tv.turnOn();

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       TV sony = new SonyTV();

&#x20;       Remote remote = new Remote(sony);

&#x20;       remote.pressPower();

&#x20;    }

}





##### \-----> Your OrderService directly depends on a MySQLDatabase class. Later, the team wants to switch to PostgreSQL. Refactor the design so OrderService depends on an abstraction, making database swaps easy





interface Database {



&#x20;   void saveOrder();

}

class MySQLDatabase implements Database {



&#x20;   public void saveOrder() {

&#x20;       System.out.println("Order saved in MySQL");

&#x20;   }

}

class PostgreSQLDatabase implements Database {



&#x20;   public void saveOrder() {

&#x20;       System.out.println("Order saved in PostgreSQL");

&#x20;   }

}

class OrderService {

&#x20;   private Database db;

&#x20;   OrderService(Database db) {

&#x20;       this.db = db;

&#x20;   }

&#x20;   void placeOrder() {

&#x20;       db.saveOrder();

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Database db = new MySQLDatabase();

&#x20;       OrderService order = new OrderService(db);

&#x20;       order.placeOrder();

&#x20;   }

}

\-----------------------------------------------------------------------------------------------------------------------------

# &#x09;	Design Patterns



## &#x09;	Creational Patterns



### &#x09;	Factory Method

##### **Question:**



if(type.equals("SUV")) {

&#x20;   car = new SUV();

} else if(type.equals("Sedan")) {

&#x20;   car = new Sedan();

}





##### Without factory method:



interface Car {

&#x20;   void drive();

}

class SUV implements Car {

&#x20;   public void drive() { System.out.println("Driving an SUV"); }

}

class Sedan implements Car {

&#x20;   public void drive() { System.out.println("Driving a Sedan"); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Car car1 = new SUV();

&#x20;       car1.drive();

&#x20;       Car car2 = new Sedan();

&#x20;       car2.drive();

&#x20;   }

}





##### With factory method:



interface Car {

&#x20;   void drive();

}

class SUV implements Car {

&#x20;   public void drive() { System.out.println("Driving an SUV"); }

}

class Sedan implements Car {

&#x20;   public void drive() { System.out.println("Driving a Sedan"); }

}

class CarFactory {

&#x20;   public static Car createCar(String type) {

&#x20;       if(type.equalsIgnoreCase("SUV")) {

&#x20;           return new SUV();

&#x20;       } else if(type.equalsIgnoreCase("Sedan")) {

&#x20;           return new Sedan();

&#x20;       }

&#x20;       return null; // or throw exception

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Car car1 = CarFactory.createCar("SUV");

&#x20;       car1.drive();

&#x20;       Car car2 = CarFactory.createCar("Sedan");

&#x20;       car2.drive();

&#x20;   }

}



##### **Question:**



if(type.equals("CreditCard")) {

&#x20;   payment = new CreditCardPayment();

} else if(type.equals("PayPal")) {

&#x20;   payment = new PayPalPayment();

} else {

&#x20;   payment = null;

}



Problem Statement:

You are building a Payment System.

Right now, the code directly creates objects like

new CreditCardPayment() or new PayPalPayment() using if/else.

This makes the code messy and hard to extend when new payment methods are added.



Your Task:

1\. Write the bad code where payments are created using if/else.

2\. Refactor it using a PaymentFactory class that decides which payment object to create.

3\. Add a new payment type (e.g., UPIPayment) and show how easy it is to extend with the factory.



Deliverables:

\- Create a Payment interface.

\- Implement CreditCardPayment, PayPalPayment, and UPIPayment classes.

\- Implement a PaymentFactory class that returns the correct object.

\- Show usage in a Main class.



##### Without factory method:



interface Pay { void Transfer(); }

class UPI implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using UPI");

&#x20;       }

}

class PayPal implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using PayPal");

&#x20;   }

}

class CreditCard implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using CreditCard");

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Pay c = new CreditCard();

&#x20;       c.Transfer();

&#x20;       Pay p = new PayPal();

&#x20;       p.Transfer();

&#x20;       Pay u = new UPI();

&#x20;       u.Transfer();

}

}



##### With factory method:



interface Pay { void Transfer(); }

class UPI implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using UPI");

&#x20;       }

}

class PayPal implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using PayPal");

&#x20;   }

}

class CreditCard implements Pay {

&#x20;   public void Transfer() {

&#x20;       System.out.println("Payment using CreditCard");

&#x20;   }

}

class PayFactory {

&#x20;   public static Pay createPayment(String type) {

&#x20;       if(type.equals("CreditCard")) { return new CreditCard(); }

&#x20;       else if(type.equals("PayPal")) { return new PayPal();  }

&#x20;       else if(type.equals("UPI")) { return new UPI(); }

&#x20;        return null;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Pay payment = PayFactory.createPayment("UPI");

&#x20;       payment.Transfer();

&#x20;   }

}



\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;		Factory Method

#### **Question 1:**

##### Tightly coupled:



**class VictorianChair {}**

**class VictorianTable {}**

**class ModernChair {}**

**class ModernTable {}**

**public class Main {**

&#x20;   **public static void main(String\[] args) {**

&#x20;       **VictorianChair chair = new VictorianChair();**

&#x20;       **VictorianTable table = new VictorianTable();**

&#x20;       **ModernChair chair2 = new ModernChair();**

&#x20;       **ModernTable table2 = new ModernTable();**

&#x20;   **}**

**}**



##### Loosely coupled:



interface Chair { void sit(); }

interface Table { void use(); }

class VictorianChair implements Chair {

&#x20;   public void sit() { System.out.println("Sitting on Victorian Chair"); }

}

class VictorianTable implements Table {

&#x20;   public void use() { System.out.println("Using Victorian Table"); }

}

class ModernChair implements Chair {

&#x20;   public void sit() { System.out.println("Sitting on Modern Chair"); }

}

class ModernTable implements Table {

&#x20;   public void use() { System.out.println("Using Modern Table"); }

}

interface FurnitureFactory {

&#x20;   Chair createChair();

&#x20;   Table createTable();

}

class VictorianFactory implements FurnitureFactory {

&#x20;   public Chair createChair() { return new VictorianChair(); }

&#x20;   public Table createTable() { return new VictorianTable(); }

}

class ModernFactory implements FurnitureFactory {

&#x20;   public Chair createChair() { return new ModernChair(); }

&#x20;   public Table createTable() { return new ModernTable(); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       FurnitureFactory factory = new VictorianFactory();

&#x20;       Chair chair = factory.createChair();

&#x20;       Table table = factory.createTable();

&#x20;       chair.sit();

&#x20;       table.use();

&#x20;       factory = new Modern Factory();

&#x20;       Chair chair2 = factory.createChair();

&#x20;       Table table2 = factory.createTable();

&#x20;       chair2.sit();

&#x20;       table2.use();

&#x20;   }

}



#### **Question 2:**



interface Checkbox { void clickc(); }

interface Button { void clickb(); }

class WindowsCheckbox implements Checkbox {

&#x20;   public void clickc() { System.out.println("windows checkbox"); }

}

class WindowsButton implements Button {

&#x20;   public void clickb() { System.out.println("windows button"); }

}

class MacCheckbox implements Checkbox {

&#x20;   public void clickc() { System.out.println("mac checkbox"); }

}

class MacButton implements Button {

&#x20;   public void clickb() { System.out.println("mac button"); }

}

interface ToolFactory {

&#x20;   Checkbox createCheckbox();

&#x20;   Button createButton();

}

class WindowFactory implements  ToolFactory {

&#x20;   public Checkbox createCheckbox() { return new WindowsCheckbox(); }

&#x20;   public Button createButton() { return new WindowsButton(); }

}

class MacFactory implements ToolFactory {

&#x20;   public Checkbox createCheckbox() { return new MacCheckbox(); }

&#x20;   public Button createButton() { return new MacButton(); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       ToolFactory factory = new WindowFactory();

&#x20;       Checkbox checkbox = factory.createCheckbox();

&#x20;       Button button = factory.createButton();

&#x20;       checkbox.clickc();

&#x20;       button.clickb();

&#x20;       factory = new MacFactory();

&#x20;       Checkbox checkbox2 = factory.createCheckbox();

&#x20;       Button button2 = factory.createButton();

&#x20;       checkbox2.clickc();

&#x20;       button2.clickb();

&#x20;   }

}



\---------------------------------------or-----------------------------



interface Button { void button(); }

interface Checkbox { void check(); }

class Windows implements Button, Checkbox {

&#x20;   public void button() { System.out.println("Windows Button"); }

&#x20;   public void check() { System.out.println("Windows Checkbox"); }

}

class Mac implements Button, Checkbox {

&#x20;   public void button() { System.out.println("Mac Button"); }

&#x20;   public void check() { System.out.println("Mac Checkbox"); }

}

interface GUIFactory {

&#x20;   Button createButton();

&#x20;   Checkbox createCheckbox();

}

class WindowsFactory implements GUIFactory {

&#x20;   public Button createButton() { return new Windows();}

&#x20;   public Checkbox createCheckbox() { return new Windows(); }

}

class MacFactory implements GUIFactory {

&#x20;   public Button createButton() { return new Mac(); }

&#x20;   public Checkbox createCheckbox() { return new Mac(); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       GUIFactory factory = new WindowsFactory();

&#x20;       Button button = factory.createButton();

&#x20;       Checkbox checkbox = factory.createCheckbox();

&#x20;       button.button();

&#x20;       checkbox.check();

&#x20;       factory = new MacFactory();

&#x20;       button = factory.createButton();

&#x20;       checkbox = factory.createCheckbox();

&#x20;       button.button();

&#x20;       checkbox.check();

&#x20;   } }

&#x20;

\-----------------------------------------------------------------------------------------------------------------------------

## &#x09;	Singleton

#### **Question 1:**



##### Bad code

class Scoreboard {

&#x20;   private int score;



&#x20;   public void addPoints(int points) {

&#x20;       score += points;

&#x20;       System.out.println("Score updated: " + score);

&#x20;   }



&#x20;   public int getScore() {

&#x20;       return score;

&#x20;   }

}



public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       // Two players, two different scoreboards

&#x20;       Scoreboard player1Board = new Scoreboard();

&#x20;       Scoreboard player2Board = new Scoreboard();



&#x20;       player1Board.addPoints(10); // Score updated: 10

&#x20;       player2Board.addPoints(20); // Score updated: 20



&#x20;       // Confusing: two separate scores!

&#x20;       System.out.println("Player1 Scoreboard: " + player1Board.getScore()); // 10

&#x20;       System.out.println("Player2 Scoreboard: " + player2Board.getScore()); // 20

&#x20;   }

}





##### Good code



class Scoreboard {

&#x20;   private static Scoreboard instance;

&#x20;   private int score;

&#x20;   private Scoreboard() {

&#x20;       score = 0;

&#x20;       System.out.println("Scoreboard created!");

&#x20;   }

&#x20;   public static Scoreboard getInstance() {

&#x20;       if (instance == null) {

&#x20;           instance = new Scoreboard();

&#x20;       }

&#x20;       return instance;

&#x20;   }

&#x20;   public void addPoints(int points) {

&#x20;       score += points;

&#x20;       System.out.println("Score updated: " + score);

&#x20;   }

&#x20;   public int getScore() {

&#x20;       return score;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;

&#x20;       Scoreboard player1Board = Scoreboard.getInstance();

&#x20;       Scoreboard player2Board = Scoreboard.getInstance();

&#x20;       player1Board.addPoints(10);

&#x20;       player2Board.addPoints(20);

&#x20;       System.out.println("Final Score: " + player1Board.getScore());

&#x20;       System.out.println(player1Board == player2Board);

&#x20;   }

}



#### **Question 2:**



Task: Create a DatabaseConnection class as a Singleton

Requirements:

1\. Only one connection object should exist.

2\. Provide a getInstance() method to access it.

3\. Demonstrate in Main that multiple calls return the same object.





class DatabaseConnection {

&#x20;   private static DatabaseConnection instance;

&#x20;   private DatabaseConnection() {

&#x20;       System.out.println("Database Connection Created!");

&#x20;   }

&#x20;   public static DatabaseConnection getInstance() {

&#x20;       if(instance == null) {

&#x20;           instance = new DatabaseConnection();

&#x20;       }

&#x20;       return instance;

&#x20;   }

&#x20;  }

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       DatabaseConnection db1 = DatabaseConnection.getInstance();

&#x20;       DatabaseConnection db2 = DatabaseConnection.getInstance();

&#x20;       System.out.println(db1 == db2);

&#x20;   }

}



\--------------------------------------------------------------------------------------------------------------------------

## &#x09;	Builder

#### **Question 1:**



##### Bad code



class Pizza {

&#x20;   private String dough;

&#x20;   private String sauce;

&#x20;   private String topping;

&#x20;   public Pizza(String dough, String sauce, String topping) {

&#x20;       this.dough = dough;

&#x20;       this.sauce = sauce;

&#x20;       this.topping = topping;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;   Pizza pizza = new Pizza("Thin Crust", "Tomato", "Cheese");

&#x20;   }

}



##### Good code



class Pizza {

&#x20;   private String dough;

&#x20;   private String sauce;

&#x20;   private String topping;

&#x20;   private Pizza(PizzaBuilder builder) {

&#x20;       this.dough = builder.dough;

&#x20;       this.sauce = builder.sauce;

&#x20;       this.topping = builder.topping;

&#x20;   }

&#x20;   public static class PizzaBuilder {

&#x20;       private String dough;

&#x20;       private String sauce;

&#x20;       private String topping;

&#x20;       public PizzaBuilder setDough(String dough) {

&#x20;           this.dough = dough;

&#x20;           return this;

&#x20;       }

&#x20;       public PizzaBuilder setSauce(String sauce) {

&#x20;           this.sauce = sauce;

&#x20;           return this;

&#x20;       }

&#x20;       public PizzaBuilder setTopping(String topping) {

&#x20;           this.topping = topping;

&#x20;           return this;

&#x20;       }

&#x20;       public Pizza build() { return new Pizza(this); }

&#x20;   }

&#x20;   public void showPizza() { System.out.println("Pizza with " + dough + ", " + sauce + ", " + topping); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Pizza pizza = new Pizza.PizzaBuilder()

&#x20;                           .setDough("Thin Crust")

&#x20;                           .setSauce("Tomato")

&#x20;                           .setTopping("Cheese")

&#x20;                           .build();

&#x20;       pizza.showPizza(); 

&#x20;   }

}





#### **Question 2:**



TASK:

Task: Create a Computer class using Builder Pattern

Requirements:

1\. Computer should have CPU, RAM, Storage, and GPU.

2\. Use a ComputerBuilder to set these values step by step.

3\. Demonstrate in Main how to build different configurations:

&#x20;   - Gaming PC (high RAM + GPU)

&#x20;   - Office PC (basic CPU + storage)





class Computer {

&#x20;   private String CPU;

&#x20;   private String RAM;

&#x20;   private String Storage;

&#x20;       private String GPU;



&#x20;   private Computer(Builder builder) {

&#x20;       this.CPU = builder.CPU;

&#x20;       this.RAM = builder.RAM;

&#x20;       this.Storage = builder.Storage;

&#x20;       this.GPU = builder.GPU;

&#x20;   }

&#x20;   public static class Builder {

&#x20;       private String CPU;

&#x20;       private String RAM;

&#x20;       private String Storage;

&#x20;       private String GPU;

&#x20;       public Builder setCPU(String CPU) {

&#x20;           this.CPU = CPU;

&#x20;           return this;

&#x20;       }

&#x20;       public Builder setRAM(String RAM) {

&#x20;           this.RAM = RAM;

&#x20;           return this;

&#x20;       }

&#x20;       public Builder setStorage(String Storage) {

&#x20;           this.Storage = Storage;

&#x20;           return this;

&#x20;       }

&#x20;        public Builder setGPU(String GPU) {

&#x20;           this.GPU = GPU;

&#x20;           return this;

&#x20;       }

&#x20;       public Computer build() { return new Computer(this); }

&#x20;   }

&#x20;   public void showComputer() { System.out.println("Computer with " + CPU + ", " + RAM + ", " + Storage +" , "+GPU); }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Computer gaming = new Computer.Builder()

&#x20;               .setCPU("Intel i9")

&#x20;               .setRAM("32 GB")

&#x20;               .setStorage("1 TB SSD")

&#x20;               .setGPU("NVIDIA RTX 4080")

&#x20;               .build();

&#x20;       gaming.showComputer(); 

&#x20;       Computer office = new Computer.Builder()

&#x20;               .setCPU("Intel i3")

&#x20;               .setRAM("8 GB")

&#x20;               .setStorage("512 GB SSD")

&#x20;               .setGPU("Integrated Graphics")

&#x20;               .build();

&#x20;       office.showComputer(); 

&#x20;   }

}



\--------------------------------------------------------------------------------------------------------------------------

## &#x09;	Prototype

#### **Question 1:**



##### Bad code



class Document {

&#x20;   String content;

&#x20;   String author;

&#x20;   public Document(String content, String author) {

&#x20;       this.content = content;

&#x20;       this.author = author;

&#x20;   }

&#x20;   public void show() {

&#x20;       System.out.println("Document: " + content + " by " + author);

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Document doc1 = new Document("Design Patterns", "Sylvia");

&#x20;       Document doc2 = new Document(doc1.content, doc1.author);

&#x20;       doc1.show(); 

&#x20;       doc2.show(); 

&#x20;   }

}





##### Good code



interface Prototype {

&#x20;   Prototype clone();

}

class Document implements Prototype {

&#x20;   String content;

&#x20;   String author;

&#x20;   public Document(String content, String author) {

&#x20;       this.content = content;

&#x20;       this.author = author;

&#x20;   }

&#x20;   @Override

&#x20;   public Prototype clone() {

&#x20;       return new Document(content, author);

&#x20;   }

&#x20;   public void show() {

&#x20;       System.out.println("Document: " + content + " by " + author);

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Document doc1 = new Document("Design Patterns", "Sylvia");

&#x20;       Document doc2 = (Document) doc1.clone();

&#x20;       doc1.show(); 

&#x20;       doc2.show(); 

&#x20;   }

}



#### **Question 2:**



TASK:

Task: Create a Shape class hierarchy using Prototype Pattern

Requirements:

1\. Define a Prototype interface with clone().

2\. Implement Circle and Rectangle classes that can be cloned.

3\. Demonstrate in Main how to copy shapes without re‑creating them manually.





interface Prototype {

&#x20;   Prototype clone();

}

class Circle implements Prototype {

&#x20;   String color;

&#x20;   public Circle(String color) {

&#x20;       this.color = color;

&#x20;   }

&#x20;   public Prototype clone() {

&#x20;       return new Circle(color);

&#x20;   }

&#x20;   public void show() {

&#x20;       System.out.println("Circle Color : " + color);

&#x20;   }

}

class Rectangle implements Prototype {

&#x20;   String color;

&#x20;   public Rectangle(String color) {

&#x20;       this.color = color;

&#x20;   }

&#x20;   public Prototype clone() {

&#x20;       return new Rectangle(color);

&#x20;   }

&#x20;   public void show() {

&#x20;       System.out.println("Rectangle Color : " + color);

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Circle c1 = new Circle("Red");

&#x20;       Circle c2 = (Circle) c1.clone();

&#x20;       Rectangle r1 = new Rectangle("Blue");

&#x20;       Rectangle r2 = (Rectangle) r1.clone();

&#x20;       c1.show();

&#x20;       c2.show();

&#x20;       r1.show();

&#x20;       r2.show();

&#x20;   }

}



\--------------------------------------------------------------------------------------------------------------------------







