package tn.esprit.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.DetailEquipe;
import tn.esprit.persistance.repositories.DetailEquipeRepository;
import tn.esprit.service.interfaces.DetailEquipeService;
import java.util.List;
//@Slf4j
@Service
public class DetailEquipeServiceImp implements DetailEquipeService {
    @Autowired
    DetailEquipeRepository detailEquipeRepo;
    @Override
    public DetailEquipe afficherDetailEquipe(Integer id) {
    	
        return this.detailEquipeRepo.findById(id).get();
    }

    @Override
    public DetailEquipe ajouterDetailEquipe(DetailEquipe e) {
        return this.detailEquipeRepo.save(e);
    }

    @Override
    public DetailEquipe mettreAjourDetailEquipe(DetailEquipe e) {
        DetailEquipe DetailEquipe = detailEquipeRepo.findById(e.getIdDetailEquipe()).orElse(null);
        if (DetailEquipe != null)
            detailEquipeRepo.save(e);
        return e;
    }

    @Override
    public void supprimerDetailEquipe(Integer id) {
        detailEquipeRepo.deleteById(id);
    }

    @Override
    public List<DetailEquipe> afficherDetailEquipes() {
        return detailEquipeRepo.findAll();

    }
    
  //  @Scheduled(cron = "*/15 * * * * *")
   // public void cronMethod() {
    //	log.info("Method  à exécute la tâche pour chaque intervalle de 15 secondes.");
//}
    
    
  //  @Scheduled(fixedDelay = 60000)
  //  public void fixedDelayMethod() {
    //	log.info("Method with fixed delay");
//}
}
