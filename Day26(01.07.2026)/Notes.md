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

&#x20;        <img id="res" onClick={handleClick} src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKBG31ebB3TtvujGzoS2l99z4Q1ez7902rWQ\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&s"></img>

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

## &#x09;	Structural Patterns

## &#x09;		Adapter

#### **Question 1:**



##### Bad code

interface Charger {

&#x20;   void charge();

}



// Existing USPlug class (incompatible)

class USPlug {

&#x20;   public void supplyPower() {

&#x20;       System.out.println("Power from US plug (110V)");

&#x20;   }

}



// Client tries to use USPlug directly

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       // ERROR: USPlug doesn't match Charger interface

&#x20;       Charger charger = new USPlug();

&#x20;       charger.charge();

&#x20;   }

}



##### Good code



interface Charger {

&#x20;   void charge();

}

class USPlug {

&#x20;   void supplyPower() {

&#x20;       System.out.println("Power from US plug (110V)");

&#x20;   }

}

class Adapter implements Charger {

&#x20;   USPlug plug = new USPlug();

&#x20;   public void charge() {

&#x20;       plug.supplyPower();

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Adapter charger = new Adapter();

&#x20;       charger.charge();

&#x20;   }

}





\-----------------> This is fine, but it reduces flexibility. A more reusable approach is to inject the USPlug via the constructor:



##### Good code



interface Charger {

&#x20;   void charge();

}

class USPlug {

&#x20;   public void supplyPower() {

&#x20;       System.out.println("Power from US plug (110V)");

&#x20;   }

}

class Adapter implements Charger {

&#x20;   private USPlug usplug;

&#x20;   public Adapter(USPlug usplug) {

&#x20;       this.usplug = usplug;

&#x20;   }



&#x20;   @Override

&#x20;   public void charge() {

&#x20;       usplug.supplyPower();

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       USPlug usplug = new USPlug();

&#x20;       Adapter charger = new Adapter(usplug);

&#x20;       charger.charge();

&#x20;   }

}





#### **Question 2:**



Database Drivers

Suppose your app expects Database.connect().

MySQL, PostgreSQL, MongoDB all expose different connection methods.

An Adapter lets you swap databases without rewriting client code.



##### Bad code



class PostgresDB {

&#x20;   public void connectPostgres() {

&#x20;       System.out.println("Connected to PostgreSQL ");

&#x20;   }

}



public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       PostgresDB db = new PostgresDB();

&#x20;       db.connectPostgres(); // Works only for Postgres

&#x20;   }

}



##### Good code



interface Database {

&#x20;   void connect();

}



class PostgresDB {

&#x20;   public void connectPostgresDB() {

&#x20;       System.out.println("Connected to PostgreSQL ");

&#x20;   }

}



class MongoDB {

&#x20;   public void connectMongoDb() {

&#x20;       System.out.println("Connected to MongoDB ");

&#x20;   }

}



class MySQL {

&#x20;   public void connectMySQL() {

&#x20;       System.out.println("Connected to MySQL ");

&#x20;   }

}



class PostgresAdapter implements Database {

&#x20;   private PostgresDB pdb;

&#x20;

&#x20;   public PostgresAdapter(PostgresDB pdb) {

&#x20;       this.pdb = pdb;

&#x20;   }



&#x20;   @Override

&#x20;   public void connect() {

&#x20;       pdb.connectPostgresDB();

&#x20;   }

}



class MongoAdapter implements Database {

&#x20;   private MongoDB mdb;

&#x20;

&#x20;   public MongoAdapter(MongoDB mdb) {

&#x20;       this.mdb = mdb;

&#x20;   }



&#x20;   @Override

&#x20;   public void connect() {

&#x20;       mdb.connectMongoDb();

&#x20;   }

}



class SqlAdapter implements Database {

&#x20;   private MySQL sdb;

&#x20;

&#x20;   public SqlAdapter(MySQL sdb) {

&#x20;       this.sdb = sdb;

&#x20;   }



&#x20;   @Override

&#x20;   public void connect() {

&#x20;       sdb.connectMySQL();

&#x20;   }

}



public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Database postgres = new PostgresAdapter(new PostgresDB());

&#x20;       postgres.connect();



