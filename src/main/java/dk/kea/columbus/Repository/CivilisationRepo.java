package dk.kea.columbus.Repository;


import dk.kea.columbus.Model.Civilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface CivilisationRepo extends JpaRepository<Civilisation,Long> {

  //  public Optional<Civilisation> findCivilisationByX_posAndY_pos(int x_pos,int y_pos);

}
