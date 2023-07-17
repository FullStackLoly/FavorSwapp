-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2023 a las 00:15:41
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `favorswapp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direcciones`
--

-- crea la base de datos, la borra previamente si ya existia
DROP DATABASE IF EXISTS favorSwapp;
create database favorSwapp;

use favorSwapp;

CREATE TABLE `direcciones` (
  `id` int(4) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `id_provincia` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `direcciones`
--

INSERT INTO `direcciones` (`id`, `direccion`, `id_provincia`) VALUES
(1, 'Calle Málaga 14', '29'),
(2, 'Calle Cordoba 18', '29'),
(3, 'Calle Marques de Larios 3', '29'),
(4, 'Calle Jubrique 5', '29'),
(5, 'Calle Competa 34', '29'),
(6, 'Calle Jaén 10', '29'),
(7, 'Avda Andalucia 146', '29'),
(8, 'Calle Betis 1', '41'),
(9, 'Calle Feria 12', '41'),
(10, 'Calle Sierpes 24', '41'),
(11, 'Calle Abeja 5', '18'),
(12, 'Paseo de las Acacias 2', '18'),
(13, 'Calle Adelfa 25', '18'),
(14, 'Calle Gradas 5', '23'),
(15, 'Calle Real 10', '23'),
(16, 'Doctor Aráez Pacheco 22', '04'),
(17, 'Doctor Carracido 55', '04'),
(18, 'Doctor Giménez Canga 1', '04'),
(19, 'Doctor Gregorio Marañón 41', '04'),
(20, 'Martínez Oña 32', '04'),
(21, 'Elena Lázaro 65', '04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favores`
--

CREATE TABLE `favores` (
  `id` int(5) NOT NULL,
  `foto` varchar(200) DEFAULT NULL,
  `descripcion` varchar(20) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `id_usuario` int(4) DEFAULT NULL,
  `fumar` tinyint(1) DEFAULT NULL,
  `internet` tinyint(1) DEFAULT NULL,
  `mascota` tinyint(1) DEFAULT NULL,
  `climatizacion` tinyint(1) DEFAULT NULL,
  `adaptado_movilidad_reducida` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `favores`
--

INSERT INTO `favores` (`id`, `foto`, `descripcion`, `telefono`, `id_usuario`, `fumar`, `internet`, `mascota`, `climatizacion`, `adaptado_movilidad_reducida`) VALUES
(1, 'https://img.freepik.com/psd-gratis/vista-frontal-habitacion-cama-moderna-maqueta-mesas-noche-madera_176382-1962.jpg?w=740&t=st=1688553891~exp=1688554491~hmac=18de766296199b91a3f1682f85f965a56d15270390', 'Habitacion 1 cama', '656112233', 1, 1, 0, 0, 0, 0),
(2, 'https://img.freepik.com/vector-gratis/plantilla-fondo-interior-dormitorio-dibujos-animados-acogedora-habitacion-moderna-luz-manana_33099-171.jpg?w=740&t=st=1688639593~exp=1688640193~hmac=cee8e03eb23fc', 'Habitacion 2 camas', '656223344', 2, 0, 1, 0, 0, 0),
(3, 'https://img.freepik.com/vector-premium/interior-dormitorio-accesorios-muebles-objetos-cotidianos_200075-1638.jpg?w=740', 'Habitacion amplia', '656123456', 3, 0, 0, 1, 0, 0),
(4, 'https://img.freepik.com/vector-premium/interior-dormitorio-estilo-isometrico_171867-143.jpg', 'Ventanas al exterior', '656654321', 4, 0, 0, 0, 1, 0),
(5, 'https://as2.ftcdn.net/v2/jpg/06/04/78/57/1000_F_604785708_kqaYnWtWljIwwGIpCDH0KZ2j2x2vIyW0.jpg', 'Habitación doble', '656123212', 5, 0, 0, 0, 0, 1),
(6, 'https://as1.ftcdn.net/v2/jpg/06/13/87/90/1000_F_613879084_2Jw0QmdGM7NNZILC8xS5Y048D42ybHar.jpg', 'habitación interior', '656445566', 6, 1, 0, 0, 0, 1),
(7, 'https://d2j6dbq0eux0bg.cloudfront.net/images/28115101/2965728341.jpg', 'Habitación y salón', '656778899', 7, 0, 0, 1, 0, 1),
(8, 'https://mueblesmesquemobles.com/camas-dormitorios-matrimonio-eos/thrumb/EOS-10.jpg', 'Cuarto extra', '656654321', 8, 1, 0, 1, 0, 1),
(9, 'https://www.baixmoduls.com/wp-content/uploads/2022/06/dormitorio-matrimonio-cabecero-tucson-esenzia-baixmoduls.jpg', 'Buenas vistas', '656654321', 9, 1, 0, 1, 0, 0),
(10, 'https://www.garciasabate.com/wp-content/uploads/2014/07/POP1.jpg', 'Zona tranquila', '656654321', 10, 0, 0, 0, 1, 1),
(11, 'https://www.elmueble.com/medio/2023/05/18/dormitorio-de-matrimonio-moderno_4a89c34a_230518191212_2000x2735.jpg', 'Habitación doble', '656654321', 11, 1, 1, 1, 1, 1),
(12, 'https://media.revistaad.es/photos/60c22179bf852c9cf59e48c7/master/w_1600%2Cc_limit/286864.jpg', 'Cama extra', '656654321', 12, 0, 1, 1, 1, 0),
(13, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc4ApSALkok98NNJXxKZu7lHRtk71OJJ0EIIiUoCzmqXlpfrSin--A_9faKVIaSrKz7Wc&usqp=CAU', 'Apartamento duplex', '656654321', 13, 0, 1, 0, 1, 0),
(14, 'https://mueblesmesquemobles.com/camas-dormitorios-matrimonio-eos/thrumb/EOS-10.jpg', 'Exterior con piscina', '656654321', 14, 1, 0, 1, 0, 1),
(15, 'https://www.decorarhogar.es/wp-content/uploads/2014/01/decorar-habitaciones-pequenas-estilo.jpg', 'Terraza incluida', '656654321', 15, 0, 0, 0, 0, 0),
(16, 'https://images.pexels.com/photos/707581/pexels-photo-707581.jpeg?auto=compress&cs=tinysrgb&w=600', '1 habitación', '612345678', 16, 1, 1, 1, 1, 1),
(17, 'https://images.pexels.com/photos/1454806/pexels-photo-1454806.jpeg?auto=compress&cs=tinysrgb&w=600', 'Amplia soleada', '618912345', 17, 0, 1, 0, 1, 1),
(18, 'https://images.pexels.com/photos/1374125/pexels-photo-1374125.jpeg?auto=compress&cs=tinysrgb&w=600', 'Trastero incluido', '623456789', 18, 1, 0, 1, 0, 0),
(19, 'https://images.pexels.com/photos/2062431/pexels-photo-2062431.jpeg?auto=compress&cs=tinysrgb&w=600', '2 habitaciones', '619123456', 19, 1, 1, 1, 0, 1),
(20, 'https://images.pexels.com/photos/1879061/pexels-photo-1879061.jpeg?auto=compress&cs=tinysrgb&w=600', 'Soleada y amplia', '634564567', 20, 0, 0, 0, 0, 0),
(21, 'https://images.pexels.com/photos/1571450/pexels-photo-1571450.jpeg?auto=compress&cs=tinysrgb&w=600', 'Habitación tranquila', '621234567', 21, 1, 0, 1, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincias`
--

CREATE TABLE `provincias` (
  `id` varchar(2) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `provincias`
--

INSERT INTO `provincias` (`id`, `nombre`) VALUES
('00', '--Todas--'),
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(4) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(25) NOT NULL,
  `apellido2` varchar(25) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `id_direccion` int(4) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `clave` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `apellido1`, `apellido2`, `telefono`, `fecha_nacimiento`, `id_direccion`, `email`, `clave`) VALUES
(1, 'Pepe', 'Lopez', 'Garcia', '656123456', '2000-10-10 00:00:00', 1, 'pepe@hotmail.com', '123456'),
(2, 'Juan', 'Martín', 'Lopez', '656654321', '1990-05-12 00:00:00', 2, 'juan@hotmail.com', '654321'),
(3, 'Antonio', 'Perez', 'Perez', '656112233', '1999-01-20 00:00:00', 3, 'antonio@hotmail.com', '112233'),
(4, 'Esperanza', 'Villalobos', 'Nunez', '656443322', '1990-05-12 00:00:00', 4, 'esperanza@hotmail.com', '112244'),
(5, 'Juanito', 'Candella', 'Guadarrama', '655432101', '1990-05-12 00:00:00', 5, 'juanito@hotmail.com', '112244'),
(6, 'Tulio', 'Rosario', 'Iglesias', '665432104', '1990-05-12 00:00:00', 6, 'tulio@hotmail.com', '112244'),
(7, 'Lorenzo', 'Estrada', 'Gutiérrez', '653210987', '1990-05-12 00:00:00', 7, 'lorenzo@hotmail.com', '112244'),
(8, 'Juan Carlos', 'Martín', 'Perez', '653456543', '1990-05-12 00:00:00', 8, 'juancarlosse@gmail.com', '112244'),
(9, 'Afonso', 'Cortez', 'Ruiz', '654123432', '1990-05-12 00:00:00', 9, 'afonso@gmail.com', '112244'),
(10, 'Margarita', 'Garza', 'Peña', '655357986', '1990-05-12 00:00:00', 10, 'margarita@gmail.com', '112244'),
(11, 'Brigida', 'Ignacio', 'Domínguez', '653135764', '1990-05-12 00:00:00', 11, 'brigida@gmail.com', '112244'),
(12, 'Paula', 'Escarra', 'Oleastro', '652214365', '1990-05-12 00:00:00', 12, 'paula@gmail.com', '112244'),
(13, 'Valeria', 'López', 'Toledano', '651213465', '1990-05-12 00:00:00', 13, 'valeria@gmail.com', '112244'),
(14, 'Constancia', 'Fernandez', 'Perez', '659142637', '1990-05-12 00:00:00', 14, 'constancia@gmail.com', '112244'),
(15, 'Elsa', 'Martín', 'Peña', '657594837', '1990-05-12 00:00:00', 15, 'elsa@gmail.com', '112244'),
(16, 'Lucía', 'García', 'Rodríguez', '612345678', '1940-01-17 00:00:00', 16, 'lugaro@gmail.com', 'lG123456'),
(17, 'Martín', 'Medina', 'Sanz', '618912345', '1953-04-20 23:00:00', 17, 'mamesa@gmail.com', 'mM234567'),
(18, 'Martina', 'González', 'Fernández', '623456789', '1953-04-06 23:00:00', 18, 'magofe@gmail.com', 'mG234567'),
(19, 'Hugo', 'Castillo', 'Iglesias', '619123456', '1953-03-17 23:00:00', 19, 'hucai@gmail.com', 'hC345678'),
(20, 'Sofía', 'Fernández', 'López', '634564567', '1953-03-19 23:00:00', 20, 'sofelo@gmail.com', 'sF345678'),
(21, 'Mateo', 'Cortés', 'Garrido', '621234567', '1953-03-26 23:00:00', 21, 'macoga@gmail.com', 'mC456789');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `direcciones`
--
ALTER TABLE `direcciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_provincia` (`id_provincia`);

--
-- Indices de la tabla `favores`
--
ALTER TABLE `favores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `provincias`
--
ALTER TABLE `provincias`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `id_direccion` (`id_direccion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `direcciones`
--
ALTER TABLE `direcciones`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `favores`
--
ALTER TABLE `favores`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `direcciones`
--
ALTER TABLE `direcciones`
  ADD CONSTRAINT `direcciones_ibfk_1` FOREIGN KEY (`id_provincia`) REFERENCES `provincias` (`id`);

--
-- Filtros para la tabla `favores`
--
ALTER TABLE `favores`
  ADD CONSTRAINT `favores_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_direccion`) REFERENCES `direcciones` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
