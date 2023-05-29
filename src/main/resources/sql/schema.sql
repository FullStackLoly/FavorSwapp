 DROP DATABASE IF EXISTS favorSwapp;
 create database favorSwapp;

 use favorSwapp;

-- Tabla provincias
 CREATE TABLE provincias (
	id     VARCHAR(2)  NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL /*Usaremos 00 para indicar nombre = '' */
) ENGINE=INNODB;

-- Tabla direcciones
create table direcciones (
    id INT (4) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    direccion VARCHAR(200) NOT NULL,
    id_provincia VARCHAR (2),
    -- Este campo id_provincia hace referencia a la id de provincias
    FOREIGN KEY (id_provincia) REFERENCES provincias (id)
    ) ENGINE = InnoDB;

-- Tabla usuarios
 create table usuarios (
    id INT (4) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido1 VARCHAR(25) NOT NULL,
    apellido2 VARCHAR(25),
    fecha_nacimiento DATETIME,
    id_direccion INT (4),
    is_Admin BOOLEAN DEFAULT 0,
    email VARCHAR(50) NOT NULL UNIQUE,
    clave VARCHAR(50) NOT NULL,
    -- Este campo id_provincias hace referencia a la id de provincias
    FOREIGN KEY (id_direccion) REFERENCES direcciones (id)
    ) ENGINE = InnoDB;



