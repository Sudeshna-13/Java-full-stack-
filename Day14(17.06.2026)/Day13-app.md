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

&#x20;        <img id="res" onClick={handleClick} src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKBG31ebB3TtvujGzoS2l99z4Q1ez7902rWQ\\\\\\\\\\\\\\\&s"></img>

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







#### EG:

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

