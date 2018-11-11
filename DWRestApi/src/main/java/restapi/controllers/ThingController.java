package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.models.Thing;
import restapi.repos.ThingRepos;

public class ThingController {
    @Autowired
    private ThingRepos thing_repos;

    @RequestMapping(value = "/thing", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Thing> get_thing() {
        return thing_repos.findAll();
    }

    @RequestMapping(value = "/thing", method = RequestMethod.POST, produces = "application/json")
    public Thing set_thing(@RequestBody Thing newThing) {
        return thing_repos.save(newThing);
    }

    @RequestMapping(value = "/thing/{id}", method = RequestMethod.GET, produces = "application/json")
    public Thing get_one_thing(@PathVariable Long id) {
        return thing_repos.findOne(id);
    }

    @DeleteMapping("/thing/{id}")
    void delete_thing(@PathVariable Long id) {
        thing_repos.delete(id);
    }
}
