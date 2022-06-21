exports.generateText = (name, age) => {
  // Returns output text
  return `${name} (${age} years old)`;
};

exports.createElement = (type, text, className) => {
  // Creates a new HTML element and returns it
  const newElement = document.createElement(type);
  newElement.classList.add(className);
  newElement.textContent = text.split(' ',1);
  return newElement;
};

exports.validateInput = (text, notEmpty, isNumber) => {
  // Validate user input with two pre-defined rules
  if (!text) {
    return false;
  }
  if (notEmpty && text.trim().length === 0) {
    return false;
  }
  if (isNumber && +text === NaN) {
    return false;
  }
  return true;
};

const { generateText, validateInput, createElement } = require('../util.js');

describe('Testes de saída de dados', () => {
    test('Saída com dados', () =>{
        const text = generateText('Houser',30);
        expect(text).toBe('Houser (30 years old)');
    });
      
    <--completar-->('Saída com dados vazios', () =>{
        const text = generateText('',null);
        <--completar-->.toBe(' (null years old)');    
    });
    
    test('Saída sem dados', () =>{
        const text = generateText();
        <--completar-->('undefined (undefined years old)');    
    });
})