package tn.esprit.service.interfaces;

import tn.esprit.persistance.entities.Universite;

import java.util.List;

public interface UniversiteService {

    public Universite afficherUniversite(Integer id);

    public Universite ajouterUniversite(Universite e);

    public Universite mettreAjourUniversite(Universite e);

    public void supprimerUniversite(Integer id);

    public List<Universite> afficherUniversites();
}
