--liquibase formatted sql

--changeset erubinic:1

EXEC sp_rename 'student.StudentData ', 'Student';
