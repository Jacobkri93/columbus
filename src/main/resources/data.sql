USE columbusgame;
INSERT INTO inventories (id_inventory, player_id, amount_gold, amount_jewel, amount_art,
                         amount_leather, amount_canoe, amount_gift, amount_water, amount_food)
VALUES
(DEFAULT,1,10,0,0,0,0,0,10,20),
(DEFAULT,2,10,0,0,0,0,0,10,20),
(DEFAULT,3,10,0,0,0,0,0,10,20);


INSERT INTO civilisations (name_type,attitude)
VALUES
('village','neutral'),
('village','hostile'),
('village','friendly'),
('civilisation','neutral'),
('civilisation','hostile'),
('civilisation','friendly'),
('none',null);

INSERT INTO tile_types (tile_type_name,bp,id_civilisation)
VALUES
('jungle',6,7),
('desert',8,7),
('swamp',12,7),
('mountain',8,7),
('steppes',4,7),
('ocean',4,7),
('oceantoland',6,7) ;

INSERT INTO players (DEFAULT,amount_of_carriers, amount_of_soldiers, gold, inventory_id,)
VALUES
(),
