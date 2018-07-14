CREATE TABLE `variable_req` (
  `variable_req_id` varchar(10) NOT NULL,
  `requirement_id` varchar(10) NOT NULL,
  `var_description` longtext NOT NULL,
  `var_constraint` longtext NOT NULL,
  `fixed_part` longtext NOT NULL,
  `variation_point` longtext NOT NULL,
  `v_name` longtext NOT NULL,
  `vp_name` longtext NOT NULL,
  `model` longtext NOT NULL,
  `vp_description` longtext NOT NULL,
  `vp_constraints` longtext NOT NULL,
  PRIMARY KEY (`variable_req_id`),
  UNIQUE KEY `variable_req_id_UNIQUE` (`variable_req_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
