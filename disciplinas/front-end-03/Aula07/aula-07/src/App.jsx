import { useState } from "react";

const App = () => {
  const [numero, setNumero] = useState(0);
  const [nomes, setNomes] = useState(["Jose", "Maria"]);


  const handleButton = () => {
    setNumero(numero + 1);
  }

  const addPessoa = () => {
    setNomes([...nomes, "Carla",]);
  }


  return (
    <div>
      <h2>{numero}</h2>
      <ul>
        {nomes.map((nome) => (
          <li>{nome}</li>
        ))}
      </ul>
      
      <button onClick={handleButton}>Add Número</button>
      <button onClick={addPessoa}>Add Nome</button>
    </div>
  )
};

export default App; 