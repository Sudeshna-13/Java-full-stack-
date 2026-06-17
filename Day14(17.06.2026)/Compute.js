import React from 'react';

export const Compute =()=>
{
    const n=300
    const handleClick=()=>{
        document.getElementById("res").src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFQLcJ1qnAUVtgFqNmazjnyycV4_X-Zg2xxw&s"
    }
    return(
        <div>
        <h1>Event handling:</h1>
        
         <img id="res" onClick={handleClick} src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKBG31ebB3TtvujGzoS2l99z4Q1ez7902rWQ&s"></img>
        
         </div>
    );
}