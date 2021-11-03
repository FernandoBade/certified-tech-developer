CREATE SCHEMA `dhtube`;
use `dhtube`;

CREATE TABLE `dhtube`.`avatar`(
`idAvatar` INT AUTO_INCREMENT NOT NULL,
`nome` VARCHAR (45),
`urlImagem` VARCHAR(100),
PRIMARY KEY (`idAvatar`)
);


CREATE TABLE `dhtube`.`pais` (
`idPais` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
`nome` VARCHAR(100)
);


create table `dhtube`.`usuario` (
`idUsuario` INT (11) AUTO_INCREMENT NOT NULL,
`nome` varchar (45),
`email` varchar (45),
`senha` varchar (45),
`dataNascimento` datetime,
`cep` varchar (45),
primary key (`idUsuario`),
`idPais` int (11), CONSTRAINT `fkpais` FOREIGN KEY (`idPais`) REFERENCES `dhtube`.`pais`(`idPais`),
`idAvatar` int (11), CONSTRAINT `fkavatar` FOREIGN KEY (`idAvatar`) REFERENCES `dhtube`.`avatar`(`idAvatar`)
);

CREATE TABLE `dhtube`.`playlist`(
`idPlaylist` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT, 
`NOME` VARCHAR(45) NULL,
`dataCriacao` DATETIME NULL,
`privado` SMALLINT(6),
`Usuario_idUsuario` INT(11),
CONSTRAINT `FKidUsuario` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `dhtube`.`usuario`(`idUsuario`)
);

CREATE TABLE `dhtube`.`canal`(
`id_canal` INT NOT NULL,
`idUsuario` INT(11),
`nome` VARCHAR(45) NULL,
`descricao` TEXT NULL,
`dataCriacao` DATETIME,
PRIMARY KEY (`id_canal`),
CONSTRAINT `fkusuario` FOREIGN KEY (`idUsuario`) REFERENCES `dhtube`.`usuario`(`idUsuario`)
);

create table `dhtube`. `video`(
`idVideo` int not null,
`Usuario_idUsuario` int (11),
`titulo` varchar (100),
`descricao` text,
`tamanho` double,
`nomeArquivo` varchar (100),
`duracao` double,
`imagem` varchar (100),
`qtdReproducoes` int (11),
`qtdLikes` int (11),
`qtdDislikes` int (11),
`privado` smallint (6),
`dataPublicacao` datetime,
primary key (`idVideo`),
constraint `usuarios` foreign key (`Usuario_idUsuario`) references `usuario` (`idUsuario`)
);

CREATE TABLE `dhtube`.`playlist_video` (
`idVideo` INT(11), CONSTRAINT `fkvideo` FOREIGN KEY (`idVideo`) REFERENCES `dhtube`.`video`(`idVideo`),
`idPlaylist` INT(11), CONSTRAINT `fkplaylist` FOREIGN KEY (`idPlaylist`) REFERENCES `dhtube`.`playlist`(`idPlaylist`)
);