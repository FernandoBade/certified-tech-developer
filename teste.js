class WordAnalyzer {
    constructor(word) {
        this.word = word.toLowerCase();
        const newWord = word.split('');
        if (newWord.length === 0) {
            throw new Error('Uma palavra é obrigatória');
        }
        const verificaEspaco = (string) => string.indexOf(' ') >= 0;
        if (verificaEspaco(word)) {
            throw new Error('Muitas Palavras');
        }

        const verificaPontuacao = (string) => string.indexOf('.') >= 0 || string.indexOf(',') >= 0 || string.indexOf('?') >= 0 || string.indexOf('!') >= 0;
        if (verificaPontuacao(word)) {
            throw new Error('Uma palavra não pode conter sinais de pontuação');
        }


    }

    countVowels() {
        const vowels = ['a', 'e', 'i', 'o', 'u'];
        let count = 0;
        for (let i = 0; i < this.word.length; i++) {
            if (vowels.includes(this.word[i])) {
                count++;
            }
        }
        return count;
    }



    countConsonants() {
        const consonants = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'];
        let count = 0;
        for (let i = 0; i < this.word.length; i++) {
            if (consonants.includes(this.word[i])) {
                count++;
            }
        }
        return count;
    }

    countCharacters() {
        return `vogais: ${this.countVowels()}, consoantes: ${this.countConsonants()}, total: ${this.countVowels() + this.countConsonants()}`;
    }

}

const serendipity = new WordAnalyzer('Serendipity');

console.log(serendipity.countVowels());
console.log(serendipity.countConsonants());
console.log(serendipity.countCharacters());
