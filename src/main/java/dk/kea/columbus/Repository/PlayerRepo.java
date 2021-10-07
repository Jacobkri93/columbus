package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface PlayerRepo extends JpaRepository<Player,Long> {

    //@Query
    //Optional<Player> findPlayerByPlayer_x_posAndPlayer_y_pos(int x,int y);
}
