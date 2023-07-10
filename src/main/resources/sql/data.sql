/*Contenido para la tabla de Provincias de España*/
INSERT INTO provincias (id, nombre)
VALUES ('00', ''), /*Como es obligatorio algún valor, por si no sabe la provincia */
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
VALUES ('Calle Málaga', '29'),
       ('Calle Cordoba', '29'),
       ('Calle Marques de Larios', '29');

/* Contenido de la tabla usuarios */
INSERT INTO usuarios (nombre, apellido1, apellido2, telefono, fecha_nacimiento, id_direccion, email, clave)
VALUES ('Pepe','Lopez','Lopez','656111111','2000-10-10',1,'pepe@hotmail.com','123456'),
       ('Juan','Martín','Garcia','656222222','1990-05-12',2,'juan@hotmail.com','654321'),
       ('Antonio','Perez','Perez','656333333','1999-01-20',3,'antonio@hotmail.com','112233');

INSERT INTO favores (foto, descripcion, direccion, id_usuario, fumar, internet, mascota, climatizacion, adaptado_movilidad_reducida)
VALUES ('https://img.freepik.com/psd-gratis/vista-frontal-habitacion-cama-moderna-maqueta-mesas-noche-madera_176382-1962.jpg?w=740&t=st=1688553891~exp=1688554491~hmac=18de766296199b91a3f1682f85f965a56d15270390ddc954b12f1a629c9e058c'
        ,'Piso de una cama ---'
        ,'Calle Málaga'
        ,1,true,false,false,false,false),
        ('https://img.freepik.com/vector-gratis/plantilla-fondo-interior-dormitorio-dibujos-animados-acogedora-habitacion-moderna-luz-manana_33099-171.jpg?w=740&t=st=1688639593~exp=1688640193~hmac=cee8e03eb23fcb1aeac823f67822f8fbadc1ff59b5f8f8facd696f70d3ce10da'
        ,'Piso de dos camas --'
        ,'Calle Córdoba'
        ,1,false,false,false,false,false),
        ('https://img.freepik.com/vector-premium/interior-dormitorio-accesorios-muebles-objetos-cotidianos_200075-1638.jpg?w=740'
        ,'Piso de tres cama --'
        ,'Calle Sevilla'
        ,1,true,true,false,false,false),
        ('https://img.freepik.com/vector-premium/interior-dormitorio-estilo-isometrico_171867-143.jpg'
        ,'Piso de una cama ---'
        ,'Calle Granada'
        ,1,false,false,true,false,false),
        ('https://as2.ftcdn.net/v2/jpg/06/04/78/57/1000_F_604785708_kqaYnWtWljIwwGIpCDH0KZ2j2x2vIyW0.jpg'
        ,'Piso de una cama ---'
        ,'Calle Jaen'
        ,1,false,false,false,true,false),
        ('https://as1.ftcdn.net/v2/jpg/06/13/87/90/1000_F_613879084_2Jw0QmdGM7NNZILC8xS5Y048D42ybHar.jpg'
        ,'Piso de una cama ---'
        ,'Calle Almeria'
        ,1,false,false,false,false,true);