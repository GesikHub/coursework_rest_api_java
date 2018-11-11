package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.models.CharacteristicClassType;
import restapi.repos.CharacteristicClassTypeRepos;

public class CharacteristicClassTypeController {
    @Autowired
    private CharacteristicClassTypeRepos characteristic_class_type_repos;

    @RequestMapping(value = "/characteristic_class_type", method = RequestMethod.GET, produces = "application/json")
    public Iterable<CharacteristicClassType> get_characteristic_class_type() {
        return characteristic_class_type_repos.findAll();
    }

    @RequestMapping(value = "/characteristic_class_type", method = RequestMethod.POST, produces = "application/json")
    public CharacteristicClassType set_characteristic_class_type(@RequestBody CharacteristicClassType newCharacteristicClassType) {
        return characteristic_class_type_repos.save(newCharacteristicClassType);
    }

    @RequestMapping(value = "/characteristic_class_type/{id}", method = RequestMethod.GET, produces = "application/json")
    public CharacteristicClassType get_one_characteristic_class_type(@PathVariable Long id) {
        return characteristic_class_type_repos.findOne(id);
    }

    @DeleteMapping("/characteristic_class_type/{id}")
    void delete_characteristic_class_type(@PathVariable Long id) {
        characteristic_class_type_repos.delete(id);
    }
}
