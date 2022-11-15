package tn.esprit.service.interfaces;


import tn.esprit.persistance.entities.Departement;

import java.util.List;

public interface DepartementService{

    public Departement afficherDepartement(Integer id);

    public Departement ajouterDepartement(Departement e);

    public Departement mettreAjourDepartement(Departement e);

    public void supprimerDepartement(Integer id);

    public List<Departement> afficherDepartements();
}
