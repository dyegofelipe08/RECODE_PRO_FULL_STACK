create table telefone(
id_tel int primary key,
numero int);

drop table telefone;

alter table telefone add ddd int;

create unique index ix_nome on pessoas(nome); 
alter table telefone drop column ddd;
alter table telefone add id_pes int;
alter table telefone drop column id_pes;

alter table telefone add id_pes int;

insert into pessoas (id, nome) values (1, 'Dyego');
select * from pessoas;

drop index ix_nome on pessoas;

create index ix_nome on pessoas (nome); 

insert into pessoas (id,nome) values (3, 'Dyego');
select * from pessoas;

update pessoas
set nome  = 'Dyego Felipe de Oliveira'
Where id = 3;
select * from pessoas;
