CREATE DATABASE `kyrsach` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE users
(
    KodUsers int NOT NULL AUTO_INCREMENT,
    Login VARCHAR(40)NOT NULL,
    Password VARCHAR(40)NOT NULL,
    roles VARCHAR(40) NOT NULL,
    lastname VARCHAR(40),
    firstname VARCHAR(40),
    otchestvo VARCHAR(40),
    adres VARCHAR(60),
    Primary key (KodUsers)
);

INSERT INTO users (Login,Password,roles,lastname,firstname,otchestvo,adres)
VALUES ('1234567890', '1234567890','клиент','Вяль','Дарья','Юрьевна','Минск'),
       ('shevarov','shevarov','клиент','Ражкова','Елизавета','Юрьевна','Фаниполь'),
       ('12345', '12345','клиент','Соколов','Артём','Андреевич','Брест'),
       ('admin1','admin1','админ','Миронова','Мария','','');
create table acarddata
(
    KodCard int primary key AUTO_INCREMENT,
    KodUsers int ,
    nomerkard VARCHAR(40),
    srok1 int,
    srok2 int,
    cvv2 int,
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade
);
insert into acarddata(KodUsers,nomerkard,srok1,srok2,cvv2) values
(1,'1234567890',2,2020,123),
(2,'1234567890',3,2021,234),
(3,'1234567890',4,2022,345),
(4,'1234567890',5,2023,456);

create table spisok
(
    KodSpisok int primary key AUTO_INCREMENT,
    Name1 VARCHAR(40) NOT NULL,
    Model VARCHAR(40),
    Price double NOT NULL,
    Description VARCHAR(120)

);

insert into spisok(Name1,Model,Price,Description) values
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

create table spisokperipherii
(
    KodPer int primary key AUTO_INCREMENT,
    KodSpisok int ,
    Types VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);


create table spisokpk
(
    KodPK int primary key AUTO_INCREMENT,
    KodSpisok int,
    Computpower double,
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);
create table spisoklaptod
(
    KodLaptod int primary key AUTO_INCREMENT,
    KodSpisok int ,
    TachPad VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);
create table spisokmobilephone
(
    KodPhone int primary key AUTO_INCREMENT,
    KodSpisok int ,
    Typecommunicate VARCHAR(40),
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);

insert into spisokperipherii(KodSpisok,Types) values
(18,'МКПП'),
(19,'АКПП'),
(20,'АКПП'),
(21,'МКПП'),
(22,'АКПП'),
(23,'МКПП'),
(24,'АКПП'),
(25,'МКПП');

insert into spisokpk(KodSpisok,Computpower) values
(1,0.8),
(2,0.3),
(3,0.4),
(4,0.9),
(5,1),
(6,0.3),
(7,0.2),
(8,0.1);

insert into spisokmobilephone(KodSpisok,Typecommunicate) values
(9,'3g'),
(10,'4g'),
(11,'4g'),
(12,'4g'),
(13,'4g'),
(14,'5g');

insert into spisoklaptod(KodSpisok,TachPad) values
(15,'Есть'),
(16,'Есть'),
(17,'Есть');

create table apannier
(
    KodPannier int primary key AUTO_INCREMENT,
    KodUsers int NOT NULL,
    KodSpisok int NOT NULL,
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade,
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);

create table orders
(
    KodOrders int primary key AUTO_INCREMENT,
    KodUsers int NOT NULL,
    KodSpisok int NOT NULL,
    Data1 date,
    Descriptionoforder VARCHAR(60),
    FOREIGN KEY (KodUsers) REFERENCES users(KodUsers) on update cascade on delete cascade,
    FOREIGN KEY (KodSpisok) REFERENCES spisok(KodSpisok) on update cascade on delete cascade
);

rename table spisokpk to listcrossover;
rename table spisokperipherii to listhatchback;
rename table spisoklaptod to listsedan;
rename table spisokmobilephone to listsuv;



