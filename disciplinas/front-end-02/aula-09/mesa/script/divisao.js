function divisao(){
    let v1 = document.getElementById('n1').value;
    let v2 = document.getElementById('n2').value;
    if(parseFloat(v1) === 0){
        return 'não se pode dividir por zero';
    } else if (parseFloat (v2) === 0){
        return 'não se pode dividir por zero';
    } else {
        return parseFloat (v1) / parseFloat (v2);
    }
}