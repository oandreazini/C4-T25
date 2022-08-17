DROP TABLE IF EXISTS employees;
DROP table IF EXISTS departments;


CREATE TABLE departments (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  budget int(10) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE employees (
  id int(10) NOT NULL AUTO_INCREMENT,
  DNI varchar(8) NOT NULL,
  name varchar(100) DEFAULT NULL,
  surname varchar(255) DEFAULT NULL,
  departments_id int(10) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT `employees_fk` FOREIGN KEY (departments_id ) REFERENCES departments (id)
);


insert into departments (name, budget) values('Marketing', 500);
insert into departments (name, budget) values('Financial', 800);
insert into departments (name, budget) values('Human Resources', 400);

insert into employees (DNI,name, surname, departments_id) values ('1234567W', 'Laura', 'Val', 1);
insert into employees (DNI, name, surname, departments_id) values ('7418529H', 'Pau', 'Ramirez', 1);
insert into employees (DNI, name, surname, departments_id) values ('7894561T', 'Pepe', 'Perez' , 2);
insert into employees (DNI, name, surname, departments_id) values ('8529874Y', 'Lucas', 'Ramos' ,3);