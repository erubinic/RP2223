--liquibase formatted sql

--changeset erubinic:1

INSERT INTO results.ItdActivity (StudentId, Activity) VALUES
(1, 7),
(2, 3),
(3, 1),
(4, 8),
(5, 6),
(6, 9),
(7, 7),
(8, 0),
(9, 6),
(10, 0),
(11, 10),
(12, 3),
(13, 7),
(14, 7),
(15, 8),
(16, 0),
(17, 2),
(18, 0),
(19, 2),
(20, 8),
(21, 3),
(22, 2),
(23, 8),
(24, 10),
(25, 2),
(26, 5),
(27, 8);

INSERT INTO results.ItdFirstSeminar (StudentId, PresDesign, PresContent, PresLive, Size, Formatting, Quality) VALUES
(1, 6, 2, 9, 10, 8, 7),
(2, 0, 1, 2, 2, 3, 10),
(3, null, null, null, 9, 2, 10),
(4, 3, 7, 9, 6, 8, 0),
(5, 1, 4, 3, 6, 2, 7),
(6, 4, 2, 10, 7, 5, 8),
(7, 7, 10, 1, 6, 0, 0),
(8, 5, 9, 4, 6, 8, 0),
(9, 5, 6, 6, 0, 2, 1),
(10, 4, 2, 4, 6, 5, 7),
(11, 2, 4, 8, 3, 9, 4),
(12, 7, 0, 9, 2, 8, 8),
(13, 6, 5, 2, 5, 2, 5),
(14, 0, 9, 5, 7, 4, 6),
(15, 7, 1, 10, 7, 4, 4),
(16, 7, 4, 8, 8, 6, 0),
(17, 7, 2, 10, 3, 3, 3),
(18, 8, 6, 5, 4, 3, 3),
(19, 7, 7, 2, 8, 5, 0),
(20, 6, 3, 5, 8, 0, 6),
(21, 10, 7, 8, 1, 0, 5),
(22, 1, 4, 1, 4, 6, 2),
(23, 6, 1, 6, 4, 1, 4),
(24, 8, 10, 8, 4, 6, 1),
(25, 7, 2, 5, 1, 10, 10),
(26, 7, 2, 1, 9, 9, 4),
(27, 0, 0, 10, 10, 8, 5);

INSERT INTO results.ItdSecondSeminar (StudentId, PresDesign, PresContent, PresLive, Quality, NegativePoints) VALUES
(1, 2, 7, 6, 9, 5),
(2, 3, 0, 2, 5, 6),
(3, 2, 7, 1, 3, 7),
(4, 7, 4, 1, 6, 6),
(5, 3, 3, 0, 7, 2),
(6, 8, 3, 8, 8, 0),
(7, 9, 3, 5, 1, 3),
(8, 5, 7, 6, 0, 9),
(9, 8, 4, 1, 7, 4),
(10, 8, 8, 1, 9, 9),
(11, 1, 4, 9, 4, 4),
(12, 8, 10, 4, 5, 8),
(13, 3, 8, 5, 2, 8),
(14, 5, 8, 2, 10, 6),
(15, 4, 8, 8, 7, 8),
(16, 3, 8, 9, 5, 5),
(17, 2, 8, 5, 1, 0),
(18, 1, 7, 9, 10, 4),
(19, 9, 9, 8, 8, 10),
(20, 5, 9, 3, 0, 5),
(21, 9, 8, 4, 3, 3),
(22, 9, 8, 2, 2, 10),
(23, 8, 1, 10, 4, 0),
(24, 9, 0, 6, 2, 1),
(25, 5, 7, 4, 8, 3),
(26, 10, 1, 7, 3, 9),
(27, 0, 0, 0, 2, 5);





