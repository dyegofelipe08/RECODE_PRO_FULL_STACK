USE [MeuBancoDeDados]
IF OBJECT_ID('dbo.Fornecedores', 'U') IS NOT NULL DROP TABLE dbo.Fornecedores
GO
CREATE TABLE dbo.Fornecedores (
ID_Fornecedor INT NOT NULL PRIMARY KEY,
Nome [NVARCHAR](50) NOT NULL,
Contato [NVARCHAR](50) NOT NULL,
Email [NVARCHAR](50) NOT NULL
);
GO

if object_id ('dbo.Sugestoes', 'U') is not null Drop table  dbo.Sugestoes
go
create table dbo.Sugestoes (
Id_Sugestao int not null primary key,
Data_sugestao [nvarchar](50) not null,
texto [nvarchar](50) not null
);
go

select * from Sugestoes;

insert into dbo.Sugestoes
([Id_Sugestao], [Data_sugestao], [texto]) values 
(1, '12/02/2021', 'Sugestão 1'),
(2, '12/02/2021', 'Sugestão 2');






select * from Aluno;

update Aluno set Id_Conjuge = 2, Id_Contrato = 1, Id_Turma = 2 where Id_Aluno = 1;
update Aluno set Id_Conjuge = 3, Id_Contrato = 2, Id_Turma = 1 where Id_Aluno = 2;
update Aluno set  Id_Contrato = 1, Id_Turma = 2 where Id_Aluno = 5;


SET IDENTITY_INSERT Aluno ON
insert into dbo.Aluno
([Id_Aluno], [Nome_Aluno],[Endereco],[Data_nasc],[CPF],[RG],[Id_Conjuge],[Id_Contrato],[Id_Turma])
values 

(1,'Dyego Felipe', 'R. 203 N.35','08/08/1993','123456789','123456', null, null, null),
(2,'Beltrana Costa', 'R. 200 N.35','15/09/1993','123456789','123456',null, null, null),
(5,'Beltrana Costa', 'R. 200 N.35','15/09/1993','123456789','123456',null, null, null);
SET IDENTITY_INSERT Aluno OFF

select * from Contrato;

update Contrato set Id_Curso = 1, Id_Modulo = 1, Id_Turma = 2 where Id_Contrato = 1;
update Contrato set Id_Curso = 2, Id_Modulo = 2, Id_Turma = 1 where Id_Contrato = 2;

SET IDENTITY_INSERT Contrato ON
insert into dbo.Contrato
([Id_Contrato], [Modalidade_PG],[Valor_Total],[Status],[Id_Vendedor],[Id_Aluno],[Id_Curso],[Id_Modulo],[Id_Turma])
values 
(1,'Dinheiro',1499.99 ,'Ativo',null,1, null, null, null),
(2,'Dinheiro',2500.00 ,'Ativo',null,2, null, null, null);
SET IDENTITY_INSERT Contrato OFF

select * from Vendedor;

insert into dbo.Vendedor 
([Nome_Vendedor])
values
('Vendedor 1'),
('Vendedor 2');



update Contrato set Id_Vendedor = 2 where Id_Contrato = 2;


select * from Conjuge;

insert into dbo.Conjuge 
([Nome_Conjuge],[Data_Nasc],[Id_Aluno]) values
('Prisciele Miranda', '15/12/1994', 1),
('Fulano da Silva', '17/05/1994', 2);

select * from Turma;

insert into dbo.Turma
([Data_inicio], [Dias_Aula],[Horario_Aula],[Id_Modulo],[Id_Curso],[Id_Professor_Titular]) values
('07/05/2022', '90', '9h às 13h', null, null, null),
('23/05/2022', '150', '14h às 18h', null, null, null);

select * from Curso;

insert into dbo.Curso
([Descricao]) values
('Inglês intermediário'),
('Inglês avançado');

select * from Modulo;

insert into dbo.Modulo 
([Descricao], [Id_Curso]) values
('Módulo II', 1),
('Módulo I', 2);

update Turma set Id_Modulo = 1, Id_Curso = 2 where Id_Turma = 1;
update Turma set Id_Modulo = 2, Id_Curso = 1 where Id_Turma = 2;






