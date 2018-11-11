package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.models.Characteristic;
import restapi.repos.CharacteristicRepos;

public class CharacteristicController {

    @Autowired
    private CharacteristicRepos characteristic_repos;

    @RequestMapping(value = "/characteristic", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Characteristic> get_characteristic() {
        return characteristic_repos.findAll();
    }

    @RequestMapping(value = "/characteristic", method = RequestMethod.POST, produces = "application/json")
    public Characteristic set_characteristic(@RequestBody Characteristic newCharacteristic) {
        return characteristic_repos.save(newCharacteristic);
    }

    @RequestMapping(value = "/characteristic/{id}", method = RequestMethod.GET, produces = "application/json")
    public Characteristic get_one_characteristic(@PathVariable Long id) {
        return characteristic_repos.findOne(id);
    }

    @DeleteMapping("/characteristic/{id}")
    void delete_characteristic(@PathVariable Long id) {
        characteristic_repos.delete(id);
    }
}
