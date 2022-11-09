// import { useState } from "react";

// const App = () => {
//   const [numero, setNumero] = useState(0);
//   const [nomes, setNomes] = useState(["Jose", "Maria"]);


//   const handleButton = () => {
//     setNumero(numero + 1);
//   }

//   const addPessoa = () => {
//     setNomes([...nomes, "Carla",]);
//   }


//   return (
//     <div>
//       <h2>{numero}</h2>
//       <ul>
//         {nomes.map((nome) => (
//           <li>{nome}</li>
//         ))}
//       </ul>
      
//       <button onClick={handleButton}>Add Número</button>
//       <button onClick={addPessoa}>Add Nome</button>
//     </div>
//   )
// };

// export default App; 

//************MESA************ */

import { useState } from "react";

const App = () => {
  const [itens, setItem] = useState([1,2,3,4,5]);
  
  function addItem() {
    let temp = [...itens]
    setItem([...itens, itens.length + 1])
  }

  return (
    <>    
      <ul>
        {itens.map((i) => (
          <li>{`O item ${i} foi adicionado à lista`}</li>
        ))}
      </ul>          
      <button onClick={addItem}>Add Item</button>
    </>
  )
};

export default App; 
