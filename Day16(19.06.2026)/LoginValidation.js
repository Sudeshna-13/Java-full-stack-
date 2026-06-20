import React,{useState}from 'react'
import {BrowserRouter, Routes, Route, Link} from "react-router-dom";
import {MyRouting} from './MyRouting';

export const LoginValidation = () => {
    const[name,setName]=useState("")
    const[number,setNumber]=useState("")
    const[email,setEmail]=useState("")
    const[userName,setUserName]=useState("")
    const[password,setPassword]=useState("")
    const[confirmPassword,setConfirmPassword]=useState("")
    const[birth,setBirth]=useState("")
    const[login,setLogin]=useState(false)

    const handleClick=()=>{
        if(name =="" || email=="" || userName=="" || password=="" || confirmPassword=="" || birth=="") alert("Can't sign up - fields cant be empty(except phone number)");
        else if(password!=confirmPassword)  document.getElementById("res").textContent="Sign up failed - password and confirm password mismatched";
        else if(password.length <8 || password.length >15) document.getElementById("res").textContent="Sign up failed - password must have length greater than 7 and less than 16 ";
        else if(!/[0-9]/.test(password) || !/[!@#$%^&*(),.?":{}|<>]/.test(password) ) document.getElementById("res").textContent="Sign up failed - password must contain atleast 1 digit and 1 special case ";
            else{  document.getElementById("res").textContent="Sign up successful";
                setLogin(true);
            }

        }
        if(login) return (< MyRouting />)
  return (
    <div style={{color:"blue",textAlign:"center",margin:"50px" , backgroundColor:"lightblue"}}>
        <h1 style={{color:"brown"}}>SIGN UP PAGE</h1>
        <input type="text" placeholder="Name" value={name} onChange={(e) => setName(e.target.value)}></input>
        <br></br>
        <input type="number" placeholder="Phone Number" value={number} onChange={(e) => setNumber(e.target.value)}></input>
        <br></br>
        <input type="email" placeholder="email" value={email} onChange={(e) => setEmail(e.target.value)}></input>
        <br></br>
        <input type="text" placeholder="UserName" value={userName} onChange={(e) => setUserName(e.target.value)}></input>
        <br></br>
        <input type="password" placeholder="password" value={password} onChange={(e) => setPassword(e.target.value)}></input>
        <br></br>
        <input type="password" placeholder=" confirm password" value={confirmPassword} onChange={(e) => setConfirmPassword(e.target.value)}></input>
        <br></br>
        <input type="date" placeholder="D.O.B" value={birth} onChange={(e) => setBirth(e.target.value)}></input>
        <br></br>
        <button onClick={handleClick} > Sign Up</button>
        <h1 id="res"></h1>

    </div>
    
  )
}




// import React,{useState} from 'react'
// export const LoginValidation = () => {
//     const[name,setName]=useState("")
//     const[password,setPassword]=useState("")
//     const[resultName,setResultName]=useState("")
//     const[resultPassword,setResultPassword]=useState("")
//         const n="sude";
//         const p="1234";
//     const handleClick=()=>{
//        setResultName(name);
//        setResultPassword(password);
//         if(n==name && p==password) document.getElementById("res").textContent="login successful";
//         else{ 
//             if(n!=name && p!=password)  document.getElementById("ans").textContent=" name and password are incorrect - login failed, try again!";
//             else if(p!=password) document.getElementById("ans").textContent="password is incorrect - login failed, try again!";
//             else  document.getElementById("ans").textContent="name is incorrect - login failed, try again!";
//         }
//     }
//   return (
//     <div style = {{color:"orange", background:"lightblue"}}>
//         <label><b>Enter Name</b></label>
//         <input type="text" value={name} onChange={(e) => setName(e.target.value)}></input>
//         <br></br>
//         <br></br>
//         <label><b>Enter Password</b></label>
//         <input type="password" value={password} onChange={(e) => setPassword(e.target.value)}></input>
//         <br></br>
//         <br></br>
//         <button id="bt" onClick={handleClick}>Login</button>
//         <h1 style={{color:"green"}} id="res"></h1>
//         <h1 style={{color:"red"}} id="ans"></h1>
//         <h1 style={{color:"blue"}}>{resultName}</h1>
//         <h1 style={{color:"blue"}}>{resultPassword}</h1>
//     </div>
//   )
// }




// import React from 'react'
// export const LoginValidation = () => {
//     const handleClick=()=>{
//         const n="sude";
//         const p="1234";
//         const name=document.getElementById("userid").value;
//         const password=document.getElementById("psid").value;
//         if(n==name && p==password) document.getElementById("res").textContent="login successful";
//         else{ 
//             if(n!=name && p!=password)  document.getElementById("ans").textContent=" name and password are incorrect - login failed, try again!";
//             else if(p!=password) document.getElementById("ans").textContent="password is incorrect - login failed, try again!";
//             else  document.getElementById("ans").textContent="name is incorrect - login failed, try again!";
//         }
//     }
//   return (
//     <div style = {{color:"blue"}}>
//         <label><b>Enter Name</b></label>
//         <input type="text" id="userid"></input>
//         <br></br>
//         <br></br>
//         <label><b>Enter Password</b></label>
//         <input type="password" id="psid"></input>
//         <br></br>
//         <br></br>
//         <button id="bt" onClick={handleClick}>Login</button>
//         <h1 style={{color:"green"}} id="res"></h1>
//         <h1 style={{color:"red"}} id="ans"></h1>
//     </div>
//   )
// }
