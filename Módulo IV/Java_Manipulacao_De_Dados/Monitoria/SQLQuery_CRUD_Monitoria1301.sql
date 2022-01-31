create database crudMonitoria;

use crudMonitoria;

create table Contatos (

Id int not null primary key identity (1,1),
Nome varchar(50),
Idade int,
DataCadastro date

);

select * from Contatos;
