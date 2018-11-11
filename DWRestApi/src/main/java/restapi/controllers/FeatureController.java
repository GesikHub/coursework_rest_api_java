package restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.models.Feature;
import restapi.repos.FeatureRepos;

public class FeatureController {
    @Autowired
    private FeatureRepos feature_repos;

    @RequestMapping(value = "/feature", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Feature> get_feature() {
        return feature_repos.findAll();
    }

    @RequestMapping(value = "/feature", method = RequestMethod.POST, produces = "application/json")
    public Feature set_feature(@RequestBody Feature newFeature) {
        return feature_repos.save(newFeature);
    }

    @RequestMapping(value = "/feature/{id}", method = RequestMethod.GET, produces = "application/json")
    public Feature get_feature(@PathVariable Long id) {
        return feature_repos.findOne(id);
    }

    @DeleteMapping("/feature/{id}")
    void delete_feature(@PathVariable Long id) {
        feature_repos.delete(id);
    }

}
