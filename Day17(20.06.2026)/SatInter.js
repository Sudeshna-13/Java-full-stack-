import React from 'react'
import { BrowserRouter, Routes,Route,Link } from 'react-router-dom';
import {Login} from './Login';
export const SatInter = () => {
  return (
     <BrowserRouter>
    <div>
         <nav>
            <Link to="/">Login</Link>
            <Link to="/login">Enter task</Link>
        
                </nav>
                <Routes>
                    <Route path="/login" element={<Login />}/>
                </Routes>
            </div>
            </BrowserRouter>
  )
}
