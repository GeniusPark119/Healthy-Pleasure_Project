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
-- Table structure for table `video`
--

DROP TABLE IF EXISTS `video`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `video` (
  `videoId` int NOT NULL AUTO_INCREMENT,
  `videoName` varchar(45) DEFAULT NULL,
  `videoUrl` mediumtext,
  PRIMARY KEY (`videoId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video`
--

LOCK TABLES `video` WRITE;
/*!40000 ALTER TABLE `video` DISABLE KEYS */;
INSERT INTO `video` VALUES (1,'명상이 필요할 때 10분 명상 가이드','https://www.youtube.com/embed/yiysD0Jl2Wo'),(2,'5분 호흡명상 - 뇌를 위한 최고의 휴식법 (스트레스 해소, 뇌 피로회복)','https://www.youtube.com/embed/dZewQEbQQM0'),(3,'생각 비우기 명상 - 부정적인 생각을 없애는 방법 (걱정, 나쁜 생각 대처법)','https://www.youtube.com/embed/cvPS_25gRPs'),(4,'5분 아침명상 | 오늘은 특별한 날입니다','https://www.youtube.com/embed/PIoK5ZdYk6E'),(5,'7분 긍정확언 - 나는 결국 잘될 것이다 (아침 확언 명상)','https://www.youtube.com/embed/xeul9fEvo-Q'),(6,'나를 응원해주는 아침명상ㅣ 어렵지 않은 명상의 시작','https://www.youtube.com/embed/iS0QoGGUs_w'),(7,'명상의 효과는 과학적으로 증명할 수 있을까? 뇌과학으로 보는 명상!','https://www.youtube.com/embed/aeqKES6Jq20'),(8,'내 안의 우주, 18분 명상','https://www.youtube.com/embed/Ubxsb8Efvoo'),(9,'왕초보 명상 ?? 호흡 인지하며 생각 비우기','https://www.youtube.com/embed/zudXOeC_2aE'),(10,'쉬운 마음챙김 호흡명상 가이드 ㅣ 파도소리 들으며 함께 명상하기','https://www.youtube.com/embed/BU9MMwnrqMM');
/*!40000 ALTER TABLE `video` ENABLE KEYS */;
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
