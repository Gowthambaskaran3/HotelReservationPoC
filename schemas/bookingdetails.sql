use testing;
CREATE TABLE `bookingdetails` (
  `username` varchar(255) NOT NULL,
  `roomnumber` int default NULL,
  `roomtype` varchar(255) DEFAULT NULL,
  `bookingdate` date default NULL,
  `startdate` date default NULL,
  `enddate` date default NULL,
  PRIMARY KEY (`username`)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci