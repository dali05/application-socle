CREATE TABLE `application_socle_db`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `picture` BLOB NULL,
  `email` VARCHAR(100) NOT NULL,
  `mobile_phone` VARCHAR(25) NULL,
  `status` INT NOT NULL,
  `create_date` DATETIME NOT NULL,
  `last_update_date` DATETIME NOT NULL,
  `last_connection` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;