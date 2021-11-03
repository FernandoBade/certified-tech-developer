-- * 1. Para cada empresa de correio, calcule o transporte total. Inclua todas as empresas de correio, 
-- mesmo que não tenham realizado nenhuma operação.

SELECT 
correios.Empresa, correios.correioID, SUM(faturas.Transporte) as TransporteTotal
from faturas
RIGHT JOIN correios
ON faturas.FormaEnvio = correios.correioID
Group BY correios.Empresa, correios.correioID;

-- 2. Liste as informações de contato (ou, endereço, etc.) dos clientes que não fizeram compras. 
-- Exiba as informações no formato considerado mais adequado. Por exemplo: <endereço> (CP: < CEP>) 

SELECT 
clientes.contato, clientes.telefone, clientes.cidade 
from clientes
LEFT JOIN faturas
ON clientes.ClienteID = faturas.ClienteID
WHERE FaturaID is null;


-- 3. Liste as categorias e seus produtos, incluindo as categorias para as quais não há produtos no banco de dados.
-- Para nomes de produtos, onde mix ou Chef diz, substituí-lo por MIX ou CHEF, respectivamente. 

SELECT 
categorias.categorianome, upper(produtos.ProdutoNome)
from categorias
LEFT JOIN produtos
ON categorias.categoriaID = produtos.categoriaID;



/* Consultas Exercícios feitos com a professora
1. Liste os clientes que fizeram compras durante 1996. 
A lista deve conter as seguintes colunas:
● Nome e sobrenome.
● O título é todo maiúsculo.*/

SELECT * from clientes;
SELECT * from faturas;

SELECT DISTINCT clientes.Contato, upper(clientes.Titulo) as Titulo
FROM clientes
INNER JOIN faturas
ON clientes.clienteID = faturas.clienteID
where year(faturas.datafatura) = 1996;

SELECT clientes.Contato, upper(clientes.Titulo) as Titulo
FROM clientes
INNER JOIN faturas
ON clientes.clienteID = faturas.clienteID
where year(faturas.datafatura) = 1996 
-- ou where DataFatura between "1996-01-01" and "1996-12-31"
group by clientes.Contato, Titulo;



/*2. Liste as faturas para as quais a remessa foi para uma cidade 
diferente da cidade do cliente. Considere apenas os clientes do Reino Unido.
A listagem deve incluir:
● O número da fatura completando com zeros principais 8 itens. Por exemplo, 00001234
● A data da fatura no formato YYYY-MM-DD. Por exemplo, 1996-12-01
● Para a cidade do cliente */

SELECT lpad(faturas.FaturaID,8,0) as FaturaID, 
date_format(faturas.datafatura, "%Y-%m-%d") as dataFatura,
clientes.Cidade, faturas.CidadeEnvio, clientes.Pais
from faturas
INNER JOIN clientes
ON clientes.clienteID=faturas.clienteID
where clientes.Cidade <> faturas.CidadeEnvio
and clientes.Pais = "UK";
-- ou where  clientes.Cidade != faturas.CidadeEnvio


SELECT clientes.Contato, upper(clientes.Titulo) as Titulo
FROM faturas
INNER JOIN faturas
ON clientes.clienteID = faturas.clienteID
where year(faturas.datafatura) = 1996 
-- ou where DataFatura between "1996-01-01" and "1996-12-31"
group by clientes.Contato, Titulo;


SELECT RIGHT(concat("00000000", f.FaturaID),8) as FaturaID_concat,
lpad(f.FaturaID,8,0) as FaturaID_lapad, f.faturaID from faturas f;
-- lpad (coluna, quantidade de caracteres, o que quer completar)



SELECT co.*, fa.*
from correios co
left join faturas fa
on co.correioID = fa.FormaEnvio;


SELECT * from faturas;
SELECT * from correios;



