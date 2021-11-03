select max(valor_total), cidade_cobranca from faturas where cidade_cobranca='Oslo'; 

select min(valor_total) from faturas; 

select avg(valor_total) from faturas where pais_cobranca='Canada' ;

select count(*) from faturas where pais_cobranca='Canada' ;

select avg(valor_total) from faturas where pais_cobranca='Canada' ;

select sum(valor_total) from faturas;

select id, data_fatura, valor_total from faturas  where valor_total < (select avg(valor_total) from faturas);

select max(data_nascimento) from empregados;

select min(data_nascimento) from empregados;

select date_format (data_nascimento,'%d %M %y' ) from empregados as Data_nascimento;

select count(*) from cancoes where compositor = 'Ac/Dc';

select avg (duracao_milisegundos) from cancoes;

select avg (duracao_milisegundos) from cancoes  where compositor = 'Ac/Dc';

select count(1) from clientes where cidade= 'São Paulo'; 

select count(1) from clientes where cidade= 'Paris'; 

select * from clientes where cidade='Paris';

select count(1) from clientes where email like '%yahoo%';

