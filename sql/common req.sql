CREATE TABLE `common_req` (
  `common_req_id` int(20) NOT NULL,
  `requirement_id` double NOT NULL,
  `common_description` longtext NOT NULL,
  `common_constraint` longtext NOT NULL,
  `fixed_part` longtext NOT NULL,
  `extended_part` longtext NOT NULL,
  PRIMARY KEY (`common_req_id`),
  UNIQUE KEY `common_req_id_UNIQUE` (`common_req_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
