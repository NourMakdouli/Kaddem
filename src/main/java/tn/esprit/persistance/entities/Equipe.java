package tn.esprit.persistance.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipe implements Serializable  {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idEquipe")
	private Integer idEquipe ;
	private String nomEquipe ;
	
	@Enumerated(EnumType.STRING)
	private Niveau niveau; 
	
	
	//relationships 
	
	
	@ManyToMany
    @JsonIgnore
	private Set<Etudiant> Etudiants;
	
	
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
	private Equipe DetailEquipe;


	@Override
	public String toString() {
		return "Equipe [idEquipe=" + idEquipe + ", nomEquipe=" + nomEquipe + ", niveau=" + niveau + ", DetailEquipe="
				+ DetailEquipe + "]";
	}



}

	
	
	
	
	
	
	
	
	
	

	
	
	
