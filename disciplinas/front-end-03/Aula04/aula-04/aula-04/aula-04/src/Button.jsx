function Button(props){
    function handleClick(){
        alert("Ok")
    }

    return <button
    onClick={props.click}
    style={{backgroundColor:props.color}}>{props.name}</button>
}

export default Button;
