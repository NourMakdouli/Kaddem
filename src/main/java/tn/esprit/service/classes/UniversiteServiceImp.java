package tn.esprit.service.classes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.persistance.entities.Universite;
import tn.esprit.persistance.repositories.UniversiteRepository;
import tn.esprit.service.interfaces.UniversiteService;

import java.util.List;
@Service
@Slf4j
public class UniversiteServiceImp implements UniversiteService {
    @Autowired
    UniversiteRepository universiteRepo;
    @Override
    public Universite afficherUniversite(Integer id) {
    	 log.trace("here we will display 1 university <3");

        return this.universiteRepo.findById(id).get();
    }
    
    
    
    
    
    
    

    @Override
    public Universite ajouterUniversite(Universite e) {
        return this.universiteRepo.save(e);
     
    }

    @Override
    public Universite mettreAjourUniversite(Universite e) {
    	  log.info(""+e);
    	     
    	     return  universiteRepo.save(e);
    }

    @Override
    public void supprimerUniversite(Integer id) {
    	
        universiteRepo.deleteById(id);
       
    }

    @Override
    public List<Universite> afficherUniversites() {

        List<Universite> universites=universiteRepo.findAll();
        for (Universite un :universites){
            log.info("universite name :"+un.getNomUniv()+"universite department :"+un.getDepartement());
           
        }
        return universites;
    }		 

}
