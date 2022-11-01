// Grupo 2
// Lucas Rosa
// Thiago R. Silva
// Fernando Bade
// Geyson Kaio
// João Victor
// William ALmeida

import { useRef, useState } from 'react';


function App() {
  
  const inputRef = useRef(null);

  const [nome, setNome] = useState("");

  const [idade, setIdade] = useState("");

  const [pokemon, setPokemon] = useState("");

  const [valores, setValores] = useState([]);

  function handleSubmit(evento) {
    evento.preventDefault();

    setValores([...valores, (`O(a) ${nome} tem idade de ${idade} e seu pokemon favorito é o ${pokemon}!`)])

    console.log(nome);
    console.log(idade);
    console.log(pokemon);
    console.log(valores);
  }

  return (
    <>
      <form  onSubmit={handleSubmit}>
        <div>
          <label >Digite seu Nome :</label>
          <input 
            //value={isChecked}
            value={nome}
            onChange={(event) => setNome(event.target.value)}
            />
        </div>
        <div>
          <label >Digite sua Idade :</label>
          <input 
            //value={isChecked}
            value={idade}
            onChange={(event) => setIdade(event.target.value)} 
          />
        </div>
        <div>
          <label >Digite seu Pokemon Favorito :</label>
          <input 
            //value={isChecked}
            value={pokemon}
            onChange={(event) => setPokemon(event.target.value)} 
          />
        </div>

        <input type="Submit" />
      </form>
      {valores.length ? <h2>Respostas Recebidas: </h2> : null}
      <ul>
        {
          valores.map((val) => (
          <li>{val}</li>
          ))
        }
      </ul>
    </>
  )
}

export default App

// 2 tipos de componentes
// Uncontrolled - Elementos padrão do html/javascript, controlados pela DOM
// Controlled - Elementos controlados pelos states do react
