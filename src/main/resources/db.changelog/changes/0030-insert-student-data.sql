--liquibase formatted sql

--changeset erubinic:1

SET IDENTITY_INSERT student.Student ON;

INSERT INTO student.Student
(Id, Jmbag, Name, Surname)
VALUES
(1, '1111111', 'Dylan', 'Byrd'),
(2, '2222222', 'Jade', 'Boyd'),
(3, '3333333', 'Paulo', 'Blanchard'),
(4, '4444444', 'Lennon', 'Coleman'),
(5, '5555555', 'Robin', 'Day'),
(6, '6666666', 'Darcey', 'Delgado'),
(7, '7777777', 'Mina', 'Keith'),
(8, '8888888', 'Rory', 'Kyrin'),
(9, '9999999', 'Drew', 'Cox'),
(10, '1111110', 'Ashleigh', 'Long'),
(11, '2222221', 'Dillon', 'Mathis'),
(12, '3333332', 'Anika', 'Matthams'),
(13, '4444443', 'Darcey', 'Marsh'),
(14, '5555554', 'Daro', 'Meza'),
(15, '6666665', 'Gabriel', 'Meyer'),
(16, '7777776', 'Kyan', 'Mckenzie'),
(17, '8888887', 'Nicola', 'Norman'),
(18, '9999998', 'Elijah', 'Odom'),
(19, '1111109', 'Mae', 'Potts'),
(20, '2222220', 'Ellis', 'Pineda'),
(21, '3333331', 'Jayden', 'Suarez'),
(22, '4444442', 'Tatiana', 'Swanson'),
(23, '5555553', 'Levi', 'Shannon'),
(24, '6666664', 'Ellis', 'Sutton'),
(25, '7777775', 'Dante', 'Vega'),
(26, '8888886', 'Pal', 'Shepherd'),
(27, '9999997', 'Peter', 'Villy');

SET IDENTITY_INSERT student.Student OFF;


