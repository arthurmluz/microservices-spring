create table IF NOT EXISTS students.student(
	id 		int 		PRIMARY KEY AUTO_INCREMENT,
	name 		varchar(255) 	NOT NULL,
	docNumber 	varchar(255) 	NOT NULL,
	address         varchar(255) 	NOT NULL
);

create index idx_student_name on students.student(name);

insert into students.student(id, name, docNumber, address) values (1, 'Arthur', '123456', 'Predio 32');
insert into students.student(id, name, docNumber, address) values (2, 'Arthur Hakuna', '123456', 'Predio 50');
insert into students.student(id, name, docNumber, address) values (3, 'Dani', '7891011', 'Predio 15');
insert into students.student(id, name, docNumber, address) values (4, 'Manu', '121314', 'Predio 26');

select * from students.student;


create database subjects;

create table IF NOT EXISTS subjects.subject(
	id 			int 	PRIMARY KEY AUTO_INCREMENT,
	codigo  	varchar(6)	NOT NULL,
	name 		varchar(255) 	NOT NULL,
	class_time	varchar(2)	NOT NULL,
	turma   	int		NOT NULL
);

create index idx_subject_codigo on subjects.subject(codigo);
create index idx_subject_name on subjects.subject(name);

insert into subjects.subject(id, codigo, name, class_time, turma) values (1, '98802', 'Engenharia de Software 2', 'M', 30);
insert into subjects.subject(id, codigo, name, class_time, turma) values (2, '98802', 'Engenharia de Software 2', 'M', 31);
insert into subjects.subject(id, codigo, name, class_time, turma) values (3, '46110', 'Metodos Analiticos', 'A', 30);
insert into subjects.subject(id, codigo, name, class_time, turma) values (4, '33333', 'Inteligencia Artificial', 'J', 10);

select * from subjects.subject;


create database users;

create table IF NOT EXISTS users.user(
	id 		int 		PRIMARY KEY AUTO_INCREMENT,
	name 		varchar(255) 	NOT NULL,
	email 		varchar(255) 	NOT NULL,
	senha 		varchar(255) 	NOT NULL
);

create index idx_user_name on users.user(name);

insert into users.user(id, name, email, senha) values (1, 'Dani', 'dani@pucrs.br', '123123');
insert into users.user(id, name, email, senha) values (2, 'Arthur', 'arthur@pucrs.br', '123');
insert into users.user(id, name, email, senha) values (3, 'Manu', 'manu@pucrs.br', '123123');
insert into users.user(id, name, email, senha) values (4, 'Michael', 'michael@pucrs.br', 'pass');

select * from users.user;