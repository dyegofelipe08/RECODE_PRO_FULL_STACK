create database recode_squad;
use recode_squad;

create table aluno
(id_alu int primary key,
nome char(50) not null,
endereco char (60),
bairro char (30),
cidade char (30),
uf char (2)
);

insert into aluno (id_alu, nome, endereco, bairro, cidade, uf) 
values (1, 'Marcelo Antunes', 'Rua Paraibuna, 320', 'Paracambi', 'Rio de janeiro', 'rj'), 
(2, 'Dyego Felipe', 'Rua 203, 35', 'Caetés I', 'Abreu e Lima', 'pe'),
(3, 'Vinicius Nascimento', 'Rua Baependy, 577', 'Santa Terezinha', 'Diadema', 'sp'),
(4, 'Luciana Meireles', 'Rua Amazonas, 08','Campo Grande','Rio de Janeiro','rj'),
(5, 'Karoline Ribeiro', 'Rua Lorem, 787', 'Ipsum', 'Porto Alegre', 'RS'),
(6, 'Robson Junior', 'Est. Tasso Blaso, 1020', 'Santa Cruz', 'Rio de Janeiro', 'rj'),
(7, 'Lidinei Pereira', 'Rua José Pereira Bueno, 497', 'Vila Franca', 'São Paulo', 'sp');

select * from aluno;


create table telefone_aluno
(id_tel_alu int primary key identity(1,1),
numero int not null,
id_alu_tel int,
constraint fk_aluno_telefone foreign key(id_alu_tel)
references aluno (id_alu)
);

insert into telefone_aluno (numero, id_alu_tel) values 
(111111111,1),
(222222222,2),
(333333333,2),
(444444444,3),
(555555555,3),
(666666666,4),
(777777777,4),
(888888888,5),
(999999999,5),
(121212121,6),
(131313131,6),
(212121212,7),
(232323233,7);

select * from telefone_aluno
update telefone_aluno
set numero = 787878787
where id_tel_alu = 2;


create table professor
(id_pro int primary key,
nome char(50) not null,
endereco char (60),
bairro char (30),
cidade char (30),
uf char (2)
);

insert into professor (id_pro, nome, endereco, bairro, cidade, uf) 
values (1, 'Clara Meireles', 'Rua Pacui, 91', 'vargem Grande', 'Rio de janeiro', 'rj');

create table telefone_professor
(id_tel_pro int primary key,
numero int not null,
id_pro_tel int,
constraint fk_professor_telefone foreign key(id_pro_tel)
references professor (id_pro)
);

insert into telefone_professor (id_tel_pro, numero, id_pro_tel) 
values (1, 111111111, 1);

create table disciplina
(id_dis int primary key,
nome char(30) not null,
creditos int,
id_pro_dis int,
constraint fk_professor_disciplina foreign key(id_pro_dis)
references professor (id_pro)
);

insert into disciplina (id_dis, nome, creditos, id_pro_dis) 
values (1, 'matemática', 4, 1);

create table matricula
(id_mat_alu int,
id_mat_dis int,
nota float,
CONSTRAINT pk_matricula PRIMARY KEY(id_mat_alu, id_mat_dis),
constraint fk_aluno_matricula foreign key(id_mat_alu)
references aluno (id_alu),
constraint fk_disciplina_matricula foreign key(id_mat_dis)
references disciplina (id_dis)
);

insert into matricula (id_mat_alu, id_mat_dis, nota) 
values (1, 1, 8);