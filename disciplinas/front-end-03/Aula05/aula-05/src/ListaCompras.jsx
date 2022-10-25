const items = [
    {
        id: 1,
        name: 'Coca Cola'
    },
    {
        id: 2,
        name: 'Pizza'
    },
    {
        id: 3,
        name: 'Sobremesa'
    },
    {
        id: 4,
        name: 'Coxinha'
    },
    {
        id: 5,
        name: 'Pastel'
    }
];

function ListaCompras(props) {
    return (
        <>
        
            <ul>
                {
                    items.map((item) => <li>{item.name}</li>)
                }
            </ul>
        </>
    )
}

export default ListaCompras;