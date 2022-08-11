DROP TABLE IF EXISTS `cinemas`;
DROP table IF EXISTS `films`;


CREATE TABLE `films` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `califiedad` int  DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `cinemas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `films_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `cinemas_fk` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`)
);

insert into films (`name`, `califiedad`) values('Hobbit', 16);
insert into films (`name`, `califiedad`) values('Thor', 12);
insert into films (`name`, `califiedad`) values('Black Phone', 18);


insert into cinemas (`name`, `films_id`) values ('Lauren', 1);
insert into cinemas (`name`, `films_id`) values ('Oscar', 2);
insert into cinemas (`name`, `films_id`) values ('Cine', 2);
