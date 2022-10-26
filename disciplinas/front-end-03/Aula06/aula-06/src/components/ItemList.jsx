const ItemList = ({ item }) => {
    const { id, marca, modelo, descricao, cor, img } = item;
    return <li>
        <h2>{modelo}</h2>
        <h3>{marca}</h3>
        <p>{descricao}</p>
        <img src={img} />
    </li>;
};

export default ItemList;