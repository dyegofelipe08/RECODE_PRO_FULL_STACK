alter table dbo.Contrato  add Desconto decimal(18,2);


/*Exemplo de uso de inner join*/
select * from contrato inner join Aluno  on Aluno.Id_Aluno = Contrato.Id_Aluno 
where Contrato.Id_Aluno = 1;

select * from contrato;

select getdate() go ;


/*Exemplo de fun��es*/

create function aplicarDesconto (@valor decimal (18,2))	returns decimal (18,2)

begin

declare @total decimal (18,2);
set @total  = @valor * 0.10;
return @total;

end
go




/*Cria��o da fun��o*/
if object_id(N'dbo.aplicarDesconto', N'FN') is not null
drop function aplicarDesconto;
go
create function dbo.aplicarDesconto(@valor decimal(18,2), @taxa decimal (4,2)) returns decimal (18,2)
as	
begin
declare @total decimal(18,2);
select @total = @valor * @taxa;
return @total;
end;
go


/*Aplica��o da fun��o com update*/

update Contrato set Desconto = dbo.aplicarDesconto(Valor_Total, 0.10) where Id_Contrato =1 or Id_Contrato=2;


select * from Aluno;
/*Cria��o de view*/

create view exibirNomes as
select Nome_Aluno
from Aluno;


/*Aplica��o de view*/
select * from exibirNomes;