&#x20;       Database mongo = new MongoAdapter(new MongoDB());

&#x20;       mongo.connect();



&#x20;       Database mySql = new SqlAdapter(new MySQL());

&#x20;       mySql.connect();

&#x20;   }

}



\-------------------------------------------------------------------------------------------------------

## &#x09;	Decorator

#### **Question 1:**



##### Bad code



class Coffee {

&#x20;   public String getDescription() {

&#x20;       return "Plain Coffee";

&#x20;   }

}

class CoffeeWithMilk extends Coffee {

&#x20;   @Override

&#x20;   public String getDescription() {

&#x20;       return "Plain Coffee + Milk";

&#x20;   }

}

class CoffeeWithCaramel extends Coffee {

&#x20;   @Override

&#x20;   public String getDescription() {

&#x20;       return "Plain Coffee + Caramel";

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Coffee c1 = new CoffeeWithMilk();

&#x20;       System.out.println(c1.getDescription()); // Plain Coffee + Milk



&#x20;       Coffee c2 = new CoffeeWithCaramel();

&#x20;       System.out.println(c2.getDescription()); // Plain Coffee + Caramel

&#x20;   }

}



##### Good code



interface Coffee {---------------------------------------//Component interface

&#x20;   String getDescription();

}

class PlainCoffee implements Coffee {---------------------//Concrete component

&#x20;   public String getDescription() {

&#x20;       return "Plain Coffee";

&#x20;   }

}

abstract class CoffeeDecorator implements Coffee {---------------------//Decorator base

&#x20;   protected Coffee coffee;

&#x20;   public CoffeeDecorator(Coffee coffee) {

&#x20;       this.coffee = coffee;

&#x20;   }

&#x20;   public String getDescription() {

&#x20;       return coffee.getDescription();

&#x20;   }

}

class MilkDecorator extends CoffeeDecorator { ---------------------//Concrete Decorators

&#x20;   public MilkDecorator(Coffee coffee) {

&#x20;       super(coffee);

&#x20;   }

&#x20;   public String getDescription() {

&#x20;       return super.getDescription() + " + Milk";

&#x20;   }

}

class CaramelDecorator extends CoffeeDecorator {-------------------//Concrete Decorators

&#x20;   public CaramelDecorator(Coffee coffee) {

&#x20;       super(coffee);

&#x20;   }

&#x20;   public String getDescription() {

&#x20;       return super.getDescription() + " + Caramel";

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Coffee c1 = new MilkDecorator(new PlainCoffee());

&#x20;       System.out.println(c1.getDescription());

&#x20;       Coffee c2 = new CaramelDecorator(new MilkDecorator(new PlainCoffee()));

&#x20;       System.out.println(c2.getDescription());

&#x20;   }

}





#### **Question 2:**



TASK:

Problem:

You are building a Notification System. Right now, you can only send a plain text message.

But sometimes you want to add extra features like:

\- Sending with Email

\- Sending with SMS

\- Sending with WhatsApp





##### code



interface Notification {

&#x20;   String getMessage();

}

class Message implements Notification {



&#x20;   public String getMessage() {

&#x20;       return "Text Message";

&#x20;   }

}

abstract class MessageDecorator implements Notification {



&#x20;   protected Notification msg;



&#x20;   public MessageDecorator(Notification msg) {

&#x20;       this.msg = msg;

&#x20;   }

}

class Email extends MessageDecorator {



&#x20;   public Email(Notification msg) {

&#x20;       super(msg);

&#x20;   }

&#x20;   public String getMessage() {

&#x20;       return msg.getMessage() + " + Email";

&#x20;   }

}

class SMS extends MessageDecorator {

&#x20;   public SMS(Notification msg) {

&#x20;       super(msg);

&#x20;   }

&#x20;   public String getMessage() {

&#x20;       return msg.getMessage() + " + SMS";

&#x20;   }

}

class WhatsApp extends MessageDecorator {

&#x20;   public WhatsApp(Notification msg) {

&#x20;       super(msg);

&#x20;   }

&#x20;   public String getMessage() {

&#x20;       return msg.getMessage() + " + WhatsApp";

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Notification msg = new Message();

&#x20;       Notification email = new Email(msg);

&#x20;       System.out.println(email.getMessage());

&#x20;       Notification sms = new SMS(msg);

&#x20;       System.out.println(sms.getMessage());

&#x20;       Notification whatsapp = new WhatsApp(msg);

&#x20;       System.out.println(whatsapp.getMessage());

&#x20;   }

}

