import React,{useState} from 'react'
export const Clock = () => {
    const [count,setCount]=useState(0)
  return (
    <div style={{textAlign:"center", color:"red", marginTop:"50px"}}>
        <h1>Counter Clock</h1>
        <button onClick={()=>setCount(count+1)}>+</button>
        <button onClick={()=>setCount(count-1)}>-</button>
        <button onClick={()=>setCount(0)}>0</button>
        <h1 >{count}</h1>
        </div>
  )
}
