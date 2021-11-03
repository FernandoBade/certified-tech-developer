-- Na aula anterior, fornecemos prática adicional para reforçar as instruções SQL básicas.
-- Nesta prática, continuaremos a fazer consultas.
-- Se você não baixou o banco de dados ainda, baixe aqui.
-- Sem mais delongas, vamos começar com o exercício. Boa sorte!😎👌✨

-- 1. Mostre o título de todas as séries e use alias para que o nome do campo fique
-- com a primeira letra maiúscula.

SELECT titulo as "Título" from series;

-- 2. Busque por título de filmes com Avaliação superior a 3, com mais de 1 prêmio e
-- com data de lançamento entre '01-01-1988' e '31-12-2009'. Classifique os
-- resultados em ordem decrescente.

SELECT titulo, avaliacao, premios, data_lancamento from filmes
where avaliacao >= "3"
and premios > "1"
and data_lancamento BETWEEN "1988-01-01" and "2009-12-31"
order by avaliacao desc;

-- 3. Fazer um top 3 com os filmes a partir do 10º registro da consulta anterior.

SELECT titulo, avaliacao, premios, data_lancamento from filmes
where avaliacao >= "3"
and premios >= "1"
and data_lancamento BETWEEN "1988-01-01" and "2009-12-31"
order by avaliacao desc
limit 3 offset 9;

-- 4. Quais são os 3 piores episódios considerando suas avaliações?

SELECT titulo, avaliacao from episodios order by avaliacao limit 3;

-- 5. Liste nome, sobrenome e avaliacao da tabela Atores. Utilize Alias para mostrar o
-- título das colunas com a 1a letra maiúscula. Substitua o nome da coluna id por
-- Identificação e da coluna avaliacao por Classificação.

SELECT id as "Identificação",
nome as Nome, sobrenome as Sobrenome