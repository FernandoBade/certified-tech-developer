const { generateText } = require('../util');

describe('Validação de texto de saída', () => {
    test('Saída de nome e idade', () => {
    const text = generateText('Fernando Bade', 35);
    expect(text).toBe('Fernando Bade (35 anos)');
    })
})