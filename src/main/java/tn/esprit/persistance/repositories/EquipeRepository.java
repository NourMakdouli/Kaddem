package tn.esprit.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository <Equipe, Integer> {

}
