CREATE SCHEMA `SPOTIFY`;
USE SCHEMA `SPOTIFY`;

CREATE TABLE `USUARIO`(
`ID_usuario` INT auto_increment NOT NULL,
`nome_usuario` VARCHAR(45),
`data_nascimento` DATE,
`sexo` VARCHAR(1),
`email` VARCHAR(150),
`senha` VARCHAR(45),
PRIMARY KEY (`ID_usuario`)
);

CREATE TABLE `ARTISTA`(
`ID_artista` INT auto_increment NOT NULL,
`nome` VARCHAR(45),
`sobrenome` VARCHAR(100),
PRIMARY KEY (`ID_artista`)
);

CREATE TABLE `GENERO`(
`ID_genero` INT auto_increment NOT NULL,
`genero` VARCHAR(45),
PRIMARY KEY (`ID_genero`)
);

CREATE TABLE `GENERO`(
`ID_genero` INT auto_increment NOT NULL,
`genero` VARCHAR(45),
PRIMARY KEY (`ID_genero`)
);

CREATE TABLE `PLAYLIST`(
`ID_playlist` INT auto_increment NOT NULL,
`id_usuario` INT,
`titulo` VARCHAR(45),
`qtd_cancoes` INT,
`data_criacao` DATETIME,
PRIMARY KEY (`ID_playlist`),
CONSTRAINT `ID_USUARIO_playlist` 
FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO`(`ID_usuario`)
);

CREATE TABLE `ALBUM`(
`ID_album` INT auto_increment NOT NULL,
`titulo` VARCHAR(45),
`id_artista` INT,
PRIMARY KEY (`ID_album`),
CONSTRAINT `ID_ARTISTA_album` 
FOREIGN KEY (`id_artista`) REFERENCES `ARTISTA`(`ID_artista`)
);

CREATE TABLE `CANCOES`(
`ID_cancao` INT auto_increment NOT NULL,
`titulo` VARCHAR(45),
`duracao` DOUBLE,
`qtd_reproducao` INT,
`qtd_likes` INT,
`id_album` INT,
PRIMARY KEY (`ID_cancao`),
CONSTRAINT `ID_ALBUM_cancoes` 
FOREIGN KEY (`id_album`) REFERENCES `ALBUM`(`ID_album`)
);

CREATE TABLE `GENEROCANCAO`(
`ID_genero_cancao` INT auto_increment NOT NULL,
`id_cancao` INT,
`id_genero` INT,
PRIMARY KEY (`ID_genero_cancao`),
CONSTRAINT `ID_GENEROCANCAO_cancoes` 
FOREIGN KEY (`id_cancao`) REFERENCES `CANCOES`(`ID_cancao`),
CONSTRAINT `ID_GENEROCANCAO_genero` 
FOREIGN KEY (`id_genero`) REFERENCES `GENERO`(`ID_genero`)
);

CREATE TABLE `GENEROCANCAO`(
`ID_genero_cancao` INT auto_increment NOT NULL,
`id_cancao` INT,
`id_genero` INT,
PRIMARY KEY (`ID_genero_cancao`),
CONSTRAINT `ID_GENEROCANCAO_cancoes` 
FOREIGN KEY (`id_cancao`) REFERENCES `CANCOES`(`ID_cancao`),
CONSTRAINT `ID_GENEROCANCAO_genero` 
FOREIGN KEY (`id_genero`) REFERENCES `GENERO`(`ID_genero`)
);

CREATE TABLE `PLAYLIST_CANCAO`(
`ID_playlist_cancao` INT auto_increment NOT NULL,
`id_cancao` INT,
`id_playlist` INT,
PRIMARY KEY (`ID_playlist_cancao`),
CONSTRAINT `ID_PLAYLISTCANCAO_cancoes` 
FOREIGN KEY (`id_cancao`) REFERENCES `CANCOES`(`ID_cancao`),
CONSTRAINT `ID_PLAYLISTCANCAO_playlist` 
FOREIGN KEY (`id_playlist`) REFERENCES `PLAYLIST`(`ID_playlist`)
);

INSERT INTO USUARIO (nome_usuario, data_nascimento, sexo, email, senha)
VALUES ("Daniel", "1986-07-17", "M", "daniel@gmail.com", "danielhouse"),
("Thiago", "1984-02-07", "M", "thiago@gmail.com", "thiagohouse"),
("Rafaela", "1994-09-26", "F", "rafaela@gmail.com", "rafahouse")
;

SELECT * FROM USUARIO;

INSERT INTO ARTISTA (nome, sobrenome)
VALUES ("Marcelo", "D2")
;

SELECT * FROM ARTISTA;

INSERT INTO ALBUM (titulo, id_artista)
VALUES ("Acústico MTV", "1"),
("A Procura da Batida Perfeita", "1"),
( "A Arte do Barulho", "1")
;

SELECT * From album;

INSERT INTO CANCOES (titulo, duracao, id_album)
VALUES ("Vai Vendo", "3.75", "1"),
("Qual É?", "4.25", "2"),
("Desabafo", "3.00", "3")
;

SELECT * from CANCOES;

SELECT vai FROM CANCOES;

select titulo from CANCOES;

select titulo from CANCOES where titulo = "desabafo";

select titulo from CANCOES where titulo like "%a%";
