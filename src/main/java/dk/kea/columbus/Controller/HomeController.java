package dk.kea.columbus.Controller;

import dk.kea.columbus.Model.Player;
import dk.kea.columbus.Model.Tile;
import dk.kea.columbus.Repository.*;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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



    //@GetMapping("/addPlayer")
    //public String addPlayer() {
    //    return "/gameboard";
    //}

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


    //HTTP GET (/tiles)<- URI
    @GetMapping("/tiles")
    public ResponseEntity<List<Tile>> findAll() {
        List<Tile> tiles = new ArrayList<>();
        Tile tile = new Tile();
        tileRepo.save(tile);
        tileRepo.findAll().forEach(tiles::add);  // x -> productList.add(x)

        return ResponseEntity.status(HttpStatus.OK).body(tiles);     // Httpstatus.OK = (code 200)
        // body() fortæller headeren er færdigt bygget?? og parameteren er hvad som skal stå i bodyen???

    }


    //HTTP POST Request
    @PostMapping(value="/columbus")
    public ResponseEntity<Tile> createTile(@RequestBody Tile tile){

        //hvis id er sat, så skal den ikke udføre det.
        if (tile.getId()!=null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Tile myTile = tileRepo.save(tile);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(myTile);


    }


}
