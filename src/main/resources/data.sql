USE columbusgame;

INSERT INTO civilisations (name_type,attitude)
VALUES
('village','neutral'),
('village','hostile'),
('village','friendly'),
('civilisation','neutral'),
('civilisation','hostile'),
('civilisation','friendly'),
('none',null);

INSERT INTO items (item_name, weight)
VALUES
('gold',4),
('jewel',2),
('art',3),
('leather',5),
('canoe',3),
('gift',2),
('water',0.5),
('food',0.5),
('canoe',3);

INSERT INTO tile_types (tile_type_name,bp,id_civilisation)
VALUES
('jungle',6,7),
('desert',8,7),
('swamp',12,7),
('mountain',8,7),
('steppes',4,7),
('ocean',4,7),
('oceantoland',6,7) ;


