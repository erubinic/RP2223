--liquibase formatted sql

--changeset erubinic:1

INSERT INTO student.StudentData
(Jmbag, Name, Surname)
VALUES
('111111', 'Pero', 'Peric'),
('111111', 'Dara', 'Daric');


INSERT INTO results.ItdActivityData
(StudentId, Activity)
VALUES(1, 5);

INSERT INTO results.ItdActivityData
(StudentId, Activity)
VALUES(2, 10);

INSERT INTO results.ItdFirstSeminarData
(StudentId, PresDesign, PresContent, PresLive, [Size], Formatting, Quality)
VALUES(1, 0, 0, 0, 0, 0, 0);

INSERT INTO results.ItdFirstSeminarData
(StudentId, PresDesign, PresContent, PresLive, [Size], Formatting, Quality)
VALUES(2, 5, 10, 7, 0, 10, 5);

INSERT INTO results.ItdSecondSeminarData (StudentId, PresDesign, PresContent, PresLive, Quality, NegativePoints) VALUES
(1, 0, 0, 0, 0, 0),
(1, 10, 10, 10, 5, 5);


