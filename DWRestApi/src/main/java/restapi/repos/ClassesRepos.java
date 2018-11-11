package restapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.models.Classes;

public interface ClassesRepos extends JpaRepository<Classes, Long> {

}

