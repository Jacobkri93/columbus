package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.TileType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface TileTypeRepo extends JpaRepository<TileType,Long> {

    //@Query
    //Optional<TileType> findTileTypeBy
}
