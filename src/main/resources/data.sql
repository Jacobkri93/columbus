INSERT INTO civilisations (civilisation_name,attitude)
VALUES
    ('village','neutral'),
    ('village','hostile'),
    ('village','friendly'),
    ('civilisation','neutral'),
    ('civilisation','hostile'),
    ('civilisation','friendly'),
    ('none',null);

INSERT INTO tile_types (tile_type_name,movement_points,id_civilisation)
VALUES
    ('jungle',6,7),
    ('desert',8,7),
    ('swamp',12,7),
    ('mountain',8,7),
    ('steppes',4,7),
    ('ocean',4,7),
    ('oceantoland',6,7) ;

INSERT INTO players (id_inventory,amount_of_carriers, amount_of_soldiers, currency, max_weight, remaining_bp, ship_x_pos, ship_y_pos, player_x_pos, player_y_pos)
VALUES (1,10,10,20,500,12,5,5,6,6);


INSERT INTO inventories (id_inventory, amount_gold, amount_jewel, amount_art,
                         amount_leather, amount_canoe, amount_gift, amount_water, amount_food,id_player)
VALUES
    (DEFAULT,10,0,0,0,0,0,10,20,1);
