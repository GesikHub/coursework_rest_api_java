package restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.models.Feature;

public interface FeatureRepos extends JpaRepository<Feature, Long> {
}