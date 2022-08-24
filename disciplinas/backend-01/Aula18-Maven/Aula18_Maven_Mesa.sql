create table if not exists pacientes (
id int auto_increment primary key, nome varchar(255), sobrenome varchar(255), rg varchar(20), dataCadastro varchar(255), enderecoid int);

create table if not exists enderecos (
id int auto_increment primary key, rua varchar(255), numero int, bairro varchar(255), cidade varchar(255));