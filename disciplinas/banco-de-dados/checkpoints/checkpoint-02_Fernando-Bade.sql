/* O banco de dados terá como objetivo a sistematização de uma bibioteca e contará com registros dos usuários, livros, editoras, empréstimos e histórico de locação dos usuários.*/

create schema entrega_checkpoint_02;

use entrega_checkpoint_02;

-- criação das tabelas

create table entrega_checkpoint_02.usuario (
id_usuario int not null auto_increment,
nome varchar(50) not null,
sobrenome varchar(150) not null,
telefone varchar(15) not null,
endereco varchar(150) not null,
cpf char(11) not null,
primary key (id_usuario));
  
  
create table entrega_checkpoint_02.editora (
id_editora int not null auto_increment,
nome varchar(100) null,
cnpj char(14) null,
endereco varchar(150) null,
telefone varchar(15) null,
primary key (id_editora));
  
create table entrega_checkpoint_02.autor (
id_autor int not null auto_increment,
nome_autor varchar(100) not null,
sobrenome_autor varchar(150) not null,
primary key (id_autor));
  
  
create table entrega_checkpoint_02.livro (
id_livro int not null auto_increment,
titulo varchar(100) not null,
isbn char(13) not null,
ano_publicacao date not null,
prefacio text not null,
autor int not null,
editora int not null,
primary key (id_livro),
constraint fkautor foreign key (autor) references entrega_checkpoint_02.autor (id_autor),
constraint fkeditora foreign key (editora) references entrega_checkpoint_02.editora  (id_editora));

create table entrega_checkpoint_02.emprestimo (
id_emprestimo int not null auto_increment,
data_retirada date not null,
data_devolucao date not null,
usuario int not null,
livro int not null,
primary key (id_emprestimo),
constraint fkusuarioemp foreign key (usuario) references  entrega_checkpoint_02.usuario  (id_usuario),
constraint fklivro foreign key (livro) references  entrega_checkpoint_02.livro  (id_livro));

create table  entrega_checkpoint_02.historico_usuario (
id_historico int not null auto_increment,
usuario_historico int not null,
emprestimo_historico int not null,
primary key (id_historico),
constraint fkusuariohist foreign key (usuario_historico) references entrega_checkpoint_02.usuario  (id_usuario),
constraint fkemprestimohist foreign key (emprestimo_historico) references entrega_checkpoint_02.emprestimo (id_emprestimo));
        
create table  entrega_checkpoint_02.autoresxeditoras (
id_autoresxeditoras int not null auto_increment,
autores int null,
editoras int null,
primary key (id_autoresxeditoras),
constraint fkautorxeditora foreign key (autores) references entrega_checkpoint_02.autor (id_autor),
constraint fkeditoraxautor foreign key (editoras) references entrega_checkpoint_02.editora (id_editora));

-- Utilização de comandos CRUD

--
select * from autor;
alter table entrega_checkpoint_02.autor change sobrenome_autor ultimo_sobrenome_autor varchar (30);
alter table entrega_checkpoint_02.livro change ano_publicacao ano_lancamento year;
alter table entrega_checkpoint_02.livro RENAME TO  entrega_checkpoint_02.livros;
alter table entrega_checkpoint_02.emprestimo DROP FOREIGN KEY fklivro;
alter table entrega_checkpoint_02.emprestimo ADD FOREIGN KEY (livro) REFERENCES livro(id_livro);
--

-- 
select * from usuario;

insert into entrega_checkpoint_02.usuario (nome, sobrenome, telefone, endereco, cpf)
VALUES  ('Fernando', 'Bade', '11958044017', 'Rua Belém, 1290', '12345678900'),
		('Renata ', 'Ramos', '1616432974', 'Rua José Quirino, 335', '98765432100'),
        ('Sonia', 'Maria', '35974465313', 'Rua Manoel Garcia, 229', '3436544658'),
        ('Jorge', 'Domingo', '11993561793', 'Rua Santo Antonio, 1000', '12332145665'),
        ('Floripes', 'Antonia', '11996677663', 'Avenida Higienópolis', '9963'),
        ('Christh', 'Teixeira', '11973232412', 'Rua da DH, 2021', '11122233300');
--

--
update entrega_checkpoint_02.usuario set nome = 'Cris', endereco = 'Avenida Digital House' where id_usuario = 6;
update entrega_checkpoint_02.usuario set telefone = '11999999999' where id_usuario = 2;
--

-- 
select * from usuario;
delete from entrega_checkpoint_02.usuario where id_usuario = 4;
-- 

-- Inserts adicionais

--
select * from autor;
insert into entrega_checkpoint_02.autor (nome_autor, ultimo_sobrenome)
VALUES  ('J. R. R.', 'Tolkien'),
		('George R. R.', 'Martin'),
		('J. K. ', 'Rowling'),
		('Stephen ', 'King'),
		('Dan', 'Brown');

