-- 1) Queremos ter uma lista de todas as categorias
select CategoriaNome from emarket.categorias;

-- 2) Como as categorias não possuem imagens, você está interessado em obter apenas um Nome e descrição da lista de categorias.
select CategoriaNome, descricao from emarket.categorias;

-- 3) Obtenha uma lista dos produtos.
select * from emarket.produtos;

-- 4) Existem produtos descontinuados? (Descontinuado = 1).
select count(*) as PROD_DESCONTINUADO from emarket.produtos where Descontinuado = 1;

-- 5) Na sexta-feira, você deve se reunir com o fornecedor nr. 8. Quais são os produtos que eles fornecem?
select * from emarket.produtos where ProvedorID = 8;

-- 6) Queremos saber todos os produtos cujo preço unitário se encontra entre 10 e 22.
select * from emarket.produtos where PrecoUnitario between 10 and 22;

-- tambem pode ser escrito da forma abaixo
select * from emarket.produtos where PrecoUnitario >=10 and PrecoUnitario <=22;

-- 7) Fica definido que um produto deve ser solicitado ao fornecedor se suas unidades em estoque forem inferiores ao nível de reabastecimento. Existem produtos a solicitar?
select * from emarket.produtos where UnidadesEstoque < NivelReabastecimento;
select count(*) from emarket.produtos where UnidadesEstoque < NivelReabastecimento;

-- 8) Você quer saber todos os produtos da lista anterior, mas que as unidades pedidas sejam iguais a zero.
select * from emarket.produtos where UnidadesEstoque < NivelReabastecimento and UnidadesPedidas = 0;
select count(*) from emarket.produtos where UnidadesEstoque < NivelReabastecimento and UnidadesPedidas = 0;

--------------------------------------------------
-- CLIENTES

-- 1) Obtenha uma lista de todos os clientes com contato, empresa, cargo, País. 
-- Classifique a lista por país.
select Contato, Empresa, Titulo, Pais	 from emarket.clientes
order by pais;

-- 2) Queremos atender todos os clientes que possuem o título de  “Proprietário". 
-- Esse título estará em inglês (Owner).
SELECT * FROM clientes WHERE Titulo = 'Owner';

-- 3) A operadora de telefonia atendeu um cliente e não lembra o nome dele. 
-- Sabe apenas que começa com "C". Podemos ajudá-lo a obter uma lista com
-- todos os contatos que começam com a letra C?
SELECT * FROM clientes WHERE contato LIKE 'C%';


---------------------------------------------
-- FATURAS

-- 1) Obtenha uma lista de todas as faturas, ordenadas por data da fatura em ordem ascendente.
select * from emarket.faturas order by DataFatura;

-- 2) Agora é necessário uma lista de faturas com o país de envio "EUA" e
-- que a FormaeEnvio seja diferente de 3.
select * FROM FATURAS WHERE PaisEnvio = 'USA' and FormaEnvio != 3;

-- 3) O cliente 'GOURL' fez um pedido?
SELECT COUNT(*) FROM faturas WHERE clienteID = 'GOURL';
-- Sim. Fez 9

-- 4) Você deseja visualizar todas as faturas dos funcionários 2, 3, 5, 8 e 9.
select * from faturas 
where empregadoID = 2 OR empregadoID = 3 OR empregadoID = 5 OR empregadoID = 8 OR empregadoID = 9;

-------------------------------------------------
-- PRODUTOS

-- 1) Obtenha a lista de todos os produtos em ordem decrescente por preço unitário
SELECT ProdutoNome FROM produtos ORDER BY PrecoUnitario DESC;

-- 2) Obtenha a lista dos 5 melhores produtos cujo preço unitário é o mais "Caro".
SELECT ProdutoNome FROM produtos ORDER BY PrecoUnitario DESC LIMIT 5;

-- 3) Obtenha um top 10 dos produtos com mais unidades em estoque.
SELECT ProdutoNome,UnidadesEstoque FROM produtos ORDER BY UnidadesEstoque DESC LIMIT 10;


-------------------------------------------------
-- DETALHE FATURA

-- 1) Obtenha uma lista de FaturaId, Produto, Quantidade.
select FaturaId, ProdutoID, Quantidade from emarket.detalhefatura;

-- 2) Classifique a lista acima por Quantidade decrescente. 
select * from detalhefatura order by Quantidade Desc;

-- 3) Filtre a mesma lista apenas para os produtos cuja quantidade esteja entre 50 e 100. 
select * from detalhefatura where quantidade between 50 and 100 order by Quantidade Desc;

-- 4) Em outra nova consulta, obtenha uma lista com os seguintes nomes de coluna: Número da fatura (FaturaId), 
-- Produto (ProdutoId), Total (Preço Unitário * Quantidade)
select 
	FaturaID, 
    ProdutoID, 
    (PrecoUnitario * Quantidade) as total
from detalhefatura;


-------------------------------------------------
-- EXTRAS

-- 1) Obtenha uma lista de todos os clientes que moram no “Brasil” ou “México” 
-- ou que tenham um título que começa com "Vendas" (o termo estará em inglês: ‘Sales’);
select * FROM CLIENTES WHERE  PAIS = "BRAZIL" OR PAIS = "MEXICO" OR Titulo like "SALES%";

-- 2) Obtenha uma lista de todos os clientes que pertencem a uma empresa
-- que comece com a letra “A”.
select * from clientes where empresa like "A%";

-- 3) Obtenha uma lista com os seguinte dados: Cidade, Contato( renomeie para Nome e Sobrenome), 
-- Título (renomeie para Cargo), de todos os clientes que são da cidade "Madrid".
select Cidade, Contato as Nome_e_Sobrenome, Titulo as Cargo from clientes where Cidade = "Madrid";
