-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: elvispresley
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tartistas`
--

DROP TABLE IF EXISTS `tartistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tartistas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `nacionalidad` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tartistas`
--

LOCK TABLES `tartistas` WRITE;
/*!40000 ALTER TABLE `tartistas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tartistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcanciones`
--

DROP TABLE IF EXISTS `tcanciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tcanciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `duracion` varchar(5) NOT NULL,
  `link` varchar(200) NOT NULL,
  `id_genero` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `_idx` (`id_genero`),
  CONSTRAINT `FK3` FOREIGN KEY (`id_genero`) REFERENCES `tgeneros` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcanciones`
--

LOCK TABLES `tcanciones` WRITE;
/*!40000 ALTER TABLE `tcanciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcanciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcanciones_artistas`
--

DROP TABLE IF EXISTS `tcanciones_artistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tcanciones_artistas` (
  `id` int NOT NULL,
  `id_cancion` int NOT NULL,
  `id_artista` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4_idx` (`id_cancion`),
  KEY `FK5_idx` (`id_artista`),
  CONSTRAINT `FK4` FOREIGN KEY (`id_cancion`) REFERENCES `tcanciones` (`id`),
  CONSTRAINT `FK5` FOREIGN KEY (`id_artista`) REFERENCES `tartistas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcanciones_artistas`
--

LOCK TABLES `tcanciones_artistas` WRITE;
/*!40000 ALTER TABLE `tcanciones_artistas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcanciones_artistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tgeneros`
--

DROP TABLE IF EXISTS `tgeneros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tgeneros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tgeneros`
--

LOCK TABLES `tgeneros` WRITE;
/*!40000 ALTER TABLE `tgeneros` DISABLE KEYS */;
/*!40000 ALTER TABLE `tgeneros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tgeneros_artistas`
--

DROP TABLE IF EXISTS `tgeneros_artistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tgeneros_artistas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_artista` int NOT NULL,
  `id_genero` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2_idx` (`id_genero`),
  KEY `FK1` (`id_artista`),
  CONSTRAINT `FK1` FOREIGN KEY (`id_artista`) REFERENCES `tartistas` (`id`),
  CONSTRAINT `FK2` FOREIGN KEY (`id_genero`) REFERENCES `tgeneros` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tgeneros_artistas`
--

LOCK TABLES `tgeneros_artistas` WRITE;
/*!40000 ALTER TABLE `tgeneros_artistas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tgeneros_artistas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-03 13:21:57
