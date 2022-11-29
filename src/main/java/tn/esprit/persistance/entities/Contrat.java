package tn.esprit.persistance.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idContrat")
	private Integer idContrat; 
	
	@Temporal (TemporalType.DATE)
	private Date dateDebutContrat;
	
	@Temporal (TemporalType.DATE)
	private Date dateFinContrat;
	
	@Enumerated(EnumType.STRING)
	private Specialite specialite;
	
	private Integer montantContrat;
	private boolean archive;
	
	//relation
	    
    @JsonIgnore
    @ManyToOne
	private Etudiant etudiant;

    @Override
    public String toString() {
    	return "Contrat [idContrat=" + idContrat + ", dateDebutContrat=" + dateDebutContrat + ", dateFinContrat="
    			+ dateFinContrat + ", specialite=" + specialite + ", archive=" + archive + ", montantContrat="
    			+ montantContrat + ", etudiant=" + etudiant + "]";
    }
	
	
}