\-------------------------------------------------------------------------------------------------

## &#x09;	Composite

#### **Question 1:**



##### Bad code



class MenuItem {

&#x20;   private String name;

&#x20;   public MenuItem(String name) { this.name = name; }

&#x20;   public void show() { System.out.println("Item: " + name); }

}



// Menu class (no common interface)

class Menu {

&#x20;   private String name;

&#x20;   private List<MenuItem> items = new ArrayList<>();

&#x20;   public Menu(String name) { this.name = name; }

&#x20;   public void addItem(MenuItem item) { items.add(item); }

&#x20;   public void show() {

&#x20;       System.out.println("Menu: " + name);

&#x20;       for (MenuItem i : items) {

&#x20;           i.show();

&#x20;       }

&#x20;   }

}



// Client

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       MenuItem burger = new MenuItem("Burger");

&#x20;       MenuItem fries = new MenuItem("Fries");



&#x20;       Menu fastFood = new Menu("Fast Food");

&#x20;       fastFood.addItem(burger);

&#x20;       fastFood.addItem(fries);



&#x20;       fastFood.show();

&#x20;   }

}



##### Good code



interface MenuComponent {

&#x20;   void show();

}



// Leaf: MenuItem

class MenuItem implements MenuComponent {

&#x20;   private String name;

&#x20;   public MenuItem(String name) { this.name = name; }

&#x20;   public void show() { System.out.println("Item: " + name); }

}



// Composite: Menu

class Menu implements MenuComponent {

&#x20;   private String name;

&#x20;   private List<MenuComponent> children = new ArrayList<>();

&#x20;   public Menu(String name) { this.name = name; }

&#x20;   public void add(MenuComponent component) { children.add(component); }

&#x20;   public void show() {

&#x20;       System.out.println("Menu: " + name);

&#x20;       for (MenuComponent c : children) {

&#x20;           c.show();

&#x20;       }

&#x20;   }

}



// Client

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       MenuItem burger = new MenuItem("Burger");

&#x20;       MenuItem fries = new MenuItem("Fries");

&#x20;       MenuItem coffee = new MenuItem("Coffee");

&#x20;       MenuItem tea = new MenuItem("Tea");



&#x20;       Menu drinks = new Menu("Drinks");

&#x20;       drinks.add(coffee);

&#x20;       drinks.add(tea);



&#x20;       Menu fastFood = new Menu("Fast Food");

&#x20;       fastFood.add(burger);

&#x20;       fastFood.add(fries);

&#x20;       fastFood.add(drinks); // nested menu



&#x20;       fastFood.show();

&#x20;   }

}





* In the good code MenuItem (leaf) and menu (component) implement the same interface MenuComponent
* A menu can contain any MenuComponent(interface) which means it can hold items and other menus
* This allows nesting which means menus inside menus like deinks inside fast food
* The client doesn't care whether its dealing with a single item or a whole menu, it just call show() because of this the structure becomes flexible and hierarchical



##### NOTE:

* bad code -  two separate classes no uniform treatment , no hierarchy
* good code(composite)- one common interface uniform treatment supports recursive nesting









#### **Question 2:**



You’d write one set of code for a File and another for a Folder. Every time you want to display or calculate something, you’d check: → lots of if-else clutter.:

Both File and Folder implement the same interface (FileSystemComponent).

→ You can call showDetails() or getSize() on either, without caring if it’s a single file or a folder containing many files.



##### Bad code



import java.util.ArrayList;

import java.util.List;



class File {

&#x20;   private String name;

&#x20;   private int size;



&#x20;   public File(String name, int size) {

&#x20;       this.name = name;

&#x20;       this.size = size;

&#x20;   }



&#x20;   public void showDetails() {

&#x20;       System.out.println("File : " + name + " (" + size + " KB)");

&#x20;   }



&#x20;   public int getSize() {

&#x20;       return size;

&#x20;   }

}



