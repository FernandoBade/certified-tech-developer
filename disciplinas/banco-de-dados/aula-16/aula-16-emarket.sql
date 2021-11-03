/*
Yasmin Khalaf
Fernando Bade
Cristian Fernandes
André Machado
Kened Silva
*/

/*
Faça uma consulta sobre o faturamento do e-market. Inclua as seguintes informações:
- ID da fatura
- data da fatura
- nome da empresa de correio (O id da empresa consta da tabela faturas no campo FormaEnvio)
- nome do cliente
- categoria do produto vendido
- nome do produto(Você chega ao produto consultando os detalhes da fatura)
- preço unitário
- quantidade
*/
SELECT * FROM faturas;
SELECT * FROM clientes;
SELECT * FROM categorias;
SELECT * FROM produtos;
SELECT * FROM correios;
SELECT * FROM detalhefatura;

SELECT faturas.FaturaID, faturas.DataFatura, correios.Empresa, clientes.Contato, categorias.CategoriaNome, produtos.ProdutoNome, detalhefatura.PrecoUnitario, detalhefatura.Quantidade FROM faturas
INNER JOIN correios ON faturas.FormaEnvio = correios.CorreioID
INNER JOIN clientes ON faturas.ClienteID = clientes.ClienteID
INNER JOIN detalhefatura ON detalhefatura.FaturaId = faturas.FaturaID
INNER JOIN produtos ON detalhefatura.ProdutoID = produtos.ProdutoID
INNER JOIN categorias ON produtos.CategoriaID = categorias.CategoriaID;

-- Liste todas as categorias junto com informações sobre seus produtos. Incluir todas as categorias, mesmo que não tenham produtos.
SELECT * FROM categorias;
SELECT * FROM produtos;

SELECT categorias.CategoriaNome, produtos.ProdutoNome FROM categorias
LEFT JOIN produtos ON categorias.CategoriaID = produtos.CategoriaID;

-- Liste as informações de contato de clientes que nunca compraram no emarket.
SELECT clientes.Contato, clientes.Telefone FROM clientes
LEFT JOIN faturas ON faturas.ClienteID = clientes.ClienteID
WHERE faturas.faturaId IS NULL;

-- Faça uma lista de produtos. Para cada um, indique seu nome, categoria e as informações de contato de seu fornecedor. Lembre-se que podem existir produtos para os quais o fornecedor não foi indicado.
SELECT * FROM provedores;
SELECT * FROM categorias;
SELECT * FROM produtos;

SELECT produtos.ProdutoNome, categorias.CategoriaNome, provedores.Contato, provedores.Telefone FROM produtos
INNER JOIN categorias ON produtos.CategoriaID = categorias.CategoriaID
LEFT JOIN provedores ON produtos.ProvedorID = provedores.ProvedorID;

-- Para cada categoria, liste o preço unitário médio de seus produtos.
SELECT * FROM categorias;
SELECT * FROM produtos;

SELECT categorias.CategoriaNome, AVG(produtos.PrecoUnitario) FROM categorias
INNER JOIN produtos ON produtos.CategoriaID = categorias.CategoriaID
GROUP BY categorias.CategoriaNome;


-- Para cada cliente, indique a última nota fiscal de compra. Inclua clientes que nunca compraram no e-market.
SELECT * FROM clientes;
SELECT * FROM faturas;

SELECT clientes.Contato, MAX(faturas.DataFatura) FROM clientes
LEFT JOIN faturas ON faturas.ClienteID = clientes.ClienteID
GROUP BY clientes.Contato;

-- Todas as faturas têm uma empresa de correio associada (envio). Gere uma lista com todas as empresas de correio e o número de faturas correspondentes. Execute a consulta usando RIGHT JOIN.

SELECT * FROM faturas;
SELECT * FROM correios;

SELECT correios.Empresa, COUNT(faturas.FaturaId) FROM faturas
RIGHT JOIN correios ON correios.CorreioID = faturas.FormaEnvio
GROUP BY correios.Empresa;