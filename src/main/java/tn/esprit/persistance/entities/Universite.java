package tn.esprit.persistance.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUniversite")
	private Integer idUniversite; 
	private String nomUniv;

	//relationships
	@OneToMany
	private Set<Departement> Departement;

	@Override
	public String toString() {
		return "Universite [idUniversite=" + idUniversite + ", nomUniv=" + nomUniv + ", Departement=" + Departement
				+ "]";
	}

	
	
}
