--Criando base de dados
create database loja;

use loja;

--Criando tabelas

create table cliente(
id_cli int identity(1,1) primary key,
nome_cli varchar(40) not null,
endereco_cli varchar(40),
cidade_cli varchar(30),
cep_cli varchar(8),
uf_cli varchar(2),
);

create table vendedor (
id_vendedor int identity(1,1) primary key,
nome_vend varchar(40),
salario decimal (10,2),
comissao decimal (10,2),
);

create table pedido(
num_pedido int identity(1,1) primary key,
id_cli int,
id_vendedor int,
prazo_entrega date,
data_pedido datetime not null DEFAULT current_timestamp

foreign key (id_cli) references cliente(id_cli),
foreign key (id_vendedor) references vendedor(id_vendedor),

);

create table produto(
id_produto int identity (1,1) primary key,
unidade varchar(4),
descricao varchar(100),
val_unit decimal(10,2),
);

create table itens_pedido(
id_item_pedido int primary key identity(1,1),
fk_num_pedido int,
fk_id_produto int,
quantidade int,

foreign key (fk_num_pedido) references pedido(num_pedido),
foreign key (fk_id_produto) references produto (id_produto)

);
--Adicionar coluna na tabela 
--alter table pedido add quantidade int;
--Excluir coluna na tabela
--alter table pedido drop column quantidade;


--Inserir dados

insert into cliente (nome_cli, endereco_cli, cidade_cli,cep_cli,uf_cli) values
('Amanda Silva', 'Rua A', 'Campinas', '08700023','SP'),
('Andre Fonseca', 'Rua B', 'Rio de janeiro', '08700124', 'RJ'),
('João Antonio', 'Rua C', 'São Paulo', '08700125', 'SP'),
('Bernadete Oliveira', 'Rua D', 'Suzano', '08700126', 'SP'),
('Carlos Soares', 'Rua E', 'Salvador', '08700126', 'BA');

select * from cliente;

insert into vendedor (nome_vend,salario,comissao) values
('Eleuterio Quispe', '3500.00','20.00'),
('Ramiro Da Silva', '2500.00', '10.00'),
('Camilo Cesto', '1500.00', '15.00'),
('Ricardo Arjona', '4500.00', '5.00'),
('Fidel Castro', '4500.00', '5.00');

select * from vendedor;

insert into produto(unidade,descricao,val_unit) values
('un','notebooke',3500.00),
('kg', 'Silicone', 50.00),
('un', 'Caixa de som', 500.00),
('pct', 'Cabo de red', 150.00),
('ml', 'Tinta de impressora', 10.00);

--select * from produto;

--alter table pedido drop column data_pedido;

--alter table pedido add data_pedido datetime;

--alter table pedido drop column data_pedido;

--alter table pedido add data_pedido datetime not null DEFAULT current_timestamp;

--alter table pedido alter column data_pedido timestamp 

insert into pedido(id_cli, id_vendedor, prazo_entrega) values 
(3, 2, '2021/10/15'); 
(2, 2, '2021-10-24'),
(2, 3, '2021-10-22'),
(4, 3, '2021-10-28'),
(5, 4, '2021-10-29');

select * from pedido;

insert into itens_pedido (fk_num_pedido, fk_id_produto, quantidade) values
(1, 3, 2),
(2, 4, 1),
(3, 1, 1),
(4, 2, 2),
(5, 5, 500);


--Quantidade de vendedores na tabela de vendedores
select count(*) as 'Quantidade de vendedores' from vendedor;

--Buscar o cliente da cidade de São Paulo
select * from cliente where cidade_cli = 'São Paulo';

--select * from cliente where cidade_cli in('São Paulo') - outra forma de uso;

--buscar o cliente com o nome que inicia na letra B

select * from cliente where nome_cli like 'B%';




select * 
--tabela com os relacionamentos (foreign key)
from pedido
--segunda tabela
inner join cliente on pedido.id_cli = cliente.id_cli
--terceira tabela
inner join vendedor 
on pedido.id_vendedor = vendedor.id_vendedor ;

--Mostrar cliente, vendedor, prazo de entrega

select c.nome_cli,v.nome_vend, p.prazo_entrega
--tabela com os relacionamentos (foreign key)
from pedido as p
--segunda tabela
inner join cliente as c on p.id_cli = c.id_cli
--terceira tabela
inner join vendedor as v
on p.id_vendedor = v.id_vendedor 
--com condição
where nome_cli = 'Andre Fonseca' and prazo_entrega > '2021-10-22';

-- mostrar por ondem de entrega
select c.nome_cli,v.nome_vend, p.prazo_entrega
from pedido as p
inner join cliente as c on p.id_cli = c.id_cli
inner join vendedor as v
on p.id_vendedor = v.id_vendedor 
order by p.prazo_entrega asc; -- pode ser desc para ordem descendente



select * from pedido;

update vendedor set salario = 2000 where id_vendedor = 3;

update vendedor set comissao = 10 where comissao =5.00;

delete from vendedor where id_vendedor=5;

--deletando vendedor com restrição por estar  relacionado com outras tabelas

delete from itens_pedido where fk_num_pedido = 5;

