package tn.esprit.service.classes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.persistance.entities.Departement;
import tn.esprit.persistance.repositories.DepartementRepository;
import tn.esprit.service.interfaces.DepartementService;

import java.util.List;
@Slf4j
@Service
public class DepartementServiceImp implements DepartementService {
    @Autowired
    DepartementRepository depRepo;
    
    
    
    @Override
    public Departement afficherDepartement(Integer id) {
        return this.depRepo.findById(id).get();
    }

    @Override
    public Departement ajouterDepartement(Departement e) {
        return this.depRepo.save(e);
    }

    @Override
    public Departement mettreAjourDepartement(Departement e) {
        Departement Departement = depRepo.findById(e.getIdDepartement()).orElse(null);
        if (Departement != null)
            depRepo.save(e);
        return e;
    }

    @Override
    public void supprimerDepartement(Integer id) {
    	 depRepo.deleteById(id);
    	log.info( " supprimé evec succès :"+id);
        
    }

    @Override
    public List<Departement> afficherDepartements() {
        List<Departement> departements=depRepo.findAll();
        for (Departement dep:departements){
           log.info("departement :"+dep);
        }
        return departements;

    }
}
