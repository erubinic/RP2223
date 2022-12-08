--liquibase formatted sql

--changeset erubinic:1

SET IDENTITY_INSERT student.Student ON;

INSERT INTO student.Student (Id, Jmbag, Name, Surname) VALUES
(999, '123456', 'Pero', 'Boyd');

SET IDENTITY_INSERT student.Student OFF;


