package work.learn_docker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import work.learn_docker.models.Personne;

import java.util.List;

@Repository
public interface PersonneRepo extends JpaRepository<Personne, String> {
    /*using JPQL
    @Query(value = "select * from personne", nativeQuery = true)
    List<Personne> getAllPersonnes();*/
}
