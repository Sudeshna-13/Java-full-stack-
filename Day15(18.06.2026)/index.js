import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import {App} from './App';
import {Clock} from './Clock';
import {Effecthook} from './Effecthook';
import reportWebVitals from './reportWebVitals';
import { LoginValidation } from './LoginValidation';
import { OnChangeEvent } from './OnChangeEvent';
import { MyRouting } from './MyRouting';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  
  <React.StrictMode>
    {/* <App /> */}
    {/* <Clock /> */}
    {/* <Effecthook /> */}
    {/* <LoginValidation /> */}
     <MyRouting />
    {/* <OnChangeEvent /> */}
    {/* <Compute /> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
