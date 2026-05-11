import React, { useState } from "react";
function App() {

  const [count1, setCount1] = useState(0);
  const [count2, setCount2] = useState(0);
  return (
    <div style={{textAlign:"center", marginTop:"100px"}}>
      <h1>Voting Application</h1>
      <h2>Candidate A : {count1}</h2>
      <button onClick={() => setCount1(count1 + 1)}>
        Vote A
      </button>
      <br /><br />
      <h2>Candidate B : {count2}</h2>
      <button onClick={() => setCount2(count2 + 1)}>
        Vote B
      </button>
    </div>
  );
}
export default App;
