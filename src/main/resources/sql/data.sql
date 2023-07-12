/*Contenido para la tabla de Provincias de España*/
INSERT INTO provincias (id, nombre)
VALUES ('00', '--Todas--'),
       ('01', 'Álava'),
       ('02', 'Albacete'),
       ('03', 'Alicante'),
       ('04', 'Almería'),
       ('05', 'Ávila'),
       ('06', 'Badajoz'),
       ('07', 'Baleares (Illes)'),
       ('08', 'Barcelona'),
       ('09', 'Burgos'),
       ('10', 'Cáceres'),
       ('11', 'Cádiz'),
       ('12', 'Castellón'),
       ('13', 'Ciudad Real'),
       ('14', 'Córdoba'),
       ('15', 'A Coruña'),
       ('16', 'Cuenca'),
       ('17', 'Girona'),
       ('18', 'Granada'),
       ('19', 'Guadalajara'),
       ('20', 'Guipúzcoa'),
       ('21', 'Huelva'),
       ('22', 'Huesca'),
       ('23', 'Jaén'),
       ('24', 'León'),
       ('25', 'Lleida'),
       ('26', 'La Rioja'),
       ('27', 'Lugo'),
       ('28', 'Madrid'),
       ('29', 'Málaga'),
       ('30', 'Murcia'),
       ('31', 'Navarra'),
       ('32', 'Ourense'),
       ('33', 'Asturias'),
       ('34', 'Palencia'),
       ('35', 'Las Palmas'),
       ('36', 'Pontevedra'),
       ('37', 'Salamanca'),
       ('38', 'Santa Cruz de Tenerife'),
       ('39', 'Cantabria'),
       ('40', 'Segovia'),
       ('41', 'Sevilla'),
       ('42', 'Soria'),
       ('43', 'Tarragona'),
       ('44', 'Teruel'),
       ('45', 'Toledo'),
       ('46', 'Valencia'),
       ('47', 'Valladolid'),
       ('48', 'Vizcaya'),
       ('49', 'Zamora'),
       ('50', 'Zaragoza'),
       ('51', 'Ceuta'),
       ('52', 'Melilla'),
       ('99', 'Internacional');

/* Contenido de la tabla direcciones */
INSERT INTO direcciones (direccion, id_provincia)
VALUES ('Calle Málaga 14', '29'),
       ('Calle Cordoba 18', '29'),
       ('Calle Marques de Larios 3', '29'),
       ('Calle Jubrique 5', '29'),
       ('Calle Competa 34', '29'),
       ('Calle Jaén 10', '29'),
       ('Avda Andalucia 146', '29'),
       ('Calle Betis 1', '41'),
       ('Calle Feria 12', '41'),
       ('Calle Sierpes 24', '41'),
       ('Calle Abeja 5', '18'),
       ('Paseo de las Acacias 2', '18'),
       ('Calle Adelfa 25', '18'),
       ('Calle Gradas 5', '23'),
       ('Calle Real 10', '23'),
       ('Calle Llana 4', '23')
       ;

/* Contenido de la tabla usuarios */
INSERT INTO usuarios (nombre, apellido1, apellido2, telefono, fecha_nacimiento, id_direccion, email, clave)
VALUES ('Pepe','Lopez','Garcia','656123456','2000-10-10',1,'pepe@hotmail.com','123456'),
       ('Juan','Martín','Lopez','656654321','1990-05-12',2,'juan@hotmail.com','654321'),
       ('Antonio','Perez','Perez','656112233','1999-01-20',3,'antonio@hotmail.com','112233'),
       ('Esperanza','Villalobos','Nunez','656443322','1990-05-12',4,'esperanza@hotmail.com','112244'),
       ('Juanito','Candella','Guadarrama','655432101','1990-05-12',5,'juanito@hotmail.com','112244'),
       ('Tulio','Rosario','Iglesias','665432104','1990-05-12',6,'tulio@hotmail.com','112244'),
       ('Lorenzo','Estrada','Gutiérrez','653210987','1990-05-12',7,'lorenzo@hotmail.com','112244'),
       ('Juan Carlos','Martín','Perez','653456543','1990-05-12',8,'juancarlosse@gmail.com','112244'),
       ('Afonso','Cortez','Ruiz','654123432','1990-05-12',9,'afonso@gmail.com','112244'),
       ('Margarita','Garza','Peña','655357986','1990-05-12',10,'margarita@gmail.com','112244'),
       ('Brigida','Ignacio','Domínguez','653135764','1990-05-12',11,'brigida@gmail.com','112244'),
       ('Paula','Escarra','Oleastro','652214365','1990-05-12',12,'paula@gmail.com','112244'),
       ('Valeria','López','Toledano','651213465','1990-05-12',13,'valeria@gmail.com','112244'),
       ('Constancia','Fernandez','Perez','659142637','1990-05-12',14,'constancia@gmail.com','112244'),
       ('Elsa','Martín','Peña','657594837','1990-05-12',15,'elsa@gmail.com','112244');


