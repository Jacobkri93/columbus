package dk.kea.columbus.Controller;


import dk.kea.columbus.Repository.ColumbusRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private ColumbusRepository columbusRepository;

    public MyController(ColumbusRepository columbusRepository) {
        this.columbusRepository = columbusRepository;
    }
}
