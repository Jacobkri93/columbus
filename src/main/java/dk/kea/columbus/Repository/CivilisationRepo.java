package dk.kea.columbus.Repository;


import dk.kea.columbus.Model.Civilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface CivilisationRepo extends JpaRepository<Civilisation,Long> {

    @Query
    Optional<Civilisation> findCivilisationByXPosAndYPos(int xPos, int yPos);

}
