-- Start New game schema

-- -----------------------------------------------------
-- Schema columbusgame
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `columbusgame`;
CREATE SCHEMA IF NOT EXISTS `columbusgame` DEFAULT CHARACTER SET utf8 ;
USE `columbusgame` ;

-- -----------------------------------------------------
-- Table `columbusgame`.`players`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `columbusgame`.`players` (
                                                        `id_player` INT NOT NULL AUTO_INCREMENT,
                                                        `amount_of_carriers` INT NOT NULL,
                                                        `amount_of_soldiers` INT NOT NULL,
                                                        `amount_of_monks` INT NOT NULL,
                                                        `currency` FLOAT NOT NULL,
                                                        `max_weight` FLOAT NOT NULL,
                                                        `remaining_bp` INT NULL,
                                                        `ship_x_pos` INT NULL,
                                                        `ship_y_pos` INT NULL,
                                                        `player_x_pos` INT NOT NULL,
                                                        `player_y_pos` INT NOT NULL,
                                                        PRIMARY KEY (`id_player`),
    UNIQUE INDEX `id_player_UNIQUE` (`id_player` ASC) )
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `columbusgame`.`civilisations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `columbusgame`.`civilisations` (
                                                              `id_civilisation` INT NOT NULL AUTO_INCREMENT,
                                                              `civilisation_name` VARCHAR(150) NOT NULL,
    `attitude_player_one` VARCHAR(150) NULL,
    `attitude_player_two` VARCHAR(45) NULL,
    `attitude_player_three` VARCHAR(45) NULL,
    `attitude_player_four` VARCHAR(45) NULL,
    PRIMARY KEY (`id_civilisation`),
    UNIQUE INDEX `id_civilisation_UNIQUE` (`id_civilisation` ASC) )
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `columbusgame`.`tile_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `columbusgame`.`tile_types` (
                                                           `id_tile_type` INT NOT NULL AUTO_INCREMENT,
                                                           `tile_type_name` VARCHAR(150) NOT NULL,
    `movement_points` INT NOT NULL,
    `id_civilisation` INT NULL,
    PRIMARY KEY (`id_tile_type`),
    UNIQUE INDEX `id_tile_type_UNIQUE` (`id_tile_type` ASC) ,
    INDEX `fk_tile_types_civilisations1_idx` (`id_civilisation` ASC) ,
    CONSTRAINT `fk_tile_types_civilisations1`
    FOREIGN KEY (`id_civilisation`)
    REFERENCES `columbusgame`.`civilisations` (`id_civilisation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `columbusgame`.`tiles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `columbusgame`.`tiles` (
                                                      `id_tile` INT NOT NULL AUTO_INCREMENT,
                                                      `x_pos` INT NULL,
                                                      `y_pos` INT NULL,
                                                      `tile_at_point_one` ENUM("true", "false") NULL,
    `tile_at_point_two` ENUM("true", "false") NULL,
    `tile_at_point_three` ENUM("true", "false") NULL,
    `tile_at_point_four` ENUM("true", "false") NULL,
    `tile_at_point_five` ENUM("true", "false") NULL,
    `tile_at_point_six` ENUM("true", "false") NULL,
    `tile_type` INT NOT NULL,
    PRIMARY KEY (`id_tile`),
    UNIQUE INDEX `id_tile_UNIQUE` (`id_tile` ASC) ,
    INDEX `fk_tiles_tile_types1_idx` (`tile_type` ASC) ,
    CONSTRAINT `fk_tiles_tile_types1`
    FOREIGN KEY (`tile_type`)
    REFERENCES `columbusgame`.`tile_types` (`id_tile_type`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `columbusgame`.`inventories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `columbusgame`.`inventories` (
                                                            `id_inventory` INT NOT NULL AUTO_INCREMENT,
                                                            `amount_gold` FLOAT NULL,
                                                            `amount_jewel` FLOAT NULL,
                                                            `amount_art` FLOAT NULL,
                                                            `amount_leather` FLOAT NULL,
                                                            `amount_canoe` FLOAT NULL,
                                                            `amount_gift` FLOAT NULL,
                                                            `amount_water` FLOAT NULL,
                                                            `amount_food` FLOAT NULL,
                                                            `id_player` INT NOT NULL,
                                                            PRIMARY KEY (`id_inventory`),
    INDEX `fk_inventories_players1_idx` (`id_player` ASC) ,
    UNIQUE INDEX `id_inventory_UNIQUE` (`id_inventory` ASC) ,
    CONSTRAINT `fk_inventories_players1`
    FOREIGN KEY (`id_player`)
    REFERENCES `columbusgame`.`players` (`id_player`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- Start New Game Data


INSERT INTO civilisations (civilisation_name,attitude_player_one,attitude_player_two,attitude_player_three,attitude_player_four)
VALUES
    ('village','neutral','neutral','neutral','neutral'),
    ('village','hostile','hostile','hostile','hostile'),
    ('village','friendly','friendly','friendly','friendly'),
    ('civilisation','neutral','neutral','neutral','neutral'),
    ('civilisation','hostile','hostile','hostile','hostile'),
    ('civilisation','friendly','friendly','friendly','friendly'),
    ('none',null,null,null,null);

INSERT INTO tile_types (tile_type_name,movement_points,id_civilisation)
VALUES
    ('jungle',6,7),
    ('desert',8,7),
    ('swamp',12,7),
    ('mountain',8,7),
    ('steppes',4,7),
    ('ocean',4,7),
    ('oceantoland',6,7) ;


INSERT INTO tiles (tile_at_point_five, tile_at_point_four, tile_at_point_one, tile_at_point_six, tile_at_point_three, tile_at_point_two, tile_type, x_pos, y_pos) VALUES
                                                                                                                                                                      (false,false,false,false,false,false,7,1,2),
                                                                                                                                                                      (false,false,false,false,false,false,7,4,6);
INSERT INTO players (id_inventory,amount_of_carriers, amount_of_soldiers, amount_of_monks, currency, max_weight, remaining_bp, ship_x_pos, ship_y_pos, player_x_pos, player_y_pos)
VALUES (1,10,10,2,20,500,12,5,5,6,6);

INSERT INTO inventories (id_inventory, amount_gold, amount_jewel, amount_art,
                         amount_leather, amount_canoe, amount_gift, amount_water, amount_food,id_player)
VALUES
    (DEFAULT,10,0,0,0,0,0,10,20,1);