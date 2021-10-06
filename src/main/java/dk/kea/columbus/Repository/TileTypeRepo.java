package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TileTypeRepo extends JpaRepository<Tile,Long> {
}
