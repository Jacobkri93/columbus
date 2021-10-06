package dk.kea.columbus.Controller;

import dk.kea.columbus.Model.Tile;
import dk.kea.columbus.Repository.ColumbusRepository;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private ColumbusRepository repository;
    //Construktor injection istedet for autowired :)

    public HomeController(ColumbusRepository repo){
        this.repository=repo;
    }


    @GetMapping ("/index")
    public String startUp (){
        return "/gameboard";
    }


    //HTTP POST Request
    @PostMapping("/columbus")
    public ResponseEntity<Tile> createTile(@RequestBody Tile tile){

        //hvis id er sat, så skal den ikke udføre det.
        if (tile.getId()!=null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Tile myTile = repository.save(tile);

        int x = myTile.getX_pos();
        int y = myTile.getY_pos();

        //location header
        String location = "/products/"+myTile.getId();

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(myTile);


    }


}
