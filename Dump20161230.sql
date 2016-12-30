-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: downloader_db
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dw_admin`
--

DROP TABLE IF EXISTS `dw_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_admin` (
  `dw_admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_admin_username` varchar(45) NOT NULL,
  `dw_admin_password` varchar(45) NOT NULL,
  PRIMARY KEY (`dw_admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_admin`
--

LOCK TABLES `dw_admin` WRITE;
/*!40000 ALTER TABLE `dw_admin` DISABLE KEYS */;
INSERT INTO `dw_admin` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `dw_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_comment`
--

DROP TABLE IF EXISTS `dw_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_comment` (
  `dw_comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_user_id` int(11) NOT NULL,
  `dw_downloader_id` int(11) NOT NULL,
  `dw_comment` varchar(2000) DEFAULT NULL,
  `dw_comment_date` date DEFAULT NULL,
  `dw_comment_time` time DEFAULT NULL,
  PRIMARY KEY (`dw_comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_comment`
--

LOCK TABLES `dw_comment` WRITE;
/*!40000 ALTER TABLE `dw_comment` DISABLE KEYS */;
INSERT INTO `dw_comment` VALUES (1,1,3,'first comment',NULL,NULL),(2,1,3,'second comment',NULL,NULL),(3,1,3,'by ui',NULL,NULL),(4,1,3,'2nd input',NULL,NULL),(5,1,3,'aaaaaaaaaaaaaaaa',NULL,NULL),(6,1,3,'qqqqqqqqqqqqqq',NULL,NULL),(7,1,3,'wwww',NULL,NULL),(8,1,3,'with date and time','2016-07-17','08:56:52'),(9,1,4,'aaaaaa','2016-07-17','09:21:35'),(10,1,3,'MySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:.','2016-07-17','09:33:22'),(11,1,3,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa','2016-07-17','09:39:56'),(12,1,3,'c','2016-07-17','09:40:44'),(13,1,3,'rrrrrrrrrrrrrrrrr','2016-07-17','09:43:19'),(14,1,3,'dasdasdas \"aaaa\"','2016-07-17','09:51:56'),(15,1,3,'MySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:. MySQL NOW() Function - W3Schools www.w3schools.com/sql/func_now.asp MySQL Date Functions ... The following SELECT statement: ... As a result, when you insert a row into the table, the current date and time are automatically ... You visited this page on 7/7/16. sql - Mysql query to get current date from database? - Stack Overflow stackoverflow.com/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','09:52:06'),(16,1,3,'om/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','09:52:54'),(17,1,3,'om/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','09:53:39'),(18,1,3,'MySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:. MySQL NOW() Function - W3Schools www.w3schools.com/sql/func_now.asp MySQL Date Functions ... The following SELECT statement: ... As a result, when you insert a row into the table, the current date and time are automatically ... You visited this page on 7/7/16. sql - Mysql query to get current date from database? - Stack Overflow stackoverflow.com/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','09:53:48'),(19,1,3,'om/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','09:55:15'),(20,1,3,'udithaMySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:. MySQL NOW() Function - W3Schools www.w3schools.com/sql/func_now.asp MySQL Date Functions ... The following SELECT statement: ... As a result, when you insert a row into the table, the current date and time are automatically ... You visited this page on 7/7/16. sql - Mysql query to get current date from database? - Stack Overflow stackoverflow.com/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTime','2016-07-17','10:01:03'),(21,1,3,'udithMySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:. MySQL NOW() Function - W3Schools www.w3schools.com/sql/func_now.asp MySQL Date Functions ... The following SELECT statement: ... As a result, when you insert a row into the table, the current date and time are automatically ... You visited this page on 7/7/16. sql - Mysql query to get current date from database? - Stack Overflow stackoverflow.com/questions/.../mysql-query-to-get-current-date-from-database Jan 7, 2014 - Can anyone please suggest the query to get current date from data ... The fine manual has this to say about the NOW function: mysql> SELECT ... MySQL :: MySQL 5.5 Reference Manual :: 12.7 Date and Time Functions https://dev.mysql.com/doc/refman/5.5/en/date-and-time-functions.html To use named time zones such as \"MET\" or \"Europe/Moscow\" , the time zone tables must be properly set up. See Section 10.6, âMySQL Server Time Zone Supportâ, for instructions. Returns the current date as a value in \"YYYY-MM-DD\" or YYYYMMDD format, depending on whether the function is used in a string or numeric context. â11.3 Date and Time Types Â· âMySQL Server Time Zone ... Â· âTimeMySQL CURDATE() Function - W3Schools www.w3schools.com/sql/func_curdate.asp SQL Dates MySQL Date Functions. Definition and Usage. CURDATE() returns the current date. Syntax. CURDATE(). Example. The following SELECT statement:. MySQL NOW() Function - W3Schools www.w3schools.com/sql/func_now.asp MySQL Date Functions ... The following SELECT statement: ... As a result, when you insert a row into the table, the current date and time are automatically ... You visited this page on 7/7/16. sql - Mysql query to get current date from database? - Stack Overflow stackoverf','2016-07-17','10:01:33'),(22,3,3,'qqqqqqqqsdasdsd','2016-07-17','10:03:16'),(23,6,3,'tada','2016-07-18','20:19:02'),(24,18,3,'julia\"s comment','2016-07-31','09:02:43'),(25,18,3,'julia\"s comment','2016-07-31','09:03:14'),(26,18,3,'julia\'s final comment','2016-07-31','09:05:00'),(27,18,3,'qqq','2016-07-31','09:06:38');
/*!40000 ALTER TABLE `dw_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_downloader`
--

DROP TABLE IF EXISTS `dw_downloader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_downloader` (
  `dw_downloader_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_downloader_display_name` varchar(100) NOT NULL,
  `dw_downloader_inserted_date` date DEFAULT NULL,
  `dw_downloader_file_size` double DEFAULT NULL,
  `dw_downloader_isactive` int(11) NOT NULL,
  `dw_downloader_verrified` int(11) DEFAULT NULL,
  `dw_downloader_provider_id` int(11) DEFAULT NULL,
  `dw_downloader_provider_name` varchar(100) DEFAULT NULL,
  `dw_downloader_quality_id` int(11) DEFAULT NULL,
  `dw_downloader_quality_name` varchar(100) DEFAULT NULL,
  `dw_downloader_link` varchar(500) NOT NULL,
  `dw_downloader_type_id` int(11) NOT NULL,
  PRIMARY KEY (`dw_downloader_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_downloader`
--

LOCK TABLES `dw_downloader` WRITE;
/*!40000 ALTER TABLE `dw_downloader` DISABLE KEYS */;
INSERT INTO `dw_downloader` VALUES (1,'1st insert','2016-07-09',20.5,1,1,1,'aa',1,'aaa','https://kat.cr/torrents/the-legend-of-tarzan-2016-hd-ts-x264-cpg-t12901192/',1),(2,'2st insert','2016-07-09',20.5,1,NULL,1,NULL,1,NULL,'',1),(3,'Batman vs Superman','2016-07-08',750,1,1,1,'YTS',1,'BR','',1),(4,'Game of Thrones','2016-07-10',2500.3,1,1,1,'1111',1,'1111','https://kat.cr/torrents/the-legend-of-tarzan-2016-hd-ts-x264-cpg-t12901192/',2),(5,'aaaa','2016-07-24',20,1,0,1,NULL,1,NULL,'aaaa',2),(6,'qqqqq','2016-07-24',30,0,1,1,NULL,1,NULL,'qqqq',1),(7,'sssss','2016-07-24',60,1,1,1,NULL,1,NULL,'ssss',1),(8,'new','2016-07-30',23,1,1,1,NULL,1,NULL,'dqwdqwd',1),(9,'new2','2016-07-30',12,1,1,1,NULL,1,NULL,'qwewe',1),(10,'qwewe','2016-07-30',12,1,1,1,NULL,1,NULL,'asdsdas',1),(11,'aaaa','2016-07-30',1,1,1,1,NULL,1,NULL,'aaaaaa',1),(12,'bbbb','2016-07-30',2,1,1,1,NULL,1,NULL,'bbbbb',1),(13,'dasdas','2016-07-30',2,1,1,1,NULL,1,NULL,'dsasdasd',1),(14,'ads','2016-07-30',22,1,1,1,NULL,1,NULL,'dasd',1),(15,'asd','2016-07-30',3,1,1,1,NULL,1,NULL,'dasd',1),(16,'Batman Dark Knight','2016-07-30',750,1,1,1,NULL,1,NULL,'https://yts.ag/torrent/download/F5D61BF3D57082BA2EE1305DA5DF8DCD10D34539.torrent',1),(17,'The Dark Knight Rises (2012)','2016-07-30',820,1,1,1,NULL,1,NULL,'https://yts.ag/torrent/download/CAEBDB751F2B541C9A420A15FB5C107494544285.torrent',1);
/*!40000 ALTER TABLE `dw_downloader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_imdb`
--

DROP TABLE IF EXISTS `dw_imdb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_imdb` (
  `dw_downloader_id` int(11) NOT NULL,
  `dw_imdb_id` varchar(45) NOT NULL,
  PRIMARY KEY (`dw_downloader_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_imdb`
--

LOCK TABLES `dw_imdb` WRITE;
/*!40000 ALTER TABLE `dw_imdb` DISABLE KEYS */;
INSERT INTO `dw_imdb` VALUES (3,'tt2975590'),(4,'tt4283088'),(16,'tt0468569'),(17,'tt1345836');
/*!40000 ALTER TABLE `dw_imdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_provider`
--

DROP TABLE IF EXISTS `dw_provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_provider` (
  `dw_provider_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_provider_name` varchar(100) NOT NULL,
  `dw_provider_description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`dw_provider_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_provider`
