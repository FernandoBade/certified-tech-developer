import Container from './Container'
import ListaCompras from './ListaCompras'


// function App() {
//   return (
//     <>
//       <h1>Hello World!</h1>

//       <Container txt="Lista de Compras"/>

//       <ListaCompras/>

//     </>
//   )
// }

// export default App;

const produtos = [
  {
    nome: "Macbook Air 13 Chip M1 256gb",
    image: "https://m.media-amazon.com/images/I/41O807iqbCL._AC_SX522_.jpg",
    preco: "R$ 7999.00",
  },
  {
    nome: "Echo Dot (4ª Geração)",
    image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SL1000_.jpg",
    preco: "R$ 379.00",
  },
  {
    nome: "Câmera Ip Sem Fio 360°",
    image: "https://m.media-amazon.com/images/I/51F70OM213S._AC_SL1000_.jpg",
    preco: "R$ 199.00",
  },
  {
    nome: "Fechadura Eletrônica Digital Inteligente Zigbee",
    image: "https://m.media-amazon.com/images/I/51RXeqMLceL._AC_SL1500_.jpg",
    preco: "R$ 1599.00",
  },
];

function App() {
  return (
    <div>
      <h1>Produtos</h1>

      <ul>
        {
          produtos.map((item) =>
            <li>
              <h3>{item.nome}</h3>
              <img 
                width={'150px'}
                border={'1px solid gray'}
                padding={'20px'}
                src={item.image}></img>
                <h4>{item.preco}</h4>
            </li>)
        }
      </ul>
    </div>
  );
}

export default App;