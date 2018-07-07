CREATE TABLE `spl_domain` (
  `spl_domain_name` varchar(45) NOT NULL,
  `goal` varchar(45) NOT NULL,
  `pattern_description` varchar(45) NOT NULL,
  `date_created` varchar(45) NOT NULL,
  `domain_author` varchar(45) NOT NULL,
  PRIMARY KEY (`spl_domain_name`),
  UNIQUE KEY `spl_domain_name_UNIQUE` (`spl_domain_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
