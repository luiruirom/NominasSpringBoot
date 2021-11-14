CREATE TABLE `empleados` (
  `dni` varchar(255) NOT NULL,
  `anyos` int NOT NULL,
  `categoria` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `sexo` char(1) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
