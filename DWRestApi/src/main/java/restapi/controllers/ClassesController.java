package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.models.Classes;
import restapi.repos.ClassesRepos;

public class ClassesController {
    @Autowired
    private ClassesRepos classes_repos;

    @RequestMapping(value = "/classes", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Classes> get_characteristic_class_type() {
        return classes_repos.findAll();
    }

    @RequestMapping(value = "/classes", method = RequestMethod.POST, produces = "application/json")
    public Classes set_characteristic_class_type(@RequestBody Classes newClasses) {
        return classes_repos.save(newClasses);
    }

    @RequestMapping(value = "/classes/{id}", method = RequestMethod.GET, produces = "application/json")
    public Classes get_one_classes(@PathVariable Long id) {
        return classes_repos.findOne(id);
    }

    @DeleteMapping("/classes/{id}")
    void delete_classes(@PathVariable Long id) {
        classes_repos.delete(id);
    }
}
