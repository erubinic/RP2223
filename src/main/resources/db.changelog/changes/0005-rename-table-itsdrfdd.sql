--liquibase formatted sql

--changeset erubinic:1


EXEC sp_rename 'results.first.StudentId', 'studentid', 'COLUMN'
