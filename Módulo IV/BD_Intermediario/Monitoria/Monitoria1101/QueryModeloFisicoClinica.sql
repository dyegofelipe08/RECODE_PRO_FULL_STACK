
create database ClinicaMonitoria1101;


use ClinicaMonitoria1101;
/* Lógico_1: */

CREATE TABLE Medico (
    CRM varchar PRIMARY KEY,
    Nome varchar(50),
    Especialidade varchar(50)
);

select * from Medico;

/*Inserção de valores na tabela médico */

insert into Medico(CRM,Nome, Especialidade) values
('1', 'Gilberto', 'Clínico Geral'),
('2', 'Prisciele', 'Obstetra'),
('3', 'Oliveira', 'Cargiologista'),
('4', 'Andrade','Neurologista'),
('5', 'Miranda', 'Psciquiatra' );



CREATE TABLE Consulta (
    Id_Consulta int PRIMARY KEY identity (1,1),
    Data_consulta date,
    fk_Medico_CRM varchar,
    fk_Paciente_Id_Paciente int
);

/*Alteração do nome da coluna Data para Data_consulta */

Alter table Consulta drop column Data;
Alter table Consulta add  Data_consulta date;
select * from Consulta;

/*Inserção de valores na tabela consulta */

insert into Consulta (fk_Medico_CRM, fk_Paciente_Id_Paciente, Data_consulta) values
('1', 1, '2022-02-15' ),
('2', 2, '2022-01-26' ),
('3', 3, '2022-02-23' ),
('4', 4, '2022-01-15' ),
('5', 5, '2022-02-07' );







CREATE TABLE Paciente (
    Id_Paciente int PRIMARY KEY identity(1,1),
    Nome varchar(50),
    Sexo varchar(50),
    Endereco varchar(50),
    Cidade varchar(50),
    UF varchar(2),
    Data_Nasc date
);

/*Inserção de valores na tabela paciente */
select * from Paciente;
insert into Paciente(Nome,Sexo,Endereco,Cidade,UF,Data_Nasc) values
('Dyego Felipe', 'masculino', 'Rua 203', 'Abreu e Lima', 'PE','1993-08-08'),
('Prisciele Andrade', 'feminino', 'Rua 203', 'Abreu e Lima', 'PE','1994-12-15'),
('Felipe de Oliveira', 'masculino', 'Rua 179', 'Abreu e Lima', 'PE','1993-08-08'),
('Andrade de Miranda', 'feminino', 'Rua 113', 'Abreu e Lima', 'PE','1994-12-15'),
('Fulano da Silva', 'masculino', 'Rua 150', 'Abreu e Lima', 'PE','1993-09-13');


 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_2
    FOREIGN KEY (fk_Medico_CRM)
    REFERENCES Medico (CRM)
    ON DELETE CASCADE;
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_3
    FOREIGN KEY (fk_Paciente_Id_Paciente)
    REFERENCES Paciente (Id_Paciente)
    ON DELETE CASCADE;

	select * from Consulta;


/*Utilização de procedures*/


create procedure InserirMedico
@CRM varchar (10),
@Nome varchar (50),
@Especialidade varchar (50)
as 
insert into Medico 
(
CRM,
Nome,
Especialidade
)
values
(
@CRM,
@Nome,
@Especialidade
);

/*Execução da procedure*/

Exec InserirMedico @CRM = '6', @Nome ='João', @Especialidade = 'Dentista';


create procedure bucarMedico
@Nome varchar (50)
as 
select * from Medico where Medico.Nome = @Nome;


Exec bucarMedico @Nome = 'Oliveira';

create procedure buscarPaciente
as
select * from Paciente where Id_Paciente>2;

Exec buscarPaciente;

create procedure excluirPaciente
@Id int
as
delete from Paciente where Id_Paciente = @Id;

exec excluirPaciente @Id = 5;


select * from Paciente;


/*Exemplo de criação e utilização de views*/

create view id_NomePaciente as
select Paciente.Id_Paciente, Paciente.Nome from Paciente;

select * from id_NomePaciente;

select * from Paciente, Consulta, Medico
where Id_Paciente = fk_Paciente_Id_Paciente;


create view qtd_ConsultaPaciente as
select Paciente.Nome, Paciente.Id_Paciente, count (Consulta.Id_Consulta) as 'Qtd de consultas'
from Paciente, Consulta
where Paciente.Id_Paciente = Consulta.fk_Paciente_Id_Paciente
group by Paciente.Id_Paciente, Paciente.Nome;

select * from qtd_ConsultaPaciente;

/*Inserção de dados para teste*/

insert into Consulta (Data_consulta, fk_Medico_CRM, fk_Paciente_Id_Paciente) values ('20220123', '1', 1);