--liquibase formatted sql

--changeset erubinic:1

CREATE TABLE results.ItdSecondSeminarData (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int FOREIGN KEY REFERENCES student.StudentData(Id),
    PresDesign int,
    PresContent int,
    PresLive int,
    Quality int,
    NegativePoints int
)

CREATE TABLE results.ItdFirstSeminarData (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int FOREIGN KEY REFERENCES student.StudentData(Id),
    PresDesign int,
    PresContent int,
    PresLive int,
    Size int,
    Formatting int,
    Quality int
)

create table results.ItdActivityData (
    Id int IDENTITY(1,1) PRIMARY KEY,
    StudentId int FOREIGN KEY REFERENCES student.StudentData(Id),
    Activity int
);

