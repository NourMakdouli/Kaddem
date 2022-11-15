package tn.esprit.service.classes;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.persistance.entities.Equipe;
import tn.esprit.persistance.repositories.EquipeRepository;
import tn.esprit.service.interfaces.EquipeService;
@Slf4j
@Service
public class EquipeServiceImp implements EquipeService {

	@Autowired
	EquipeRepository equipeRep;

	@Override
	public Equipe afficherEquipe(Integer id) {
		return this.equipeRep.findById(id).get();
	}

	@Override
	public Equipe ajouterEquipe(Equipe e) {
		return this.equipeRep.save(e);
	}

	@Override
	
	public Equipe mettreAjourEquipe(Equipe e) {
		Equipe equipe = equipeRep.findById(e.getIdEquipe()).orElse(null);
		if (equipe != null)
			equipeRep.save(e);
		return e;
	}

	@Override
	public void supprimerEquipe(Integer id) {
		equipeRep.deleteById(id);
	}

	@Override
	public List<Equipe> afficherEquipes() {
		List<Equipe> equipes=equipeRep.findAll();
		for (Equipe equipe :equipes){
		 	log.info("equipe :"+equipe);
		}
		return equipes;
	}

}
