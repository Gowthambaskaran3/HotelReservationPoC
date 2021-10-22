
use testing;
CREATE TABLE `userdetails` (
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `DoB` date DEFAULT NULL,
  `mobileNo` bigint DEFAULT NULL,
  `email` varchar(255)  DEFAULT NULL,
  `user` varchar(255) default NULL,
  PRIMARY KEY (`userName`)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci