
import logo from './logo.svg';
import './App.css';
import App1 from './App1';
import React from 'react';

export const Greeting =(props)=> {
  
  return (
    <div>
    <h1>Hello,{props.name}!</h1>
    <p>You are {props.age} years old.</p>
    
    </div>
);
};
export const App=()=>{
  return(
    <div>
    <Greeting name="Aaa" age={25}/>
    <Greeting name="Bbb" age={20}/>
    </div>
  );
};