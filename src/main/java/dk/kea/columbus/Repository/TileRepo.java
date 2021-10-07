package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface TileRepo extends JpaRepository<Tile,Long> {

    @Query
    Optional<Tile> findTileByX_posAndY_pos (int x, int y);

}

