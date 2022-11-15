package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.persistance.entities.Etudiant;

public interface EtudiantService {
	
	public Etudiant afficherEtudiant(Integer id);
	
	public Etudiant ajouterEtudiant(Etudiant e);
	
	public Etudiant mettreAjourEtudiant(Etudiant e);
	
	public void supprimerEtudiant (Integer id);
	
	public List<Etudiant> afficherEtudiants();
	
}
