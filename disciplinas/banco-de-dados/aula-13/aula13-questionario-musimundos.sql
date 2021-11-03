USE musimundos;

-- Clientes de Brasil: A quantidade de clientes do Brasil é:
SELECT COUNT(*) from clientes WHERE pais LIKE "BRA%";
-- 5

-- Canções por gênero: Faça uma consulta ao banco de dados que mostre a identificação do gênero
-- e o número de músicas que possui. O número que você obteve como resultado do 
-- número de músicas do gênero com id = 6 foi:
SELECT generos.id, COUNT(cancoes.id) FROM cancoes
INNER JOIN generos ON cancoes.id_genero = generos.id
GROUP BY generos.id
HAVING id = 6;
-- 81

-- Balanço comercial: Faça uma consulta ao nosso banco de dados que some o total de 
-- todas as notas fiscais emitidas pela empresa. O resultado encontrado foi:
SELECT SUM(valor_total) from faturas;

-- Duração dos álbuns: Obtenha uma lista de todos os álbuns e sua duração 
-- média (milissegundos). O número da média obtida para o álbum 4 foi:
SELECT albuns.id, AVG(cancoes.duracao_milisegundos) FROM albuns
INNER JOIN cancoes ON cancoes.id_album = albuns.id
GROUP BY albuns.titulo HAVING albuns.id = 4;

-- Movendo arquivos: Faça uma consulta ao banco de dados e informe qual é o arquivo de música com o menor peso em bytes.
SELECT MIN(cancoes.bytes) AS smaller_filesize, cancoes.nome, tipos_de_arquivo.nome FROM cancoes
INNER JOIN tipos_de_arquivo ON cancoes.id_tipo_de_arquivo = tipos_de_arquivo.id
GROUP BY tipos_de_arquivo.nome
ORDER BY smaller_filesize;

-- Desconto: Faça uma consulta ao banco de dados que nos traga por cliente_id
--  a soma total de suas faturas. Filtre aqueles em que a soma do total é > 45. 
-- Qual é a soma total do cliente com id = 6?
SELECT c.id, concat(c.nome, ' ', c.sobrenome), SUM(f.valor_total) AS total
FROM clientes AS c
INNER JOIN faturas AS f ON c.id = f.id_cliente
GROUP BY c.id HAVING total > 45 AND c.id = 6;
-- $49.62
-- 

