package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.persistance.entities.Departement;
import tn.esprit.service.interfaces.DepartementService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/controllerDepartement")
public class DepartementController {
    @Autowired
    DepartementService departService;

    
    @GetMapping("/DisplayDepartements")
    public List<Departement> DisplayDepartement() {
        return departService.afficherDepartements();
    }
    
    @CrossOrigin
    @GetMapping("/DisplayDepartementById/{id}")
    public Departement displayDepartementByID(@PathVariable("id") int id) {

        return departService.afficherDepartement(id);
    }
    
    @CrossOrigin
    @PostMapping("/AddDepartement")
    public Departement addDepartement(@RequestBody Departement e) {
        return departService.ajouterDepartement(e);
    }
    @CrossOrigin
    @PutMapping("/UpdateDepartement")
    public Departement updateDepartement(@RequestBody Departement e) {
        return departService.mettreAjourDepartement(e);
    }
    @CrossOrigin
    @DeleteMapping("/deleteDepartement/{idDepartement}")
    public void deleteDepartement(@PathVariable("idDepartement") int id) {
        departService.supprimerDepartement(id);
    }

}
