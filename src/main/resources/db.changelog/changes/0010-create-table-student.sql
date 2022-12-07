--liquibase formatted sql

--changeset erubinic:1

create table student.Student(
	Id int IDENTITY(1,1) PRIMARY KEY,
	Jmbag varchar(15) not null,
	Name varchar(30) not null,
	Surname varchar(100) not null
)