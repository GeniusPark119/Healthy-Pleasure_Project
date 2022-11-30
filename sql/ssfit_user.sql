-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: ssfit
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userSeq` int NOT NULL AUTO_INCREMENT,
  `userId` varchar(45) NOT NULL,
  `userPass` varchar(45) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `nickname` varchar(45) NOT NULL,
  `birth` date NOT NULL,
  `mbti` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `starId` int DEFAULT NULL,
  PRIMARY KEY (`userSeq`),
  KEY `mbti_idx` (`mbti`),
  KEY `starId_idx` (`starId`),
  CONSTRAINT `mbti` FOREIGN KEY (`mbti`) REFERENCES `articletable` (`mbti`) ON DELETE SET NULL,
  CONSTRAINT `starId` FOREIGN KEY (`starId`) REFERENCES `star` (`starId`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'dhc0404','1234','최다혜','얼덜곰','1998-04-04','ENTJ','traveler9804@gmail.com',3),(2,'sj0911','11','박소정','다혜가짱이야','1996-09-11','INFP','ssafit@ssafit.com',8),(3,'123','123','123','123','2022-11-02','ISFJ','123123',4),(4,'ssafy','ssafy','김싸피','다혜짱','2022-11-01','ESFJ','da@naver.com',8),(7,'ssafit','1234','김싸피','다혜짱','2022-11-09','ENTP','da@naver.com',10),(8,'ssafit','12345','김싸피','다혜짱','2022-11-08','ISTP','da@naver.com',8);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-24 23:40:20
