package restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.models.ThingType;

public interface ThingTypeRepos extends JpaRepository<ThingType, Long> {

}
