CREATE TABLE `requirement_pattern` (
  `pattern_id` int(20) NOT NULL,
  `pattern_name` longtext NOT NULL,
  `aka` longtext NOT NULL,
  `known_uses` longtext NOT NULL,
  `application` longtext NOT NULL,
  `spl_domain_name` varchar(45) NOT NULL,
  `problem` longtext NOT NULL,
  `force` longtext NOT NULL,
  `example` longtext NOT NULL,
  `author_name` longtext NOT NULL,
  `author_date` longtext NOT NULL,
  `classification_class_type` longtext NOT NULL,
  `classification_default_value` longtext NOT NULL,
  `classification_purpose` longtext NOT NULL,
  `classification_audience_role` longtext NOT NULL,
  `classification_audience_stake_goal` longtext NOT NULL,
  `classification_allowed_value` varchar(5) NOT NULL,
  `consideration_con_constraint` longtext NOT NULL,
  `consideration_con_description` longtext NOT NULL,
  `consideration_con_purpose` longtext NOT NULL,
  `context_bussiness_domain` longtext NOT NULL,
  `context_organization_factor` longtext NOT NULL,
  `context_pattern_type` longtext NOT NULL,
  `context_req_act` longtext NOT NULL,
  `context_stakeholder_role` longtext NOT NULL,
  `context_stakeholder_stake_goal` longtext NOT NULL,
  `related_pattern_id` int(20) NOT NULL,
  `relation_type_relation_extends` varchar(5) NOT NULL,
  `relation_type_relation_refers` varchar(5) NOT NULL,
  PRIMARY KEY (`pattern_id`),
  UNIQUE KEY `pattern_id_UNIQUE` (`pattern_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';