select * from editora;
insert into entrega_checkpoint_02.editora (nome, cnpj, endereco, telefone)
VALUES  ('HarperCollins', '12345678000100', 'Rua da Quitanda, 86', '(21) 3175-1030'),
		('Rocco', '98765432000100', 'Rua Júlio Diniz, 56', '(11) 3729-0244'),
        ('Editora Arqueiro', '11222333000100', 'Rua Eng. Albert Leimer, 300', '(21) 2538-4100');

select * from livro;
insert into entrega_checkpoint_02.livro (titulo, isbn, ano_lancamento, prefacio, autor, editora)
VALUES  ('O Senhor dos Anéis: A Sociedade do Anel', '8595084750', '2019', 'O volume inicial de O Senhor dos Anéis, lançado originalmente em julho de 1954, foi o primeiro grande épico de fantasia moderno, conquistando milhões de leitores e se tornando o padrão de referência para todas as outras obras do gênero até hoje. A imaginação prodigiosa de J.R.R. Tolkien e seu conhecimento profundo das antigas mitologias da Europa permitiram que ele criasse um universo tão complexo e convincente quanto o mundo real.', '1', '1'),
		('O Senhor dos Anéis: As Duas Torres', '8595084777', '2019', 'O segundo volume de O Senhor dos Anéis, mais importante épico de fantasia moderno, narra os caminhos separados seguidos pelos membros da Sociedade do Anel em sua luta para deter Sauron, o Senhor Sombrio da terra de Mordor, e destruir o Um Anel, no qual está contida a maior parte do poder do tirano demoníaco imaginado por J.R.R. Tolkien.', '1', '1'),
		('O Senhor dos Anéis: O Retorno do Rei', '8595084769', '2019', 'A guerra entre os Povos Livres da Terra-média e Sauron, o Senhor Sombrio da terra de Mordor, chega a seu clímax neste terceiro volume do romance O Senhor dos Anéis. As batalhas grandiosas que estão prestes a acontecer, no entanto, são apenas o pano de fundo para o verdadeiro drama: a missão quase suicida dos hobbits Frodo e Sam, que tentam destruir o Um Anel, fonte do poder de Sauron, infiltrando-se no coração do território do Inimigo.', '1', '1'),
		('Harry Potter e a Pedra Filosofal ', '6899762693', '1997', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed semper velit sit amet dolor imperdiet ultrices. Curabitur non dapibus magna. Nunc sit amet mattis mi. Pellentesque lobortis at elit ac dictum. Mauris faucibus nunc vel dapibus lacinia. Proin faucibus, libero at porta pharetra, ante mi posuere justo, vel molestie massa odio sed libero. Cras sagittis feugiat sollicitudin. Donec feugiat massa sem, ut rhoncus nunc ultricies non.', '3', '2'),
		('Harry Potter e a Câmara Secreta', '9085771869', '1998', 'Aliquam id justo at est laoreet eleifend at sit amet metus. Curabitur eget elit vitae dui accumsan hendrerit nec ut mi. Nunc venenatis, nisl a cursus ullamcorper, mauris ex malesuada odio, quis semper tortor purus pulvinar purus. Pellentesque eu feugiat mi. Phasellus odio erat, dignissim bibendum varius quis, interdum non augue. Proin ac sollicitudin erat. Nam fringilla mauris vel risus posuere, vel tempor ante accumsan. Curabitur maximus facilisis nisl, eu tempus risus posuere a. Quisque in nulla sed augue maximus consequat at eu nibh. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque nunc risus, pharetra eget tempor ac, porttitor sed quam. Quisque ut urna interdum, accumsan sapien eu, tempor velit.', '3', '2'),
		('Harry Potter e o Prisioneiro de Azkaban ', '2773546348', '1999', 'Etiam hendrerit iaculis imperdiet. Aliquam sit amet tortor enim. Nullam dolor sapien, scelerisque id leo non, tempor condimentum diam. Cras accumsan nunc massa, in bibendum purus malesuada non. Cras mi nisl, convallis ac neque non, consectetur hendrerit mi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Etiam elementum purus non ligula varius, vitae viverra velit vestibulum. Morbi metus purus, mattis ut commodo in, placerat et ligula. Nam finibus ornare mauris, ac euismod augue elementum in. Sed vitae ultrices nisl.', '3', '2'),
		('Harry Potter e o Cálice de Fogo', '6567457672', '2000', 'Nunc ut purus neque. Nulla eget metus vel nulla rutrum finibus quis eu nulla. Vestibulum vulputate, purus ac venenatis congue, risus diam vulputate neque, a lobortis purus turpis nec libero. Mauris cursus orci quam, et luctus mauris vestibulum eu. Ut volutpat ac tortor at interdum. Sed justo leo, auctor eu quam et, sodales congue est. Sed mollis convallis dui. Sed faucibus, sem eget hendrerit pellentesque, purus urna porttitor orci, id volutpat ligula dui convallis augue. In hac habitasse platea dictumst. Fusce elementum at lectus sit amet tincidunt. Donec faucibus nisl ac sem mattis, ac semper orci scelerisque. Duis aliquam, urna sed elementum sagittis, nulla sapien rhoncus neque, vel venenatis ex diam a nisl. Mauris varius convallis orci, vel mollis ipsum. Quisque sodales nibh suscipit, elementum enim vulputate, bibendum nunc.', '3', '2'),
		('Harry Potter e a Ordem da Fênix ', '6525869737', '2003', 'Donec at sapien id ipsum egestas lobortis. Sed auctor fermentum ante, non tincidunt augue iaculis lobortis. Cras risus lacus, pharetra id felis non, lobortis ultricies enim. Etiam dignissim turpis id tortor interdum, ut scelerisque quam sagittis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis eu arcu eu odio molestie laoreet vitae vel ante. Aenean rutrum rhoncus lectus ac faucibus. Praesent ante tellus, molestie ut porttitor eu, egestas a justo. Mauris ultrices nisl nec consequat porta. Morbi non odio velit. Nunc facilisis ligula velit, sit amet sollicitudin tellus tempus ut.', '3', '2'),
		('Harry Potter e o Enigma do Príncipe', '3899967400', '2005', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin blandit sodales diam eget consectetur. Praesent laoreet lectus sit amet enim placerat semper. Ut ac nulla a libero blandit sagittis. Donec in libero ac dolor viverra elementum et eu nisl. Fusce lacinia hendrerit ex nec scelerisque. Nunc pharetra pulvinar blandit. Integer dapibus neque sit amet augue tincidunt imperdiet. Vivamus eleifend malesuada ante quis convallis. Nullam dictum pellentesque porttitor. Mauris consectetur neque arcu, id posuere nulla pretium non. Aenean hendrerit viverra elit. Fusce id maximus ligula, a feugiat ipsum. Maecenas porta ut justo eget mollis.', '3', '2'),
		('Harry Potter e as Relíquias da Morte ', '5539831668', '2007', 'Praesent ultricies congue augue, eu commodo arcu semper in. Aliquam faucibus turpis a leo congue faucibus a a erat. Praesent gravida sodales risus, nec elementum nisi aliquet quis. Vivamus venenatis vehicula ex sit amet dapibus. Aliquam ut velit non odio congue sagittis. Praesent ac est ante. Donec eu purus placerat, pulvinar tellus id, bibendum lorem. Pellentesque et purus id eros semper efficitur. Quisque feugiat risus id orci faucibus, vitae lacinia libero lobortis.', '3', '2'),
		('Harry Potter e a Criança Amaldiçoada ', '2707565878', '2016', 'Nam gravida fermentum neque, sed semper dolor rhoncus vel. Nullam quis risus venenatis ipsum lacinia fermentum. Nam iaculis efficitur dignissim. Integer imperdiet eu lacus eu ultrices. Curabitur elementum risus in mollis placerat. Morbi in tellus sed tellus egestas vehicula. Sed hendrerit vitae lacus vitae bibendum. Quisque non tempor lacus. Nullam faucibus, massa ac maximus tristique, nibh sem finibus orci, cursus scelerisque est diam sed lorem.', '3', '2'),
		('Anjos e demônios', '8575421468', '2009', 'Antes de decifrar O Código Da Vinci, Robert Langdon, o famoso professor de simbologia de Harvard, vive sua primeira aventura em Anjos e demônios, quando tenta impedir que uma antiga sociedade secreta destrua a Cidade do Vaticano.', '5', '3');

select * from autoresxeditoras;
insert into entrega_checkpoint_02.autoresxeditoras (autores, editoras)
VALUES  ('1', '1'),
		('3', '2'),
        ('5', '3'),
		('2', '1'),
        ('5', null);

select * from emprestimo;
insert into entrega_checkpoint_02.emprestimo (data_retirada,data_devolucao, usuario, livro)
VALUES  ('2021-09-01', '2021-09-11', '1', '1'),
		('2021-08-01', '2021-08-11', '1', '2'),
		('2021-07-01', '2021-07-11', '1', '3'),
		('2021-01-01', '2021-01-21', '2', '4'),
		('2021-02-01', '2021-02-21', '2', '1'),
		('2021-03-01', '2021-03-15', '5', '12');

-- Joins

select * from livro;
--

--
select livro.titulo, livro.autor
from livro
where livro.titulo like '%Anéis%';
--

--
select livro.titulo, livro.autor, autor.nome_autor
from autor
left join livro  on livro.autor = autor.id_autor;
--

--
select livro.titulo, concat(nome_autor, ' ', autor.ultimo_sobrenome), livro.ano_lancamento
from livro
right join autor on livro.autor = autor.id_autor
order by livro.titulo;
--

--
select usuario.nome, emprestimo.livro, livro.titulo
from usuario
inner join emprestimo on usuario.id_usuario = emprestimo.usuario
inner join livro on livro.id_livro = emprestimo.livro;
--