class Folder {

&#x20;   private String name;

&#x20;   private List<File> files;



&#x20;   public Folder(String name) {

&#x20;       this.name = name;

&#x20;       files = new ArrayList<>();

&#x20;   }



&#x20;   public void addFile(File file) {

&#x20;       files.add(file);

&#x20;   }



&#x20;   public void showDetails() {

&#x20;       System.out.println("Folder : " + name);

&#x20;       for (File file : files) {

&#x20;           file.showDetails();

&#x20;       }

&#x20;   }

&#x20;   public int getSize() {

&#x20;       int total = 0;

&#x20;       for (File file : files) {

&#x20;           total += file.getSize();

&#x20;       }

&#x20;       return total;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       File file1 = new File("Resume.pdf", 100);

&#x20;       File file2 = new File("Photo.jpg", 200);

&#x20;       Folder folder = new Folder("Documents");

&#x20;       folder.addFile(file1);

&#x20;       folder.addFile(file2);

&#x20;       List<File> files = new ArrayList<>();

&#x20;       files.add(file1);

&#x20;       List<Folder> folders = new ArrayList<>();

&#x20;       folders.add(folder);

&#x20;       for (File f : files) {

&#x20;           f.showDetails();

&#x20;           System.out.println("Size = " + f.getSize() + " KB\\n");

&#x20;       }

&#x20;       for (Folder fol : folders) {

&#x20;           fol.showDetails();

&#x20;           System.out.println("Size = " + fol.getSize() + " KB\\n");

&#x20;       }

&#x20;   }

}



##### Good code



import java.util.ArrayList;

import java.util.List;

interface FileSystemComponent {

&#x20;   void showDetails();

&#x20;   int getSize();

}

class File implements FileSystemComponent {

&#x20;   private String name;

&#x20;   private int size;

&#x20;   public File(String name, int size) {

&#x20;       this.name = name;

&#x20;       this.size = size;

&#x20;   }

&#x20;   @Override

&#x20;   public void showDetails() {

&#x20;       System.out.println("File : " + name + " (" + size + " KB)");

&#x20;   }

&#x20;   @Override

&#x20;   public int getSize() {

&#x20;       return size;

&#x20;   }

}

class Folder implements FileSystemComponent {

&#x20;   private String name;

&#x20;   private List<FileSystemComponent> components;

&#x20;   public Folder(String name) {

&#x20;       this.name = name;

&#x20;       components = new ArrayList<>();

&#x20;   }

&#x20;   public void add(FileSystemComponent component) {

&#x20;       components.add(component);

&#x20;   }

&#x20;   @Override

&#x20;   public void showDetails() {

&#x20;       System.out.println("Folder : " + name);



&#x20;       for (FileSystemComponent component : components) {

&#x20;           component.showDetails();

&#x20;       }

&#x20;   }

&#x20;   @Override

&#x20;   public int getSize() {

&#x20;       int total = 0;

&#x20;       for (FileSystemComponent component : components) {

&#x20;           total += component.getSize();

&#x20;       }

&#x20;       return total;

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       File file1 = new File("Resume.pdf", 100);

&#x20;       File file2 = new File("Photo.jpg", 200);

&#x20;       File file3 = new File("Project.docx", 300);

&#x20;       Folder college = new Folder("College");

&#x20;       college.add(file3);

&#x20;       Folder documents = new Folder("Documents");

&#x20;       documents.add(file1);

&#x20;       documents.add(file2);

&#x20;       documents.add(college);

&#x20;       FileSystemComponent\[] items = {file1, documents};

&#x20;       for (FileSystemComponent item : items) {

&#x20;           item.showDetails();

&#x20;           System.out.println("Size = " + item.getSize() + " KB");

&#x20;           System.out.println();

&#x20;       }

&#x20;   }

}



#### **Question 2:**





Task:

:

You are building a simple GUI framework. A screen can contain individual components (like buttons, text boxes) and composite components (like panels that group multiple components).

:

A UIComponent interface with a render() method.

: Button, TextBox, Label (each renders itself).

: Panel (can contain multiple components, including other panels).

Client code should be able to call render() on any component without worrying if it’s a single element or a container.



##### Bad code



class Button {

&#x20;   private String label;

&#x20;   public Button(String label) { this.label = label; }

&#x20;   public void renderButton() {

&#x20;       System.out.println("Rendering Button: " + label);

&#x20;   }

}

