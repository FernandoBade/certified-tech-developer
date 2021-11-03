USE `musimundos_v2`;
-- Thiago Vilela, Fernando Bade, Bruno Mourão

-- 1 - Selecione o nome dos artistas(tabela artistas) com o nome de seus albuns (tabela
-- albuns) ordenado por id do artista (Order by).

select artistas.id, artistas.nome, albuns.titulo 
from artistas , albuns
where artistas.id = albuns.id_artista
order by artistas.id;

select artistas.id, artistas.nome, albuns.titulo
from albuns
inner join artistas
on artistas.id = albuns.id_artista
order by artistas.id;

-- 2 - Selecione o nome do cliente (clientes) e suas faturas (faturas), porém somente as
-- faturas com valor maior de 5, ordenados pelo valor da fatura decrescente.

-- nosso (deu errado)
select clientes.id as cliente_id, clientes.nome, faturas.id as fatura_id, faturas.valor_total
from clientes
inner join faturas
on faturas.valor_total > 5
order by faturas.valor_total desc;

-- professora
select  clientes.nome, faturas.valor_total
from clientes
inner join faturas
on clientes.id = faturas.id_cliente
where valor_total > 5
order by faturas.valor_total desc;

-- 3 Selecione o nome das cancoes (tabela cancoes) e o tipo de arquivo (tabela
-- tipos_de_arquivos) e exiba o nome da canção e o tipo ordenado pelo id da canção.
select * from cancoes;
select * from tipos_de_arquivo;

select cancoes.nome, tipos_de_arquivo.nome 
from cancoes
inner join tipos_de_arquivo
on cancoes.id_tipo_de_arquivo = tipos_de_arquivo.id
order by cancoes.id






