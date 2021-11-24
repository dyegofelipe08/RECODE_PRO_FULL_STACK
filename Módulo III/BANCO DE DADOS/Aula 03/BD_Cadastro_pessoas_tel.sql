create database Cadastro_Aula03;

use Cadastro_Aula03;

create table pessoas (
id_pessoa int primary key identity (1,1),
nome_pessoa varchar(80),
idade_pessoa tinyint
);

create table telefone (
id_telefone int primary key identity(1,1),
num_telefone int not null,
fk_pessoas_telefone int

);

insert into pessoas (id_pessoa,)