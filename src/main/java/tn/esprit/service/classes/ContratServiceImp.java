package tn.esprit.service.classes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.persistance.entities.*;
import tn.esprit.persistance.repositories.ContratRepository;
import tn.esprit.service.interfaces.ContratService;

import java.util.List;

@Slf4j
@Service
public class ContratServiceImp implements ContratService {
    @Autowired
    ContratRepository contratRepo;

    @Override
    public Contrat afficherContrat(Integer id) {

        return contratRepo.findById(id).get();
    }

    @Override
    public Contrat ajouterContrat(Contrat e) {
        return this.contratRepo.save(e);

    }

    @Override
    public Contrat mettreAjourContrat(Contrat e) {
        Contrat Contrat = contratRepo.findById(e.getIdContrat()).orElse(null);
        if(Contrat != null)
            contratRepo.save(e);
        return e;

    }

    @Override
    public void supprimerContrat(Integer id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> afficherContrats() {

        log.info(" contracts are successfully retreived ...");
        
        return contratRepo.findAll();

    }
    


    
    @Override         
	@Scheduled(cron = "0 0 0 1 1 *")
	public void archiverContratsChaqueAnnee() {
    	List<Contrat> contrats= contratRepo.findAll();
         for (Contrat c :contrats){
        	 if(c.isArchive()==false) {
        		 log.info("we are assigning true to each contract but we're not doing anything else ");
            	 c.setArchive(true);
        	 } else 
        		 log.info(c.getIdContrat()+"  is already archived");
         }
           
        	 
    }}

