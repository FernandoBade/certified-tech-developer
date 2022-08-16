create table if not exists medicamentos (
    id int primary key auto_increment,
    nome varchar(255),
    laboratorio varchar(255),
    quantidade int,
    preco double not null);