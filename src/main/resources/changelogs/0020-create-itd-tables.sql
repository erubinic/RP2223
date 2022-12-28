--liquibase formatted sql

--changeset erubinic:1

CREATE TABLE results.ItdFirstSeminar (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int not null,
    PresDesign int,
    PresContent int,
    PresLive int,
    Size int,
    Formatting int,
    Quality int
);

CREATE TABLE results.ItdSecondSeminar (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int not null,
    PresDesign int,
    PresContent int,
    PresLive int,
    Quality int,
    NegativePoints int
);

create table results.ItdActivity (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int not null,
    Activity int
);

ALTER TABLE results.ItdFirstSeminar
ADD FOREIGN KEY (StudentId)
REFERENCES student.Student(Id);

ALTER TABLE results.ItdSecondSeminar
ADD FOREIGN KEY (StudentId)
REFERENCES student.Student(Id);

ALTER TABLE results.ItdActivity
ADD FOREIGN KEY (StudentId)
REFERENCES student.Student(Id);

