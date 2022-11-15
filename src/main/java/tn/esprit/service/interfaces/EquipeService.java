package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.persistance.entities.Equipe;

public interface EquipeService {

	public Equipe afficherEquipe(Integer id);

	public Equipe ajouterEquipe(Equipe e);

	public Equipe mettreAjourEquipe(Equipe e);

	public void supprimerEquipe(Integer id);

	public List<Equipe> afficherEquipes();
}
