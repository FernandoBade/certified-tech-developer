import styles from "./styles.module.css";

const CitiesList = ({ item }) => {
    const { id, country, city, population, color } = item;
    if (country === "BRA") {
        return <li className={styles.item_list}>
            <h2>{country}</h2>
            <h3>{city}</h3>
            <p>População: {population}</p>
        </li>;
    }
};

export default CitiesList;