CREATE TABLE `money` (
  `id` int(33) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `basic` int(33) DEFAULT NULL COMMENT '基本工资',
  `reward` int(33) DEFAULT NULL COMMENT '奖金',
  `punishment` int(33) DEFAULT NULL COMMENT '惩罚金',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;