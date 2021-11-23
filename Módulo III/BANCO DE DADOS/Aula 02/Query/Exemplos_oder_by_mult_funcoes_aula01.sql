create table curso(
codC varchar(10) not null,
nomeC varchar(30) not null,
duracaoC int not null, 
mensC float);

select * from curso; 
create index ix_curso on curso (nomeC);

insert into curso (codC, nomeC,duracaoC,mensC) values ('C1','An�lise sist.', 4, 400);
insert into curso (codC, nomeC,duracaoC,mensC) values ('C2','Eng. Mecatr�nica', 5, 600);
insert into curso (codC, nomeC,duracaoC,mensC) values ('C3','Ci�ncia da computa��o', 4, 450);
insert into curso (codC, nomeC,duracaoC,mensC) values ('C4','Eng. El�trica', 4, 600);
insert into curso (codC, nomeC,duracaoC,mensC) values ('C5','Turismo', 3, 350);

select * from curso;

select max(mensC) from curso;

select nomeC, mensC from curso 
where (duracaoC=3 or duracaoC=5);

select duracaoC, duracaoC * 2 as mult  from curso order by mult desc; 


