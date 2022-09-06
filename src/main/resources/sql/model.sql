CREATE TABLE `joueur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `partie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
);

CREATE TABLE `partie_joueur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_partie` bigint(20) DEFAULT NULL,
  `id_joueur` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_partie` (`id_partie`),
  KEY `id_joueur` (`id_joueur`)
);

CREATE TABLE `points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_partie_joueur` bigint(20) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_partie_joueur` (`id_partie_joueur`)
);

CREATE TABLE `attribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `stay` tinyint(1) DEFAULT FALSE,
  PRIMARY KEY (`id`)
);

CREATE TABLE `carte` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `points` varchar(10) NOT NULL,
  `drink` int(11) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  `id_attribute` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_attribute` (`id_attribute`)
);