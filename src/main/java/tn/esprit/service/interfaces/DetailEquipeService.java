package tn.esprit.service.interfaces;


import tn.esprit.persistance.entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeService {

    public DetailEquipe afficherDetailEquipe(Integer id);

    public DetailEquipe ajouterDetailEquipe(DetailEquipe e);

    public DetailEquipe mettreAjourDetailEquipe(DetailEquipe e);

    public void supprimerDetailEquipe(Integer id);

    public List<DetailEquipe> afficherDetailEquipes();
}
