CREATE TABLE IF NOT EXISTS `ferramenta` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `links` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `perfil` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `tag` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `ferramenta_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbvxkquouf0l60oouf5xai9dr` (`ferramenta_id`),
  CONSTRAINT `FKbvxkquouf0l60oouf5xai9dr` FOREIGN KEY (`ferramenta_id`) REFERENCES `ferramenta` (`id`)
);

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `usuario_perfis` (
  `usuario_id` bigint NOT NULL,
  `perfis_id` bigint NOT NULL,
  KEY `FK7bhs80brgvo80vhme3u8m6ive` (`perfis_id`),
  KEY `FKs91tgiyagbilt959wbufiphgc` (`usuario_id`),
  CONSTRAINT `FK7bhs80brgvo80vhme3u8m6ive` FOREIGN KEY (`perfis_id`) REFERENCES `perfil` (`id`),
  CONSTRAINT `FKs91tgiyagbilt959wbufiphgc` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
);

