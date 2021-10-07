package dk.kea.columbus.Repository;

import dk.kea.columbus.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface InventoryRepo extends JpaRepository<Inventory,Long> {
    public Optional<Inventory> findInventoryById_player(int id);

}
