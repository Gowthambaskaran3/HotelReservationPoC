use testing;
CREATE TABLE `roomdetails` (
  `roomnumber` int NOT NULL,
  `roomtype` varchar(255) DEFAULT NULL,
  `capacity` int DEFAULT NULL,
  `availability` varchar(255) default null,
  PRIMARY KEY (`roomnumber`)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci