package dk.kea.columbus.Controller;

import dk.kea.columbus.Model.Player;
import dk.kea.columbus.Model.Tile;
import dk.kea.columbus.Repository.TileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private TileRepository repository;
    //Construktor injection istedet for autowired :)

    public HomeController(TileRepository repo){
        this.repository=repo;
    }


    @GetMapping("/addPlayer")
    public String addPlayer() {
        return "/gameboard";
    }

    @PostMapping("/addPlayer")
    public String addPlayer(@ModelAttribute Player player, Model model) {
        repository.save(player);
        model.addAttribute("player", player);
        return "";
    }


    //HTTP GET (/tiles)<- URI
    @GetMapping("/tiles")
    public ResponseEntity<List<Tile>> findAll() {
        List<Tile> tiles = new ArrayList<>();
        repository.findAll().forEach(tiles::add);  // x -> productList.add(x)

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

        Tile myTile = repository.save(tile);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(myTile);


    }


}
