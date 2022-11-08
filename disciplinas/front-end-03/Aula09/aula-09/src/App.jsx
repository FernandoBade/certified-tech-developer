import { useState } from "react";


// // ********** PARTE 1 **********
// const [nome, setNome] = useState("");
// const [conteudo, setConteudo] = useState("");
// const [numero, setNumero] = useState(10);

//incorreto
//let valor = 0;

// function incrementar(){}// }

// const incrementar = () => {
//   // valor = valor + 1;
//   setNumero(numero - 1);
//   // alert("ok");
// };


//   // ********** PARTE 2 **********
// const App = () => {
//   const [formData, setFormData] = useState({ nome: "", conteudo: "" });
//   const [errorFormData, setErrorFormData] = useState({
//     errorNome: "",
//     errorConteudo: "",
//   });
//   function onSubmit(event) {
//     event.preventDefault();

//     if (!formData.nome.trim()) {
//       setErrorFormData({
//         ...errorFormData,
//         errorNome: "Campo não pode ficar vazio",
//       });
//     }
//     setErrorFormData({});

//     // alert(`${nome} prefere ${conteudo}`);

//     // setNome("");
//   }

//   return (
//     <div>
//       {/* <h1>Numero atual: {valor}</h1>
//       <button onClick={incrementar}>Incrementar</button> */}
//       <h1>Formulário de cadastro</h1>
//       {formData.nome ? <h2>Nome: {formData.nome}</h2> : null}
//       {/* {formData.nome && <h2>Nome: {formData.nome}</h2>} */}
//       {formData.conteudo ? (
//         <h2>Conteúdo: {formData.conteudo}</h2>
//       ) : (
//         <span>Esperando usuario selecionar...</span>
//       )}
//       <form
//         onSubmit={onSubmit}
//         className={formData.conteudo ? "wrapper-form" : "wraper-no-content"}
//         style={formData.conteudo ? { background: "red" } : {}}
//       >
//         <input
//           value={formData.nome}
//           onChange={(event) =>
//             setFormData({ ...formData, nome: event.target.value })
//           }
//         />
//         <p>{errorFormData.errorNome}</p>

//         <select
//           value={formData.conteudo}
//           onChange={(event) =>
//             setFormData({ ...formData, conteudo: event.target.value })
//           }
//         >
//           <option value="frontend">Front-end</option>
//           <option value="backend">Backend-end</option>
//           <option value="ux-ui">UX/UI</option>
//         </select>

//         <input type="submit" />
//       </form>
//     </div>
//   );
// };

//  // ********** MESA **********

import "./styles.css";

function App() {
  const [grades, setGrades] = useState({
    bancoDeDados: {
      studentsAmount: 0,
      averageGrade: 0
    },
    frontEnd: {
      studentsAmount: 0,
      averageGrade: 0
    },
    backEnd: {
      studentsAmount: 0,
      averageGrade: 0
    },
  })
  const [formData, setFormData] = useState({ subject: "", grade: "" })
  function handleSubmit(event) {
    event.preventDefault();
    console.log(formData, grades)
    const amount = grades.bancoDeDados.studentsAmount + 1
    const average = grades.bancoDeDados.averageGrade
    if (formData.subject == 'database') setGrades({
      ...grades, bancoDeDados: {
        studentsAmount: amount,
        averageGrade: (average + formData.grade) / amount
      }
    })
    if (formData.subject == 'backend') setGrades({
      ...grades, backEnd: {
        studentsAmount: amount,
        averageGrade: (average + formData.grade) / amount
      }
    })
    if (formData.subject == 'frontend') setGrades({
      ...grades, frontEnd: {
        studentsAmount: amount,
        averageGrade: (average + formData.grade) / amount
      }
    })
    console.log(formData, grades)
    // setGrades({...grades, subject. })
  }

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select
            value={formData.subject}
            onChange={event =>
              setFormData({ ...formData, subject: event.target.value })}>
            <option selected disabled>
              Selecione uma disciplina
            </option>
            <option
              value="database"
              onChange={handleSubmit}
              >Banco de Dados
            </option>

            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>

          <input
            type="number"
            min="0"
            max="10"
            value={formData.grade}
            onChange={event => setFormData({ ...formData, grade: event.target.value })}
            required
          />

        </div>

        <input
          type="submit"
          value="Salvar"
        />
      </form>

      <div className="container">
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Banco de Dados</td>
              <td>{grades.bancoDeDados.studentsAmount || 0}</td>
              <td>{grades.bancoDeDados.averageGrade || 0}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{grades.frontEnd.studentsAmount || 0}</td>
              <td>{grades.frontEnd.averageGrade || 0}</td>
            </tr>

            <tr>
              <td>Desenolvimento Backend</td>
              <td>{grades.backEnd.studentsAmount || 0}</td>
              <td>{grades.backEnd.averageGrade || 0}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;