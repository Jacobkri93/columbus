package dk.kea.columbus.Controller;

import dk.kea.columbus.Model.*;
import dk.kea.columbus.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    private CivilisationRepo civilisationRepo;
    private InventoryRepo inventoryRepo;
    private PlayerRepo playerRepo;
    private TileRepo tileRepo;
    private TileTypeRepo tileTypeRepo;

    public HomeController(CivilisationRepo civilisationRepo, InventoryRepo inventoryRepo, PlayerRepo playerRepo, TileRepo tileRepo, TileTypeRepo tileTypeRepo){
        this.civilisationRepo = civilisationRepo;
        this.inventoryRepo = inventoryRepo;
        this.playerRepo = playerRepo;
        this.tileRepo = tileRepo;
        this.tileTypeRepo = tileTypeRepo;

    }

    //<editor-fold desc="GetAll">
    //HTTP GET (/tiles)<- URI
    @GetMapping("/tiles")
    public ResponseEntity<List<Tile>> findAllTiles() {
        List<Tile> tiles = new ArrayList<>();
        tileRepo.findAll().forEach(tiles::add);  // x -> list.add(x)

        return ResponseEntity.status(HttpStatus.OK).body(tiles);     // Httpstatus.OK = (code 200)
    }

    //HTTP GET tile_types
    @GetMapping("/tiletypes")
    public ResponseEntity<List<TileType>> findAllTileTypes(){
        List<TileType> tileTypes = new ArrayList<>();
        tileTypeRepo.findAll().forEach(tileTypes::add);
        return ResponseEntity.status(HttpStatus.OK).body(tileTypes);
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> findAllPlayers(){
        List<Player> players = new ArrayList<>();
        playerRepo.findAll().forEach(players::add);
        return ResponseEntity.status(HttpStatus.OK).body(players);
    }

    @GetMapping("/civilisations")
    public ResponseEntity<List<Civilisation>> findAllCivilisations(){
        List<Civilisation> civs = new ArrayList<>();
        civilisationRepo.findAll().forEach(civs::add);
        return ResponseEntity.status(HttpStatus.OK).body(civs);
    }

    @GetMapping("/inventories")
    public ResponseEntity<List<Inventory>> findAllInventories(){
        List<Inventory> inventories = new ArrayList<>();
        inventoryRepo.findAll().forEach(inventories::add);
        return ResponseEntity.status(HttpStatus.OK).body(inventories);
    }
    //</editor-fold> // alle

/*
    @GetMapping("/tiles/{x_pos}/{y_pos}")
    public ResponseEntity<Tile> findTileByCoords(@PathVariable("x_pos") int x,
                                                 @PathVariable("y_pos") int y){
        Optional<Tile> product = tileRepo.findTileByX_posAndY_pos(x,y);
        if(product.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(product.get());
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

 */

    @GetMapping("/players/{id}")
    public ResponseEntity<Player> findPlayerById(@PathVariable("id") Long id){
        Optional<Player> player = playerRepo.findById(id);
        if (player.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(player.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);}
    }

    /*
    @GetMapping("/players/{x_pos}/{y_pos}")
    public ResponseEntity<Player> findPlayerByCoord(@PathVariable("x_pos") int x,
                                                    @PathVariable("y_pos") int y){

        Optional<Player> player = playerRepo.findPlayerByPlayer_x_posAndPlayer_y_pos(x,y);
        if (player.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(player.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

     */


    @GetMapping("/inventories/{id}") //inventory id
    public ResponseEntity<Inventory> findInventoryById(@PathVariable("id") Long id){
        Optional<Inventory> inventory = inventoryRepo.findById(id);
        if (inventory.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(inventory.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    /*
    @GetMapping ("/inventories/{id_player}") //player Id
    public ResponseEntity<Inventory> findInventoryByPlayerId(@PathVariable("id_player")int id){
        Optional<Inventory> inventory = inventoryRepo.findInventoryById_player(id);
        if (inventory.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(inventory.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

     */

    @GetMapping("tiletypes/{id}")
    public ResponseEntity<TileType> findTileTypeById(@PathVariable("id") Long id){
        Optional<TileType> tileType = tileTypeRepo.findById(id);
        if (tileType.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(tileType.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
/*
    @GetMapping("/civilisation/{id}")
    public ResponseEntity<Civilisation> findCivilisationById(@PathVariable("id") Long id){
        Optional<Civilisation> civilisation= civilisationRepo.findById(id);
        if (civilisation.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(civilisation.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/civilisation/{x_pos}/{y_pos}")
    public ResponseEntity<Civilisation> findCivilisationByXandY(@PathVariable("x_pos")int x,
                                                                @PathVariable("y_pos") int y){
        Optional<Civilisation> civ = civilisationRepo.findCivilisationByX_posAndY_pos(x,y);
        if (civ.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(civ.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


 */

    @CrossOrigin(origins = "*", exposedHeaders = "Location")
    @PostMapping("/addPlayer")
    public ResponseEntity<Player> addPlayer() {
        Player player1 = new Player(5,10,10,2,20,
                200,12,5,3,3,2);
        playerRepo.save(player1);

        //location header
        String location = "/gameboard.html";

        //HTTPStatus Created 201
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Location",location)
                .body(player1);

    }


    //HTTP POST Request
    @PostMapping(value="/columbus")
    public ResponseEntity<Tile> createTile(@RequestBody Tile tile){

        //hvis id er sat, så skal den ikke udføre det.
        if (tile.getIdTile()!=null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Tile myTile = tileRepo.save(tile);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(myTile);


    }


}
