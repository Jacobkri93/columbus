package dk.kea.columbus.Controller;

import dk.kea.columbus.Model.*;
import dk.kea.columbus.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
        if (tile.getId_tile()!=null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Tile myTile = tileRepo.save(tile);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(myTile);


    }


}
