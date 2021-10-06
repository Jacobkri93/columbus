let tile = {id:"1", x_pos:1, y_pos:1, tile_at_point_one:false, tile_at_point_two:false,
    tile_at_point_three:false, tile_at_point_four:false, tile_at_point_five:false, tile_at_point_six:false,
    tile_type:1, movement_points:6, id_civ:7, civ_name:"None", attitude:undefined}






function createTileObject(id,x,y,tile1,tile2,tile3,tile4,tile5,tile6,tileType,mp,civID,civName,att) {

    let tileTest = {
        id: id, x_pos: x, y_pos: y, tile_at_point_one: tile1, tile_at_point_two: tile2,
        tile_at_point_three: tile3, tile_at_point_four: tile4, tile_at_point_five: tile5, tile_at_point_six: tile6,
        tile_type: tileType, movement_points: mp, id_civ: civID, civ_name: civName, attitude: att
    }

    return console.log(tileTest)
}