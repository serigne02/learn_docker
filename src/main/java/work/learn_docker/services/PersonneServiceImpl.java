package work.learn_docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.learn_docker.models.Personne;
import work.learn_docker.repositories.PersonneRepo;

import java.util.List;

@Service
public class PersonneServiceImpl implements PersonneService{

    @Autowired
    private PersonneRepo personneRepo;
    @Override
    public Personne savePersonne(Personne personne){
        return personneRepo.save(personne);
    }
    @Override
    public void update(Personne personne, String id){
        personneRepo.save(personne);
    }
    @Override
    public void deletePersonne(String id){
        personneRepo.deleteById(id);
    }
    @Override
    public List<Personne> findAllPersonne(){
        return personneRepo.findAll();
    }
}

