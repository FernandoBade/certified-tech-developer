const { divisao } = require('../calculadora');

describe('Testes de divisão', () => {
    test('Multiplicação de dois números', () => {
        expect(divisao(10, 2)).toBe(5);
    })

    test('Multiplicação de dois nulos', () => {
        expect(divisao(null, null)).toBe(NaN);
    })
    test('Multiplicação de strings', () => {
        expect(divisao("a", "b")).toBe(NaN);
    })
});



