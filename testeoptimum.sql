create database testeoptimum;
create table pessoa (
	id bigint not null auto_increment,
	cep varchar(255),
	cidade varchar(255),
	cpf varchar(255),
	data_nascimento date,
	email varchar(255),
	estado varchar(255),
	nome varchar(255),
	skype varchar(255),
	telefone varchar(255),
	primary key (id)
)

insert into pessoa (cep, cidade, cpf, data_nascimento, email, estado, nome, skype, telefone) values ("00000-000", "Brasília", "000.000.000-00", "2000-12-12", "email@email.com", "DF", "Nome", "(00) 00000-0000", "(00) 00000-0000")