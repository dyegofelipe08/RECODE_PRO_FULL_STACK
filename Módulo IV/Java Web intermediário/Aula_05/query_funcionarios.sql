create database		;

use AulaJava2801;

create table Funcionarios(
Id int primary key,
Matricula varchar(15),
Nome varchar(50),
SalarioBruto real,
SalarioLiquido real,
);

select * from Funcionarios;