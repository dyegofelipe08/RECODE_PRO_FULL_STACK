create database CrudJava1801;

use CrudJava1801;

create table Aluno 
(Id_aluno int not null identity (1,1) primary key,
nome nvarchar(50) not null);

select * from Aluno;

ALTER TABLE dbo.Aluno ADD Data_cadastro date NULL;

