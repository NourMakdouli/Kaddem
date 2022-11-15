package tn.esprit.service.interfaces;

import tn.esprit.persistance.entities.Contrat;

import java.util.List;

public interface ContratService {
    public Contrat afficherContrat(Integer id);

    public Contrat ajouterContrat(Contrat e);

    public Contrat mettreAjourContrat(Contrat e);

    public void supprimerContrat(Integer id);

    public List<Contrat> afficherContrats();
    //cron
    void archiverContratsChaqueAnnee();
}
