package work.learn_docker.services;

import work.learn_docker.models.Personne;

import java.util.List;

public interface PersonneService {

    Personne savePersonne(Personne personne);
    void update(Personne personne, String id);
    void deletePersonne(String id);
    List<Personne> findAllPersonne();
}
