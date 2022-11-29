package tn.esprit.persistance.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Etudiant implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idEtudiant")
	private Integer idEtudiant; 
	private String prenomE;
	private String nomE;
	@Enumerated(EnumType.STRING)
	private Option option;
    
	@Temporal (TemporalType.DATE)
	private Date dateDebut;
	
	
	
	//relationships t3ebt :(
	
	@ManyToOne
	private Departement departement;
	
	
	
	//between team and students i would rather have it in students
	@JsonIgnore
	@ManyToMany(mappedBy = "Etudiants")
	private Set<Equipe> equipes;
	
	
	@OneToMany(mappedBy = "etudiant")
	private Set<Contrat> contrats;

	

	
	
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", prenomE=" + prenomE + ", nomE=" + nomE + ", dateDebut="
				+ dateDebut + ", option=" + option + ", contrat="
				+ contrats + ", departement=" + departement + ", equipe=" + equipes + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	
	
}
   