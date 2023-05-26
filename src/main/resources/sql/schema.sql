 DROP DATABASE IF EXISTS favorSwapp;
 create database favorSwapp;

 use favorSwapp;

 CREATE TABLE provincias (
	id     VARCHAR(2)  NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL /*Usaremos 00 para indicar nombre = '' */
) ENGINE=INNODB;


 
 create table usuarios (
    id INT (4) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido1 VARCHAR(25) NOT NULL,
    apellido2 VARCHAR(25),
    edad INT(2),
    id_provincia VARCHAR (2),
    -- Este campo id_provincias hace referencia a la id de provincias
    FOREIGN KEY (id_provincia) REFERENCES provincias (id)
    ) ENGINE = InnoDB;


create table direcciones (
    id INT (4) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    direccion VARCHAR(50) NOT NULL,
    id_usuario INT (4),
    id_provincia VARCHAR (2),
    -- Este campo id_provincia hace referencia a la id de provincias
    FOREIGN KEY (id_provincia) REFERENCES provincias (id),
    -- Este campo id_usuario hace referencia a la id de usuario
    FOREIGN KEY (id_usuario) REFERENCES usuarios (id)
    ) ENGINE = InnoDB;
    
