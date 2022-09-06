insert into fortynine.joueur(id, name) values (1,'guillaume'), (2,'max'), (3,'alex');
insert into fortynine.partie(id) values (1), (2);
insert into fortynine.partie_joueur(id, id_partie,id_joueur) values (1,1,1), (2,1,2), (3,1,3), (4,2,1), (5,2,2);
insert into fortynine.points(id, id_partie_joueur, point) values (1, 1, 2), (2, 1, 5), (3, 2, 1), (4, 3, 3), (5, 4, 10), (6, 5, 30), (7, 4, 1);
insert into fortynine.attribute(id, name, stay) values (1, 'Tu bois !', false), (2, 'Jeu', false), (3, 'Cataclysme', false),(4, 'Virus', true),(5, 'Dopage', true);
insert into fortynine.carte(id, name, description, points, drink, img, id_attribute) values
(1, 'Dans ma valise', '', '2', 2, '', 2),
(2, '5 Gorgées', '', 'X', 5, '', 1),
(3, 'Bouche cousue','Choisi un joueur qui devient muet. 2 gorgées par oubli','2',2,'',4),
(4, 'Séïsme', '', '3', 4, '', 3),
(5, 'Dieu', 'Tu peux distribuer jusqu\'à 4 gorgées par tour, et gracier qui tu veux quand tu veux !', '2', 4, '', 5);