DROP TABLE IF EXISTS `boxes`;
DROP table IF EXISTS `warehouses`;


CREATE TABLE `warehouses` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `place` varchar(100) NOT NULL,
  `capacity` int  NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `boxes` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `numreference` char(5) NOT NULL,
  `contents` varchar(100) DEFAULT NULL,
  `value` int(10) DEFAULT NULL,
  `warehouses_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `boxes_fk` FOREIGN KEY (`warehouses_id`) REFERENCES `warehouses` (`id`)
);

insert into warehouses (`place`, `capacity`) values('Londres', 10000);
insert into warehouses (`place`, `capacity`) values('Barcelona', 5000);
insert into warehouses (`place`, `capacity`) values('Madrid', 4000);


insert into boxes (`numReference`, `contents`, `value`, `warehouses_id`) values ('85QB', 'COCACOLA', 1000, 1);
insert into boxes (`numReference`, `contents`, `value`, `warehouses_id`) values ('60AB', 'ESTRELLA DAMM', 200, 1);
insert into boxes (`numReference`, `contents`, `value`, `warehouses_id`) values ('42T8', 'SAMSUNG', 5000, 2);
insert into boxes (`numReference`, `contents`, `value`, `warehouses_id`) values ('AG85', 'IPHONE', 8000, 1);