--

LOCK TABLES `dw_provider` WRITE;
/*!40000 ALTER TABLE `dw_provider` DISABLE KEYS */;
INSERT INTO `dw_provider` VALUES (1,'YIFY','YIFY'),(2,'Axe','Axe HD'),(3,'Axe','Axe BlueRay'),(4,'Axio','Axio HD'),(5,'Axio','Axio Br');
/*!40000 ALTER TABLE `dw_provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_quality_type`
--

DROP TABLE IF EXISTS `dw_quality_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_quality_type` (
  `dw_quality_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_quality_type_name` varchar(100) NOT NULL,
  `dw_quality_type_descriptionl` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`dw_quality_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_quality_type`
--

LOCK TABLES `dw_quality_type` WRITE;
/*!40000 ALTER TABLE `dw_quality_type` DISABLE KEYS */;
INSERT INTO `dw_quality_type` VALUES (1,'720p','720p'),(2,'1080p','1080p'),(3,'480p','480p');
/*!40000 ALTER TABLE `dw_quality_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_subtitle`
--

DROP TABLE IF EXISTS `dw_subtitle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_subtitle` (
  `dw_subtitle_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_downloader_id` int(11) NOT NULL,
  `dw_subtitle_language_id` int(11) DEFAULT NULL,
  `dw_subtitle_link` varchar(500) NOT NULL,
  PRIMARY KEY (`dw_subtitle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_subtitle`
--

LOCK TABLES `dw_subtitle` WRITE;
/*!40000 ALTER TABLE `dw_subtitle` DISABLE KEYS */;
INSERT INTO `dw_subtitle` VALUES (1,3,1,'http://www.yifysubtitles.com/subtitle/the-boss-2016-1080p-ytsag-english-91368.zip'),(2,1,1,'qqqqqqqqqqqqqqqqqqqqqqqqqqq'),(3,0,1,'aaaaa'),(4,12,1,'bbbbbb'),(5,13,1,'asdasd'),(6,14,1,'asddas'),(7,15,1,'asdsad'),(8,3,1,'qqqqqqqq2'),(9,12,1,'asdasd'),(10,13,1,'aSas'),(11,15,1,'aaaa'),(12,15,1,'qwewe'),(13,16,1,'http://www.yifysubtitles.com/subtitle/the-dark-knight-2008-720p-brrip-x264-yify-english-85801.zip'),(14,17,1,'http://www.yifysubtitles.com/subtitle/the-dark-knight-rises-english-yify-1952.zip'),(15,17,4,'http://www.yifysubtitles.com/subtitle/the-dark-knight-rises-english-yify-42233.zip');
/*!40000 ALTER TABLE `dw_subtitle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_subtitle_language`
--

DROP TABLE IF EXISTS `dw_subtitle_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_subtitle_language` (
  `dw_subtitle_language_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_subtitle_language_type` varchar(100) NOT NULL,
  `dw_subtitle_languagec_description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`dw_subtitle_language_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_subtitle_language`
--

LOCK TABLES `dw_subtitle_language` WRITE;
/*!40000 ALTER TABLE `dw_subtitle_language` DISABLE KEYS */;
INSERT INTO `dw_subtitle_language` VALUES (1,'English','English'),(2,'Sinhala','Sinhala'),(4,'English','Colored'),(5,'Sinhala','Colored');
/*!40000 ALTER TABLE `dw_subtitle_language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_user_account`
--

DROP TABLE IF EXISTS `dw_user_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_user_account` (
  `dw_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `dw_username` varchar(45) NOT NULL,
  `dw_email` varchar(60) NOT NULL,
  `dw_password` varchar(45) NOT NULL,
  `dw_user_isactive` int(11) NOT NULL,
  `dw_user_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`dw_user_id`),
  UNIQUE KEY `dw_user_id_UNIQUE` (`dw_user_id`),
  UNIQUE KEY `dw_username_UNIQUE` (`dw_username`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_user_account`
--

LOCK TABLES `dw_user_account` WRITE;
/*!40000 ALTER TABLE `dw_user_account` DISABLE KEYS */;
INSERT INTO `dw_user_account` VALUES (1,'uditha','mail2uditha@gmail.com','123',1,NULL),(2,'uditha 2','aa','aa',1,NULL),(3,'qqq','qq','a',1,NULL),(4,'sss','sss','ss',1,NULL),(5,'dd','dd','dd',1,NULL),(6,'qq','qqemail','qq',1,NULL),(8,'nn','nn','nn',1,NULL),(9,'xx','xx','xx',1,NULL),(10,'','','',1,NULL),(11,'asd','as','as',1,NULL),(15,'first user','a','a',1,NULL),(17,'rrr','rr','rr',1,NULL),(18,'Julia','julia@gmail.com','456',1,NULL);
/*!40000 ALTER TABLE `dw_user_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dw_user_details`
--

DROP TABLE IF EXISTS `dw_user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dw_user_details` (
  `dw_user_id` int(11) NOT NULL,
  `dw_first_name` varchar(60) NOT NULL,
  `dw_last_name` varchar(60) NOT NULL,
  `dw_dob` varchar(45) DEFAULT NULL,
  `dw_gender` varchar(45) DEFAULT NULL,
  `dw_username` varchar(45) NOT NULL,
  `dw_display_name` varchar(150) DEFAULT NULL,
  `dw_email` varchar(60) DEFAULT NULL,
  `dw_secondary_email` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`dw_user_id`),
  CONSTRAINT `dw_user_id` FOREIGN KEY (`dw_user_id`) REFERENCES `dw_user_account` (`dw_user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dw_user_details`
--

LOCK TABLES `dw_user_details` WRITE;
/*!40000 ALTER TABLE `dw_user_details` DISABLE KEYS */;
INSERT INTO `dw_user_details` VALUES (1,'uditha','jayawardena','12/05/1992','Male','uditha',NULL,NULL,NULL),(2,'uditha','jayawardena','12/05/1992','Male','uditha',NULL,NULL,NULL),(3,'uditha','jayawardena','12/05/1992','Male','uditha',NULL,NULL,NULL),(5,'dd','dd','12/05/1992','Male','dd',NULL,NULL,NULL),(6,'qq2','qq2','20/05/1992','Female','qq',NULL,NULL,NULL),(8,'nn','nn','12/05/1992','Male','nn',NULL,NULL,NULL),(9,'xx','xx','12/05/1992','Male','xx',NULL,NULL,NULL),(10,'','','12/05/1992','Male','',NULL,NULL,NULL),(11,'as','as','12/05/1992','Male','asd',NULL,NULL,NULL),(15,'a','a','19/11/1992','Female','first user',NULL,NULL,NULL),(17,'z4','z4','05/07/2016','Female','rrr',NULL,NULL,NULL),(18,'Julia','Ann','30/11/1981','Female','Julia',NULL,NULL,NULL);
/*!40000 ALTER TABLE `dw_user_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-30  7:37:29
