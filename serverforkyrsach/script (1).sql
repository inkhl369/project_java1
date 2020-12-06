CREATE DATABASE `kyrsach` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE users
(
    KodUsers int NOT NULL AUTO_INCREMENT,
    Login VARCHAR(40)NOT NULL,
    Password VARCHAR(40)NOT NULL,
    roles VARCHAR(40) NOT NULL,
    lastname VARCHAR(40),
    firstname VARCHAR(40),
    middlename VARCHAR(40),
    adds VARCHAR(60),
    Primary key (KodUsers)
);

INSERT INTO users (Login,Password,roles,lastname,firstname,middlename,adds)
VALUES ('1234567890', '1234567890','клиент','Вяль','Дарья','Юрьевна','Минск'),
       ('shevarov','shevarov','клиент','Ражкова','Елизавета','Юрьевна','Фаниполь'),
       ('12345', '12345','клиент','Соколов','Артём','Андреевич','Брест'),
       ('admin1','admin1','админ','Миронова','Мария','','');
create table dataCard
(
    KodCard int primary key AUTO_INCREMENT,
    KodUsers int ,
    numberCard VARCHAR(40),
    validity11 int,
    validity12 int,
    cvv2 int,
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade
);
insert into dataCard(KodUsers,numberCard,validity11,validity12,cvv2) values
(1,'1234567890',2,2020,123),
(2,'1234567890',3,2021,234),
(3,'1234567890',4,2022,345),
(4,'1234567890',5,2023,456);

create table list
(
    KodSpisok int primary key AUTO_INCREMENT,
    Name1 VARCHAR(40) NOT NULL,
    Model VARCHAR(40),
    Price double NOT NULL,
    Description VARCHAR(120)

);

insert into list(Name1,Model,Price,Description) values
('кроссовер','Lexus NX 300 AWD Progressive',30000,'1998, 200, Светло-серый металлик '),
('кроссовер','Kia Sportage Premium',1200,'1999, 200, Светло-серый металлик'),
('кроссовер','Mazda CX-5 Supreme',1540,'1999, 200, Светло-серый металлик'),
('кроссовер','Geely Coolray Flagshipd',3170,'1999, 200, Светло-серый металлик'),
('кроссовер','Lexus RX 300 AWD F SPORT',3240,'1999, 200, Светло-серый металлик'),
('кроссовер','Jaguar E-pace S',1440,'1999, 200, Светло-серый металлик'),
('кроссовер','Nissan Qashqai',1340,'1999, 200, Светло-серый металлик'),
('кроссовер','Opel Mokka ',1240,'1999, 200, Светло-серый металлик'),
('внедорожник','Toyota RAV4',620.6,'1999, 200, Светло-серый металлик'),
('внедорожник','Mitsubishi Pajero',3000.6,'1999, 200, Светло-серый металлик'),
('внедорожник','Lexus LX',1020.2,'1999, 200, Светло-серый металлик'),
('внедорожник','Honda HR-V',1820.6,'1999, 200, Светло-серый металлик'),
('внедорожник','Nissan Murano',2660,'1999, 200, Светло-серый металлик'),
('внедорожник','BMW X5',1520.2,'1999, 200, Светло-серый металлик'),
('седан','Volvo S90',1000,'1999, 200, Светло-серый металлик'),
('седан','Mercedes-Benz E-класс',1200,'1999, 200, Светло-серый металлик'),
('седан','Audi A4',1600,'1999, 200, Светло-серый металлик'),
('хетчбэк','Opel Signum',199.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Smart Fortwo',139.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Opel Corsa',49.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Citroen C-ZERO',199.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Audi A3',99.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Honda Insight',29.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Toyota RAV4',199.99,'1999, 200, Светло-серый металлик'),
('хетчбэк','Ford Focus',149.99,'1999, 200, Светло-серый металлик');

create table listhatchback
(
    KodPer int primary key AUTO_INCREMENT,
    KodSpisok int ,
    presenceFifthDoor VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);


create table listcrossover
(
    KodPK int primary key AUTO_INCREMENT,
    KodSpisok int,
    volumeTrunk double,
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);
create table listsedan
(
    KodLaptod int primary key AUTO_INCREMENT,
    KodSpisok int ,
    TypeOfDrive VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);
create table listsuv
(
    KodPhone int primary key AUTO_INCREMENT,
    KodSpisok int ,
    TypeSuspension VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);

insert into listhatchback(KodSpisok,presenceFifthDoor) values
(18,'Есть'),
(19,'Нет'),
(20,'Есть'),
(21,'Нет'),
(22,'Есть'),
(23,'Есть'),
(24,'Нет'),
(25,'Нет');

insert into listcrossover(KodSpisok,volumeTrunk) values
(1,350),
(2,370),
(3,400),
(4,360),
(5,340),
(6,320),
(7,370),
(8,350);

insert into listsuv(KodSpisok,TypeSuspension) values
(9,'Зависимая'),
(10,'Независимая'),
(11,'Независимая'),
(12,'Зависимая'),
(13,'Независимая'),
(14,'Зависимая');

insert into listsedan(KodSpisok,TypeOfDrive) values
(15,'Полноприводный'),
(16,'Полноприводный'),
(17,'Переднеприводный');

create table pannier
(
    KodPannier int primary key AUTO_INCREMENT,
    KodUsers int NOT NULL,
    KodSpisok int NOT NULL,
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade,
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);

create table orders
(
    KodOrders int primary key AUTO_INCREMENT,
    KodUsers int NOT NULL,
    KodSpisok int NOT NULL,
    Data1 date,
    Descriptionoforder VARCHAR(60),
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade,
    FOREIGN KEY (KodSpisok) REFERENCES list(KodSpisok) on update cascade on delete cascade
);




