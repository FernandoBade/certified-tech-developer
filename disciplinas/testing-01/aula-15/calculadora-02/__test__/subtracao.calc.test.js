const { subtracao } = require('../calculadora');

describe('Testes de subtração', () => {
    test('Subtração de dois números', () => {
        expect(subtracao(5, 3)).toBe(2);
    })
    test('Subtração de dois zeros', () => {
        expect(subtracao(0, 0)).toBe(0);
    })
    test('Subtração de dois nulos', () => {
        expect(subtracao(null, null)).toBe(0);
    })
    test('Subtração de dois negativos', () => {
        expect(subtracao(-5,5)).toBe(-10);
    })
    test('Subtração de duas strings', () => {
        expect(subtracao("a", "b")).toBe(NaN);
    })
});