package work.learn_docker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import work.learn_docker.models.Personne;
import work.learn_docker.services.PersonneServiceImpl;

import java.util.List;

@RestController
@Controller
@CrossOrigin("*")
public class PersonneController {
    @Autowired
    private PersonneServiceImpl personneServiceImpl;

    @GetMapping("/personne/all")
    public List<Personne> getAllPersonnes(){
        return personneServiceImpl.findAllPersonne();
    }

    @PostMapping("/personne/add")
    public Personne addNewPersonne(@RequestBody Personne personne){
        return personneServiceImpl.savePersonne(personne);
    }

    @DeleteMapping("/personne/delete/{id}")
    public void deletePersonne(@PathVariable("id") String id){
        personneServiceImpl.deletePersonne(id);
    }

    @PutMapping("/personne/update/{id}")
    public void updatePersonne(@RequestBody Personne personne, @PathVariable String id){
        personneServiceImpl.update(personne, id);
    }
}

