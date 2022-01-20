/* Lógico_1: */

CREATE TABLE Medico (
    CRM varchar PRIMARY KEY,
    Nome varchar(50),
    Especialidade varchar(50)
);

CREATE TABLE Consulta (
    Id_Consulta varchar PRIMARY KEY,
    Data date,
    fk_Medico_CRM varchar,
    fk_Paciente_Id_Paciente varchar
);

CREATE TABLE Paciente (
    Id_Paciente varchar PRIMARY KEY,
    Nome varchar(50),
    Sexo varchar(50),
    Endereco varchar(50),
    Cidade varchar(50),
    UF Char,
    Data_Nasc date
);
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_2
    FOREIGN KEY (fk_Medico_CRM)
    REFERENCES Medico (CRM)
    ON DELETE CASCADE;
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_3
    FOREIGN KEY (fk_Paciente_Id_Paciente)
    REFERENCES Paciente (Id_Paciente)
    ON DELETE CASCADE;