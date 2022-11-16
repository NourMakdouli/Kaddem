package tn.esprit.service.classes;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.persistance.entities.Etudiant;
import tn.esprit.persistance.repositories.EtudiantRepository;
import tn.esprit.service.interfaces.EtudiantService;
@Slf4j
@Service
public class EtudiantServiceImpl implements EtudiantService {
	
	//private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	
	
	
	

	@Autowired
	EtudiantRepository etudRep;

	@Override
	public Etudiant afficherEtudiant(Integer id) {
		log.trace("a student was displayed");

		return this.etudRep.findById(id).get();
	}

	@Override
	public Etudiant ajouterEtudiant(Etudiant e) {
		return this.etudRep.save(e);
	}

	@Override
	public Etudiant mettreAjourEtudiant(Etudiant e) {

		log.info(""+e.getIdEtudiant()+"before saving changes");
	      log.info("saving new values ...");
	      if(!etudRep.existsById(e.getIdEtudiant())) { 
	    	  log.info("save"+e);
	    	  return etudRep.save(e);
	    	  
	    		  }
	    
	      return e;
	}

	@Override
	public void supprimerEtudiant(Integer id) {

		etudRep.deleteById(id);
	}

	@Override
	public List<Etudiant> afficherEtudiants() {

		List<Etudiant> etudiants= etudRep.findAll();

		for (Etudiant etud :etudiants){
				log.info("etudiant name :"+etud.getNomE());
			}

	
		return etudiants;
	}

	//@Scheduled(fixedRate = 5000)
	//public void reportCurrentTime() {
	//	log.info("The time is now {}", dateFormat.format(new Date()));
	//}


}
