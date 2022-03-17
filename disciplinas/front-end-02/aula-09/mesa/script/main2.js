function calculate(){
    var previousOperand = document.getElementById('previous-operand').innerHTML;
    if(previousOperand.includes('+')){
        let splitInTwo = previousOperand.split('+');
        let fisrtNumber = parseFloat(splitInTwo[0]);
        let secondNumber = parseFloat(splitInTwo[1]);
        document.getElementById('previous-operand').innerHTML = fisrtNumber + secondNumber;
    }

    if(previousOperand.includes('-')){
        let splitInTwo = previousOperand.split('-');
        let fisrtNumber = parseFloat(splitInTwo[0]);
        let secondNumber = parseFloat(splitInTwo[1]);
        document.getElementById('previous-operand').innerHTML = fisrtNumber - secondNumber;
    }

    if(previousOperand.includes('*')){
        let splitInTwo = previousOperand.split('');
        let fisrtNumber = parseFloat(splitInTwo[0]);
        let secondNumber = parseFloat(splitInTwo[1]);
        document.getElementById('previous-operand').innerHTML = fisrtNumber * secondNumber;
    }

    if(previousOperand.includes('/')){
        let splitInTwo = previousOperand.split('/');
        let fisrtNumber = parseFloat(splitInTwo[0]);
        let secondNumber = parseFloat(splitInTwo[1]);
        document.getElementById('previous-operand').innerHTML = fisrtNumber / secondNumber;
    }

}
