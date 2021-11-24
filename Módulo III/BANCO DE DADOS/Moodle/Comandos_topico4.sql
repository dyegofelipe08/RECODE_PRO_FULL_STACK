--Definindo o Banco de Dados
use Empresa

-- Trabalhando com Insert Pessoa
insert into Cadastro.Pessoa (Nome,CPF,Logradouro,Numero,DataCadastro) Values ('Anna','23970731291','Rua Teste 01',85,getdate())

insert into Cadastro.Pessoa (Nome,CPF,Logradouro,Numero,DataCadastro) Values ('Mallu','57626342135','Estrada Teste 02',987,getdate())

insert into Cadastro.Pessoa (Nome,CPF,Logradouro,Numero,DataCadastro) Values ('Ana','19084287754','Alameda Teste 5',8547,getdate())

insert into Cadastro.Pessoa (Nome,CPF,Logradouro,Numero,DataCadastro) Values ('Tania','70734746881','Av Teste 06',127,getdate())

-- Verificando os registros Pessoa
select * from Cadastro.Pessoa

-- Trabalhando com Insert Cliente

insert into Cadastro.Cliente (IdPessoa, UltimaVisita) Values (1,getdate())

insert into Cadastro.Cliente (IdPessoa, UltimaVisita) Values (2,getdate())

insert into Cadastro.Cliente (IdPessoa, UltimaVisita) Values (10,getdate())

-- Verificando os registros inseridos Cliente
select * from Cadastro.Cliente

-- Verificando os registros Pessoa
select * from Cadastro.Pessoa

-- Trabalhando com update
update Cadastro.Pessoa Set Numero = 1857 Where IdPessoa = 2

update Cadastro.Cliente Set UltimaVisita = getdate() where IdCliente = 2

-- Trabalhando com Delete

Delete From Cadastro.Pessoa Where IdPessoa = 4

Delete From Cadastro.Pessoa Where IdPessoa = 3

Delete From Cadastro.Pessoa Where IdPessoa = 2

