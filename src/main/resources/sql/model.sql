CREATE TABLE `player` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
);

CREATE TABLE `game_player` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_game` bigint(20) DEFAULT NULL,
  `id_player` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_game` (`id_game`),
  KEY `id_player` (`id_player`)
);

CREATE TABLE `points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_game_player` bigint(20) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_game_player` (`id_game_player`)
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