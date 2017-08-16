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

INSERT INTO `application_socle_db`.`user`
(`login`, `password`, `first_name`, `last_name`, `email`, `mobile_phone`, `status`, `create_date`, `last_update_date`, `last_connection`)
VALUES
   ('login1', 'password1', 'First Name 1', 'Last Name 1', 'email1@email.com', '+21612345678', '1', STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'))
  ,('login2', 'password2', 'First Name 2', 'Last Name 2', 'email2@email.com', '+21612345678', '1', STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'))
  ,('login3', 'password3', 'First Name 3', 'Last Name 3', 'email3@email.com', '+21612345678', '1', STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'))
  ,('login4', 'password4', 'First Name 4', 'Last Name 4', 'email4@email.com', '+21612345678', '1', STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'), STR_TO_DATE('2013-02-11', '%Y-%m-%d'));