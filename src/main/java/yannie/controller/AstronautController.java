package yannie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yannie.Application;
import yannie.model.AstronautModel;

@RestController
public class AstronautController {

    @GetMapping("api/astronaut")
    @ResponseBody
    public AstronautModel getAstronaut(@RequestParam("name") String name) {
        return Application.astronautManager.searchByName(name);
    }
}
