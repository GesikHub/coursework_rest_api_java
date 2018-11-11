package restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.models.Characteristic;

public interface CharacteristicRepos extends JpaRepository<Characteristic, Long> {

}
