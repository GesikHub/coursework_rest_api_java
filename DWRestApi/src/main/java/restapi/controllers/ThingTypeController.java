package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import restapi.models.ThingType;
import restapi.repos.ThingTypeRepos;

import java.util.List;
import java.util.Map;

@RestController
public class ThingTypeController {

    @Autowired
    private ThingTypeRepos thing_type_repos;

    @RequestMapping(value = "/object_type", method = RequestMethod.GET, produces = "application/json")
    public Iterable<ThingType> get_object_type() {
        return thing_type_repos.findAll();
    }

    @RequestMapping(value = "/object_type", method = RequestMethod.POST, produces = "application/json")
    public ThingType set_object_type(@RequestBody ThingType newThingType) {
        return thing_type_repos.save(newThingType);
    }

    @RequestMapping(value = "/object_type/{id}", method = RequestMethod.GET, produces = "application/json")
    public ThingType get_one_object_type(@PathVariable Long id) {
        return thing_type_repos.findOne(id);
    }

    @DeleteMapping("/object_type/{id}")
    void delete_thing_type(@PathVariable Long id) {
        thing_type_repos.delete(id);
    }

}
