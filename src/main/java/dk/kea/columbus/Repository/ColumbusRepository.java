package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Tile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumbusRepository extends JpaRepository<Tile,Long> {

}
