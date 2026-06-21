import React,{useState} from 'react';
import {Login} from './Login';

export const Saturday = () => {
    const[uname,setUname]=useState("")
    const[password,setPassword]=useState("")
    const[login,setLogin]=useState(false)
    const cname="mybatch";
    const cpassword="happy@143";
    
    const handleClick =()=>{
        if(uname!=cname && password!=cpassword) document.getElementById("res").textContent="Mistmatch username and password";
        else {
             document.getElementById("res").textContent="success";
             setLogin(true);
    }
}
    if(login) return (<Login />)

  return (
   
    <div>
      <h1>LOGIN PAGE</h1>
      <label>Username</label>    
        <input type="text" placeholder='enter name' onChange={(e) => setUname(e.target.value)}></input>
        <br></br>
        <label>Password</label>
        <input type="text" placeholder='enter password' onChange={(e) => setPassword(e.target.value)}></input>
        <br></br>
        <button onClick={handleClick}>Login</button>
        <h1 id="res"></h1>
       </div>
      
  )
}
