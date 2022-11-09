import ItemList from "./components/ItemList/ItemList";
import CitiesList from "./components/Mesa/CitiesList";
import styles from "./styles.module.css";
import { carros } from "./mock/carros"
import { cities } from "./mock/cities"

const App = () => {
  return (
    <>
      {/* <ul>
        {carros.map((carro) => (
          <ItemList  key={`list-item-${carro.id}`} item={carro}/>
        ))}
      </ul> */}

      <ul>
        {cities.map((city) => (
          <CitiesList key={`list-city-${city.id}`} item={city} />
        ))}
      </ul>

    </>
  )
}


export default App;
