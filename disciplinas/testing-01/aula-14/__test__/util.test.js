const { generateText, validateInput, createElement } = require('../util.js');

describe('Testes de saída de dados', () => {
    test('Saída com dados', () =>{
        const text = generateText('Houser',30);
        expect(text).toBe('Houser (30 years old)');
    });
      
    test('Saída com dados vazios', () =>{
        const text = generateText('',null);
        expect(text).toBe(' (null years old)');    
    });
    
    test('Saída sem dados', () =>{
        const text = generateText();
        expect('undefined (undefined years old)');    
    });
})