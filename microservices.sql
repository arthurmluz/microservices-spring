create table students.student(
	id 				int 			PRIMARY KEY AUTO_INCREMENT,
	name 			varchar(255) 	NOT NULL,
	docNumber 		varchar(255) 	NOT NULL,
	address         varchar(255) 	NOT NULL
);

create index idx_student_name on students.student(name);

insert into students.student(name, docNumber, address) values ('Arthur', '123456', 'Predio 32');
insert into students.student(name, docNumber, address) values ('Arthur Hakuna', '123456', 'Predio 50');
insert into students.student(name, docNumber, address) values ('Dani', '7891011', 'Predio 15');
insert into students.student(name, docNumber, address) values ('Manu', '121314', 'Predio 26');

select * from students.student;

-- 

create table subjects.subject(
	id 			int 		 	PRIMARY KEY AUTO_INCREMENT,
	codigo  	varchar(6)		NOT NULL,
	name 		varchar(255) 	NOT NULL,
	class_time	varchar(2)		NOT NULL,
	turma   	int				NOT NULL
);

create index idx_subject_codigo on subjects.subject(codigo);
create index idx_subject_name on subjects.subject(name);

insert into subjects.subject(codigo, name, class_time, turma) values ('98802', 'Engenharia de Software 2', 'M', 30);
insert into subjects.subject(codigo, name, class_time, turma) values ('98802', 'Engenharia de Software 2', 'M', 31);
insert into subjects.subject(codigo, name, class_time, turma) values ('46110', 'M�todos Anal�ticos', 'A', 30);
insert into subjects.subject(codigo, name, class_time, turma) values ('33333', 'Inteligencia Artificial', 'J', 10);

select * from subjects.subject;

-- 

create table users.user(
	id 			int 		 	PRIMARY KEY AUTO_INCREMENT,
	name 		varchar(255) 	NOT NULL,
	senha 		varchar(255) 	NOT NULL
);

create index idx_user_name on users.user(name);

insert into users.user(name, senha) values ('Dani', '123123');
insert into users.user(name, senha) values ('Arthur', '123');
insert into users.user(name, senha) values ('Manu', '123123');
insert into users.user(name, senha) values ('Michael', 'pass');

select * from users.user;