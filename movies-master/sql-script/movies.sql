CREATE DATABASE  IF NOT EXISTS `cinema`;
USE `cinema`;


DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`movie_name` varchar(45) NOT NULL,
	`release_year` int(4) NOT NULL,
	`rating` double default 0,
	`genre` varchar(45) DEFAULT NULL,
	`plot`varchar(1000) DEFAULT NULL,
    `duration` INT NOT NULL, -- en minutes
    `language` VARCHAR(50),
    `subtitles` VARCHAR(50),
    `director` VARCHAR(255),
    `main_actors` TEXT,
    `minimum_age` INT,
    `start_date` DATE,
    `end_date` DATE,
    `days_of_week` VARCHAR(15),
    `start_time` TIME,
    `cinema_address` VARCHAR(255),
    `city` VARCHAR(100),
    PRIMARY KEY (`id`)
  
  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



INSERT INTO movie (movie_name, release_year, rating, genre, plot, duration, language, subtitles, director, main_actors, minimum_age, start_date, end_date, days_of_week, start_time, cinema_address, city)
VALUES
('Espace Lointain', 2021, 8.5, 'Science-fiction', 'Une épopée interstellaire à travers des galaxies inconnues.', 120, 'Français', 'Anglais', 'Jean Dupont', 'Acteur A, Actrice B', 12, '2023-01-15', '2023-01-30', 'Lundi, Mardi', '20:00', '123 Rue de Cinéma', 'Paris'),
('Aventure en Montagne', 2019, 7.2, 'Aventure', 'Un groupe d\'amis découvre des secrets cachés dans les montagnes.', 90, 'Français', NULL, 'Marie Leclerc', 'Acteur C, Actrice D', 8, '2023-02-01', '2023-02-14', 'Vendredi,Samedi', '18:00', '456 Avenue de l\'Écran', 'Lyon'),
('Histoires de la Ville', 2020, 6.9, 'Drame', 'La vie quotidienne et les défis des habitants d\'une grande métropole.', 105, 'Français', 'Espagnol', 'Luc Besson', 'Acteur E, Actrice F', 16, '2023-03-05', '2023-03-20', 'Lundi,Jeudi,Samedi', '19:30', '789 Boulevard du Film', 'Marseille'),
('Voyage Solaire', 2022, 7.8, 'Science-fiction', 'Une aventure épique à travers le système solaire.', 130, 'Anglais', 'Français', 'Alice Martin', 'Acteur G, Actrice H', 10, '2023-04-10', '2023-04-24', 'Mardi, Mercredi', '21:00', '101 Rue du Soleil', 'Nice'),
('Les Mystères de l\'Océan', 2018, 6.5, 'Aventure', 'Une expédition sous-marine révèle des secrets enfouis sous les vagues.', 115, 'Anglais', NULL, 'Pierre Dubois', 'Acteur I, Actrice J', 7, '2023-05-15', '2023-05-29', 'Samedi,Dimanche', '17:00', '202 Rue de l\'Océan', 'Bordeaux'),
('La Comédie de la Vie', 2021, 8.1, 'Comédie', 'Les péripéties humoristiques d\'une famille moderne.', 95, 'Français', 'Anglais', 'Sophie Lemoine', 'Acteur K, Actrice L', 6, '2023-06-01', '2023-06-15', 'Mercredi,Jeudi', '18:30', '303 Avenue de la Joie', 'Toulouse'),
('Le Roi Lion', 1994, 8.5, 'Animation', 'Un jeune lion est destiné à devenir roi de la savane, mais est confronté à de nombreux défis.', 88, 'Français', 'Anglais', 'Roger Allers, Rob Minkoff', 'Matthew Broderick, James Earl Jones', 0, '2023-07-01', '2023-07-15', 'Lundi, Mardi', '14:00', '1 Disney Road', 'Paris'),
('La Belle et la Bête', 1991, 8.0, 'Animation', 'Une jeune femme intelligente est emprisonnée dans le château d\'une bête terrifiante, où elle apprend à regarder au-delà des apparences.', 84, 'Français', 'Anglais', 'Gary Trousdale, Kirk Wise', 'Paige O\'Hara, Robby Benson', 0, '2023-08-05', '2023-08-19', 'Mercredi, Jeudi ', '16:00', '2 Disney Road', 'Lyon'),
('Aladdin', 1992, 8.0, 'Animation', 'Un jeune vaurien des rues découvre une lampe magique et un génie qui peut lui accorder trois vœux.', 90, 'Français', 'Anglais', 'John Musker, Ron Clements', 'Scott Weinger, Robin Williams', 0, '2023-09-10', '2023-09-24', 'Vendredi, Samedi', '15:00', '3 Disney Road', 'Marseille');


SELECT * FROM Movie;
