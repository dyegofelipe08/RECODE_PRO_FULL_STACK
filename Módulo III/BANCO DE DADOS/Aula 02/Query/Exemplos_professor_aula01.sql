create table telefone
(id_tel int primary key,
numero int);



drop table telefone;



alter table telefone add ddd int;



create unique index ix_nome on pessoas(nome);



alter table telefone drop column ddd;



alter table telefone add id_pes int;



insert into pessoas (id, nome) values (1, 'Marcela');
select * from pessoas;



insert into pessoas (id, nome) values (2, 'Marcela Araujo');




drop index ix_nome on pessoas;
create index ix_nome on pessoas(nome);
insert into pessoas (id, nome) values (3, 'Marcela');
select * from pessoas;



update pessoas
set nome = 'Carlos Augusto';



select * from pessoas;



-- altera informações
/*update pessoas
set nome = 'Marcela Araujo'
where id = 2;
select * from pessoas;
*/



delete from pessoas
where id = 1;



delete from pessoas
where nome = 'Marcela Araujo';



select * from pessoas;



insert into pessoas (id, nome) values (6, 'Andre');



insert into pessoas (id, nome) values (5, 'carla');



select count(nome)
from pessoas;



select avg(id)
from pessoas;



select distinct nome
from pessoas where nome = 'andre';



select id
from pessoas where nome = 'andre';



select id, (id * 2), (id /3)
from pessoas;