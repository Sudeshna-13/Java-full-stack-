import React,{useState} from 'react'

export const Login = () => {
      const[task,setTask]=useState("");
      const[name,setName]=useState("");
      const[date,setDate]=useState("");
      const[msg,newMsg]=useState([]);

      function datafile(){
        fetch("http://localhost:8080/saturday")
        .then((res) => res.text())
        .then((data)=> newMsg(data))
    }
      function handleClick(){
        fetch("http://localhost:8080/sat",{
            method:"POST",
            header:{"content-type":"application/json"},
            body: JSON.stringify({ text: newMsg }),
      })
      .then((res) => res.text())
      .then((data) => alert(data));
}
        
      
  return (
    <div>
        <input type="text" placeholder="enter task" onChange={(e) => setTask(e.target.value)}></input>
        <input type="text" placeholder="enter name" onChange={(e) => setName(e.target.value)}></input>
        <input type="text" placeholder="enter due date" onChange={(e) => setDate(e.target.value)}></input>
        <button onClick={handleClick} id="res">ADD TASK</button>
        <button onclick={datafile} >VIEW RECORD</button>

    </div>
  )
}
