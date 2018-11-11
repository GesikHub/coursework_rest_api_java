package restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.models.Thing;

public interface ThingRepos extends JpaRepository<Thing, Long> {

}
