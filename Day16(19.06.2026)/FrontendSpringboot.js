import React,{useState} from 'react'
export const FrontendSpringboot = () => {
  const[msg,setMsg]=useState("");
  function handleClick(){
      fetch("http://localhost:8080/hello")
      .then((res)=>res.text())
      .then((data)=>setMsg(data));
  }
  return (
    <div>
      <h1>This is REACT frontend page</h1>
      <button onClick={handleClick}>Get backend message</button>
      <h3>Message from backend:{msg}</h3>
    </div>
  )
}

// import React,{useState} from 'react'
// export const FrontendSpringboot = () => {
//   const[msg,setMsg]=useState("");
//    const[number,setNumber]=useState()
//   function handleClick(){
//       fetch("http://localhost:8080/hello/"+number)
//       .then((res)=>res.text())
//       .then((data)=>setMsg(data));
//   }
//   return (
//     <div style={{textAlign:"center"}}>
//       <h1>This is REACT frontend page</h1>
//       <input type="number" value={number} onChange={(e)=>setNumber(e.target.value)}/>
//       <button onClick={handleClick}>Generate table</button>
//       <pre>Tables:{msg}</pre>
//     </div>
//   )
// }


// import React,{useState} from 'react'
// export const FrontendSpringboot = () => {
//   const[msg,setMsg]=useState("");
//   function handleClick(){
//       fetch("http://localhost:8080/hello")
//       .then((res)=>res.text())
//       .then((data)=>setMsg(data));
//   }
//   return (
//     <div style={{textAlign:"center"}}>
//       <h1>This is REACT frontend page</h1>
//       <button onClick={handleClick}>Get backend message</button>
//       <pre>10th Table:{msg}</pre>
//     </div>
//   )
// }



