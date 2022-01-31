create database AulaJava2601;

use AulaJava2601;

create table Pessoa(
Id int primary key Identity(1,1),
Nome varchar(50)

);

select * from Pessoa;

create table Alunos (
Id int  primary key,
Matricula varchar(15),
Nome varchar (50),
Teste real,
Prova real,
Media real
);
select * from Alunos;


create table Produtos (

Id int primary key,
Codigo  varchar(15),
Descricao varchar (100),

);

select * from Produtos;