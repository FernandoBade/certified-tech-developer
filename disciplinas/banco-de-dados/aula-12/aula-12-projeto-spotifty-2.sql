-- Liste as músicas que possuem a letra "z" no título.
SELECT * FROM projeto_spotify.cancao WHERE titulo LIKE '%Z%';

-- Liste as músicas que têm a letra "a" como segundo caractere e a letra "s" como último caractere.
SELECT * FROM projeto_spotify.cancao WHERE titulo LIKE '_A%S';

-- Mostre a lista de reprodução que contém mais músicas, renomeando as colunas, colocando em maiúscula a 
--  primeira letra, cancaoos acentos correspondentes e adicionando os espaços entre as palavras.
select idPlaylist as 'Id Playlist', 
 idusuario  as 'Usuário', 
 titulo as 'Título' , 
 qtdcancoes as 'Quantidade Canções', 
 Datacriacao as 'Data Criação', 
 Dataexclusao  as 'Data Exclusão' from projeto_spotify.playlist
order by qtdcancoes desc ;

-- Em outro momento, obtenha uma lista com os 5 usuários mais jovens, a partir dos próximos 10 registros.
select * from projeto_spotify.usuario
order by Data_nac DESC
LIMIT 5
offset 10;

-- Liste as 5 músicas com mais reproduções, em ordem decrescente.
select * from projeto_spotify.cancao
order by qtdreproducao desc
limit 5;

-- Gere um relatório de todos os álbuns em ordem alfabética.
SELECT * FROM projeto_spotify.album
order by TITULO ASC;
UPDATE projeto_spotify.album SET titulo=
'Plays Weir, Finnissy, Newman And Skempton' WHERE idAlbum=19;

-- Liste todos os álbuns que não possuem imagem, organizados em ordem alfabética.
select * from projeto_spotify.album
where imagemcapa is null
order by titulo asc;

-- Insira um novo usuário com os seguintes dados (leve em consideração os relacionamentos):
-- nomeusuario: novousuariodespotify@gmail.com
-- Nome e sobrenome: Elmer Santos 
-- password: S4321m
-- Data de nacimiento: 15/11/1991
-- Sexo: Masculino
-- Código Postal: B4129ATF
-- País: Brasil
select max(idUsuario) as maximo, min(idUsuario) as minimo, count(*) as total from projeto_spotify.usuario;
select * from projeto_spotify.usuario WHERE idUsuario =20;

insert into projeto_spotify.usuario (idUsuario, Nomeusuario, NomeCompleto, Data_nac, sexo, Cod, senha,
 Pais_idPais, IdTipoUsuario)
values (20,'novousuariodespotify@gmail.com', 'Elmer Santos','1991-11-15','M','B4129ATF','S4321m',9,3);


SELECT * FROM projeto_spotify.TIPOUSUARIO;
WHERE PAIS like 'bRA%';



-- Exclua todas as músicas do gênero "pop".

SELECT * FROM projeto_spotify.cancao  C WHERE NOT exists( SELECT 1 FROM projeto_spotify.generoxcancao GEN
WHERE GEN.Idcancao= C.Idcancao);

select * from projeto_spotify.generoxcancao where Idcancao IN(11,12,13,14);

select * from projeto_spotify.generoxcancao where IdGenero=9 ;
delete from projeto_spotify.generoxcancao where idGenero=9;


-- Edite todos os artistas que não possuem uma imagem carregada e carregue para eles 
-- o texto "Imagem em falta" na coluna de imagens.
select * from projeto_spotify.artista
where imagem like'Imagem em falta%';
;
update projeto_spotify.artista set  imagem = 'Imagem em falta :('
where imagem is null;











