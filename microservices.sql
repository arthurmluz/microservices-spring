create table IF NOT EXISTS students.student(
	id 		int 		PRIMARY KEY AUTO_INCREMENT,
	username 		varchar(255) 	NOT NULL,
	doc_number	varchar(255) 	NOT NULL UNIQUE,
	address         varchar(255) 	NOT NULL
);


create index idx_student_name on students.student(name);

insert into students.student(id, username, doc_number, address) values (1, 'Arthur', '123456', 'Predio 32');
insert into students.student(id, username, doc_number, address) values (2, 'Arthur Hakuna', '123456', 'Predio 50');
insert into students.student(id, username, doc_number, address) values (3, 'Dani', '7891011', 'Predio 15');
insert into students.student(id, username, doc_number, address) values (4, 'Manu', '121314', 'Predio 26');

select * from students.student;


create database subjects;

create table IF NOT EXISTS subjects.subject(
	id 			int 	PRIMARY KEY AUTO_INCREMENT,
	codigo  	varchar(6)	NOT NULL,
	name 		varchar(255) 	NOT NULL,
	class_time varchar(2) NOT NULL,
	turma   	int(5)
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

create database registrations;

create table IF NOT EXISTS registrations.registration(
	id 				int 		PRIMARY KEY AUTO_INCREMENT,
	id_aluno			int			NOT NULL,
	id_disciplina	int			NOT NULL
);

insert into registrations.registration(id, id_aluno, id_disciplina) values (1, 1, 1);
insert into registrations.registration(id, id_aluno, id_disciplina) values (2, 1, 2);
insert into registrations.registration(id, id_aluno, id_disciplina) values (3, 1, 3);
insert into registrations.registration(id, id_aluno, id_disciplina) values (4, 1, 4);
insert into registrations.registration(id, id_aluno, id_disciplina) values (5, 2, 1);
insert into registrations.registration(id, id_aluno, id_disciplina) values (6, 2, 2);
insert into registrations.registration(id, id_aluno, id_disciplina) values (7, 3, 1);
insert into registrations.registration(id, id_aluno, id_disciplina) values (8, 3, 2);
insert into registrations.registration(id, id_aluno, id_disciplina) values (9, 4, 1);
insert into registrations.registration(id, id_aluno, id_disciplina) values (10, 4, 2);

select * from registrations.registration;

alter table registrations.registration rename column idDisciplina to id_disciplina;
