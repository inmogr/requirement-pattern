CREATE TABLE `solution` (
  `solution_id` varchar(10) NOT NULL,
  `solution_name` longtext NOT NULL,
  `pattern_id` varchar(10) NOT NULL,
  `goal` longtext NOT NULL,
  `description` longtext NOT NULL,
  `variability_model_vm_description` longtext NOT NULL,
  PRIMARY KEY (`solution_id`),
  UNIQUE KEY `solution_id_UNIQUE` (`solution_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
