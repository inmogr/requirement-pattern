CREATE TABLE `requirement` (
  `req_id` varchar(10) NOT NULL,
  `req_name` longtext NOT NULL,
  `solution_id` varchar(10) NOT NULL,
  `req_type` longtext NOT NULL,
  `req_description` longtext NOT NULL,
  `priority` longtext NOT NULL,
  `pattern_name` longtext NOT NULL,
  PRIMARY KEY (`req_id`),
  UNIQUE KEY `req_id_UNIQUE` (`req_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
