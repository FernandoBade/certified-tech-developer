const { multiplicacao } = require('../calculadora');

describe('Testes de multiplicacao', () => {
    test('Multiplicação de dois números', () => {
        expect(multiplicacao(5, 5)).toBe(25);
    })

    test('Multiplicação de dois nulos', () => {
        expect(multiplicacao(null, null)).toBe(0);
    })
    test('Multiplicação de strings', () => {
        expect(multiplicacao("a", "b")).toBe(NaN);
    })
});



