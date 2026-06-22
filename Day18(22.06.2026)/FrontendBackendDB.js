import React,{useState} from 'react'
 const FrontendBackendDB = () => {
    const [msg, setMsg] = useState("");
    const [newMsg, setNewMsg] = useState("");
    const [record, setRecord] = useState([]);
    function getMessage() {
    fetch("http://localhost:8080/hello")
      .then((res) => res.text())
      .then((data) => setMsg(data));
  }

  function recordData() {
    fetch("http://localhost:8080/rec")
      .then((res) => res.json())
      .then((data) => setRecord(data));
  }

  function saveMessage() {
    fetch("http://localhost:8080/hello",{
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ text: newMsg }),
      })
      .then((res) => res.text())
      .then((data) => alert(data));
}

  return (
    <div>     
      <h1>This is "REACT FRONT END"</h1>
      <button onClick={getMessage}>Get Backend Message</button>
      <p>Message from backend: {msg}</p>

      <input
        type="text"
        placeholder="New message"
        value={newMsg}
        onChange={(e) => setNewMsg(e.target.value)}
      />
      <button onClick={saveMessage}>Save to DB</button>
      <br/>
      <button onClick={recordData}>Show Record</button>
      { 
      record.map((r) => (
      <h4>
        {r.id} : {r.text}
        </h4>
         ))
      
    }

    </div>
  )
}
export default FrontendBackendDB;
