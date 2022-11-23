// *** PRIMEIRA PARTE ***

// import { useState, useEffect } from "react";

// const App = () => {
//   const [posts, setPosts] = useState([]);
//   async function getDataByServer() {
//     try {
//       const response = await fetch(
//         "https://jsonplaceholder.typicode.com/posts"
//       );
//       const responseJSON = await response.json();
//       setPosts(responseJSON);
//     } catch (error) {
//       alert("Houve um erro na solicitacao");
//     }
//   }
//   useEffect(() => {
//     getDataByServer();
//   }, []);
//   return <div>{posts.length > 0 ? JSON.stringify(posts) : "Carregando"}</div>;
// };
// export default App;