class TextBox {

&#x20;   private String text;

&#x20;   public TextBox(String text) { this.text = text; }

&#x20;   public void renderTextBox() {

&#x20;       System.out.println("Rendering TextBox: " + text);

&#x20;   }

}

class Label {

&#x20;   private String caption;

&#x20;   public Label(String caption) { this.caption = caption; }

&#x20;   public void renderLabel() {

&#x20;       System.out.println("Rendering Label: " + caption);

&#x20;   }

}

class Panel {

&#x20;   private List<Object> children = new ArrayList<>();



&#x20;   public void add(Object component) {

&#x20;       children.add(component);

&#x20;   }

&#x20;   public void renderPanel() {

&#x20;       System.out.println("Rendering Panel...");

&#x20;       for (Object c : children) {

&#x20;           if (c instanceof Button) {

&#x20;               ((Button)c).renderButton();

&#x20;           } else if (c instanceof TextBox) {

&#x20;               ((TextBox)c).renderTextBox();

&#x20;           } else if (c instanceof Label) {

&#x20;               ((Label)c).renderLabel();

&#x20;           } else if (c instanceof Panel) {

&#x20;               ((Panel)c).renderPanel();

&#x20;           }

&#x20;       }

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Button btn = new Button("Submit");

&#x20;       TextBox txt = new TextBox("Enter Name");

&#x20;       Label lbl = new Label("User Form");

&#x20;       Panel innerPanel = new Panel();

&#x20;       innerPanel.add(lbl);

&#x20;       Panel mainPanel = new Panel();

&#x20;       mainPanel.add(btn);

&#x20;       mainPanel.add(txt);

&#x20;       mainPanel.add(innerPanel);

&#x20;       mainPanel.renderPanel();

&#x20;   }

}





##### Good code



import java.util.ArrayList;

import java.util.List;

interface GUIComponent {

&#x20;   void render();

}

class Button implements GUIComponent {

&#x20;   private String label;

&#x20;   public Button(String label) {

&#x20;       this.label = label;

&#x20;   }

&#x20;   @Override

&#x20;   public void render() {

&#x20;       System.out.println("Rendering Button: " + label);

&#x20;   }

}

class TextBox implements GUIComponent {

&#x20;   private String text;

&#x20;   public TextBox(String text) {

&#x20;       this.text = text;

&#x20;   }

&#x20;   @Override

&#x20;   public void render() {

&#x20;       System.out.println("Rendering TextBox: " + text);

&#x20;   }

}

class Label implements GUIComponent {

&#x20;   private String caption;

&#x20;   public Label(String caption) {

&#x20;       this.caption = caption;

&#x20;   }

&#x20;   @Override

&#x20;   public void render() {

&#x20;       System.out.println("Rendering Label: " + caption);

&#x20;   }

}

class Panel implements GUIComponent {

&#x20;   private String name;

&#x20;   private List<GUIComponent> children;

&#x20;   public Panel(String name) {

&#x20;       this.name = name;

&#x20;       children = new ArrayList<>();

&#x20;   }

&#x20;   public void add(GUIComponent component) {

&#x20;       children.add(component);

&#x20;   }

&#x20;   @Override

&#x20;   public void render() {

&#x20;       System.out.println("Rendering Panel: " + name);



&#x20;       for (GUIComponent component : children) {

&#x20;           component.render();

&#x20;       }

&#x20;   }

}

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Button btn = new Button("Submit");

&#x20;       TextBox txt = new TextBox("Enter Name");

&#x20;       Label lbl = new Label("User Form");

&#x20;       Panel innerPanel = new Panel("Inner Panel");

&#x20;       innerPanel.add(lbl);

&#x20;       Panel mainPanel = new Panel("Main Panel");

&#x20;       mainPanel.add(btn);

&#x20;       mainPanel.add(txt);

&#x20;       mainPanel.add(innerPanel);

&#x20;       List<GUIComponent> items = new ArrayList<>();

&#x20;       items.add(mainPanel);

&#x20;       for (GUIComponent component : items) {

&#x20;           component.render();

&#x20;           System.out.println();

&#x20;       }

&#x20;   }

}









