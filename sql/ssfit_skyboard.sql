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
-- Table structure for table `skyboard`
--

DROP TABLE IF EXISTS `skyboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skyboard` (
  `skySeq` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` longtext,
  `imgUri` varchar(300) NOT NULL,
  `regDate` varchar(45) NOT NULL,
  `userSeq` int DEFAULT NULL,
  `imgName` varchar(300) DEFAULT NULL,
  `yearMonth` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`skySeq`),
  KEY `userSeq_idx` (`userSeq`),
  CONSTRAINT `skyUserSeq` FOREIGN KEY (`userSeq`) REFERENCES `user` (`userSeq`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skyboard`
--

LOCK TABLES `skyboard` WRITE;
/*!40000 ALTER TABLE `skyboard` DISABLE KEYS */;
INSERT INTO `skyboard` VALUES (1,'ㄹㄹ','ㄹㄹ','/upload/KakaoTalk_20221123_110201251_02.jpg','2022-11-24',3,'KakaoTalk_20221123_110201251_02.jpg','2022-11'),(2,'ㄹㄹ','ㄹㄹ','/upload/KakaoTalk_20221123_110201251_02.jpg','2022-11-24',3,'KakaoTalk_20221123_110201251_02.jpg','2022-11'),(3,'d','d','/upload/KakaoTalk_20221123_110201251_01.jpg','2022-11-24',3,'KakaoTalk_20221123_110201251_01.jpg','2022-11'),(4,'ㅇㅇㅇ','ㅇㅇㅇ','/upload/KakaoTalk_20221123_110201251_02.jpg','2022-11-24',3,'KakaoTalk_20221123_110201251_02.jpg','2022-11'),(5,'ㅁ','ㅁ','/upload/KakaoTalk_20221123_110201251.jpg','2022-11-24',3,'KakaoTalk_20221123_110201251.jpg','2022-11'),(6,'d','d','/upload/colorlib-registration-form-7.jpg.webp','2022-11-24',3,'colorlib-registration-form-7.jpg.webp','2022-11'),(7,'오늘의 하늘','뭉게뭉게 구름이 많았다','/upload/KakaoTalk_20221123_110201251.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251.jpg','2022-11'),(8,'밤하늘을 보았다','별들이 많아서 예뻤다','/upload/KakaoTalk_20221123_110201251_02.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_02.jpg','2022-11'),(9,'비가오는날','비오는 하늘은 갬성있었다','/upload/KakaoTalk_20221123_110201251_01.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_01.jpg','2022-11'),(10,'눈사람 만들자','눈이 소복소복 쌓였다','/upload/KakaoTalk_20221123_110201251.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251.jpg','2022-11'),(11,'하늘이 너무 예뻤다','하늘을 보자','/upload/KakaoTalk_20221123_110201251_01.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_01.jpg','2022-11'),(12,'목이 시원하다','하늘을 보니','/upload/KakaoTalk_20221123_110201251.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251.jpg','2022-11'),(13,'하늘을 보자','하늘하늘','/upload/KakaoTalk_20221123_110201251_01.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_01.jpg','2022-11'),(14,'공룡모양 구름이 지나갔다','공룡이닷','/upload/KakaoTalk_20221123_110201251_03.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_03.jpg','2022-11'),(15,'오늘 하늘은 파랗다','날씨 좋다 미션 클리어!','/upload/KakaoTalk_20221123_110201251_03.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_03.jpg','2022-11'),(16,'하늘 보기 미션','미션 클리어','/upload/KakaoTalk_20221123_110201251_01.jpg','2022-11-24',4,'KakaoTalk_20221123_110201251_01.jpg','2022-11');
/*!40000 ALTER TABLE `skyboard` ENABLE KEYS */;
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