INSERT INTO favores (foto, descripcion, telefono, id_usuario, fumar, internet, mascota, climatizacion, adaptado_movilidad_reducida)
VALUES ('https://img.freepik.com/psd-gratis/vista-frontal-habitacion-cama-moderna-maqueta-mesas-noche-madera_176382-1962.jpg?w=740&t=st=1688553891~exp=1688554491~hmac=18de766296199b91a3f1682f85f965a56d15270390ddc954b12f1a629c9e058c'
        ,'Habitacion 1 cama'
        ,'656112233'
        ,1,true,false,false,false,false),
        ('https://img.freepik.com/vector-gratis/plantilla-fondo-interior-dormitorio-dibujos-animados-acogedora-habitacion-moderna-luz-manana_33099-171.jpg?w=740&t=st=1688639593~exp=1688640193~hmac=cee8e03eb23fcb1aeac823f67822f8fbadc1ff59b5f8f8facd696f70d3ce10da'
        ,'Habitacion 2 camas'
        ,'656223344'
        ,2,false,true,false,false,false),
        ('https://img.freepik.com/vector-premium/interior-dormitorio-accesorios-muebles-objetos-cotidianos_200075-1638.jpg?w=740'
        ,'Habitacion amplia'
        ,'656123456'
        ,3,false,false,true,false,false),
        ('https://img.freepik.com/vector-premium/interior-dormitorio-estilo-isometrico_171867-143.jpg'
        ,'Ventanas al exterior'
        ,'656654321'
        ,4,false,false,false,true,false),
        ('https://as2.ftcdn.net/v2/jpg/06/04/78/57/1000_F_604785708_kqaYnWtWljIwwGIpCDH0KZ2j2x2vIyW0.jpg'
        ,'Habitación doble'
        ,'656123212'
        ,5,false,false,false,false,true),
        ('https://as1.ftcdn.net/v2/jpg/06/13/87/90/1000_F_613879084_2Jw0QmdGM7NNZILC8xS5Y048D42ybHar.jpg'
        ,'habitación interior'
        ,'656445566'
        ,6,true,false,false,false,true),
        ('https://d2j6dbq0eux0bg.cloudfront.net/images/28115101/2965728341.jpg'
        ,'Habitación y salón'
        ,'656778899'
        ,7,false,false,true,false,true),
        ('https://mueblesmesquemobles.com/camas-dormitorios-matrimonio-eos/thrumb/EOS-10.jpg'
        ,'Cuarto extra'
        ,'656654321'
        ,8,true,false,true,false,true),
        ('https://www.baixmoduls.com/wp-content/uploads/2022/06/dormitorio-matrimonio-cabecero-tucson-esenzia-baixmoduls.jpg'
        ,'Buenas vistas'
        ,'656654321'
        ,9,true,false,true,false,false),
        ('https://www.garciasabate.com/wp-content/uploads/2014/07/POP1.jpg'
        ,'Zona tranquila'
        ,'656654321'
        ,10,false,false,false,true,true),
        ('https://www.elmueble.com/medio/2023/05/18/dormitorio-de-matrimonio-moderno_4a89c34a_230518191212_2000x2735.jpg'
        ,'Habitación doble'
        ,'656654321'
        ,11,true,true,true,true,true),
        ('https://media.revistaad.es/photos/60c22179bf852c9cf59e48c7/master/w_1600%2Cc_limit/286864.jpg'
        ,'Cama extra'
        ,'656654321'
        ,12,false,true,true,true,false),
        ('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc4ApSALkok98NNJXxKZu7lHRtk71OJJ0EIIiUoCzmqXlpfrSin--A_9faKVIaSrKz7Wc&usqp=CAU'
        ,'Apartamento duplex'
        ,'656654321'
        ,13,false,true,false,true,false),
        ('https://mueblesmesquemobles.com/camas-dormitorios-matrimonio-eos/thrumb/EOS-10.jpg'
        ,'Exterior con piscina'
        ,'656654321'
        ,14,true,false,true,false,true),
        ('https://www.decorarhogar.es/wp-content/uploads/2014/01/decorar-habitaciones-pequenas-estilo.jpg'
        ,'Terraza incluida'
        ,'656654321'
        ,15,false,false,false,false,false);