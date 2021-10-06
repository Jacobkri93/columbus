package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PlayerRepo extends JpaRepository<Player,Long> {
}
