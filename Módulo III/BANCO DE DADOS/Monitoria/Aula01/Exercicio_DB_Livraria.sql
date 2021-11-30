create database Livraria;

use Livraria;

create table autores(
id_autor int primary key identity(1,1),
nome_autor varchar(40),
sobrenome_autor varchar(40)
);

create table editoras(
id_editora int primary key identity(1,1),
nome_editora varchar(40)
);

create table livros (
id_livro int primary key identity(1,1),
nome_livro varchar (50),
isbn varchar(30),
data_publicacao date,
preco decimal(8,2),
fk_id_autor int,
fk_id_editora int,

foreign key (fk_id_autor) references autores (id_autor),
foreign key (fk_id_editora) references editoras (id_editora)

);


