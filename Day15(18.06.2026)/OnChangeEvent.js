// import React from 'react'

// export const OnChangeEvent = () => {
//     const handleChange=(e)=>{
//         console.log(e.target.value)
//      //   document.getElementById("res").textContent=e.target.value;
//     }
//   return (
//     <div>
//         <input type="text" onChange={handleChange}></input>
//         <h1 id="res"></h1>
//     </div>
//   )
// }



import React, { useState } from 'react'

export const OnChangeEvent = () => {

    const [text, setText] = useState("");

    const handleChange = (e) => {
        console.log(e.target.value)
        setText(e.target.value);
    }

    return (
        <div>
            <input type="text" onChange={handleChange} />
            <h1>{text}</h1>
        </div>
    )
}
