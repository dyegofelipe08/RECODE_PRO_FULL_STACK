use Empresa;

select * from Cadastro.Cliente;
select * from Cadastro.Pessoa;

insert into Cadastro.Pessoa (Nome,CPF, Logradouro, Numero, DataCadastro) values
('Anna', '23649622465','Rua teste 01',85, getdate()),
('Prisciele', '98666633355','Rua teste 02',75, getdate()),
('Dyego', '89565555589','Rua teste 03',45, getdate()),
('Felipe', '99811256555','Rua teste 04',55, getdate());

insert into Cadastro.Cliente (IdPessoa,UltimaVisita) values
--(1,getdate()),
--(2,getdate()),
(3,getdate());

update Cadastro.Pessoa set Numero = 95 where IdPessoa = 2;
update Cadastro.Cliente set UltimaVisita = getdate() where IdCliente =2;

delete from Cadastro.Pessoa where IdPessoa =4;
delete from Cadastro.Pessoa where IdPessoa = 1; -- Não é possível deletar eesta pessoas, pois a mesma está vinculada
-- a um fk na tabela cliente.

delete from Cadastro.Cliente where IdPessoa=1; -- Removendo a pessoa Id =1 para possibilitar a exclusao na tabela pessoa.



