DROP TABLE IF EXISTS articles;
DROP table IF EXISTS manufacturer;


CREATE TABLE `manufacturer` (
  id int(8) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

CREATE TABLE articles (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  price int(10) DEFAULT NULL,
  manufacturer_id int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `articles_fk` FOREIGN KEY (`manufacturer_id`) REFERENCES `manufacturer` (`id`)
);


insert into manufacturer (name) values('Laura');
insert into manufacturer (name) values('Pau');
insert into manufacturer (name) values('Harry');
insert into manufacturer (name) values('Lucas');
insert into manufacturer (name) values('Edu');

insert into articles (name, price,manufacturer_id) values ('Teclado', 10 , 1);
insert into articles (name, price,manufacturer_id) values ('Raton', 15 , 1);
insert into articles (name, price,manufacturer_id) values ('PC', 20 , 2);
insert into articles (name, price,manufacturer_id) values ('Pantalla', 10 ,3);