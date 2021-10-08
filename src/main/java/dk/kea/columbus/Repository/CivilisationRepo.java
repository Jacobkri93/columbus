package dk.kea.columbus.Repository;


import dk.kea.columbus.Model.Civilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface CivilisationRepo extends JpaRepository<Civilisation,Long> {

  Optional<Civilisation> findCivilisationByCivXPosAndCivYPos(int x,int y);

}
