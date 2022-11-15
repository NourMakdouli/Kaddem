package tn.esprit.persistance.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class DetailEquipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailEquipe")
	private Integer idDetailEquipe;
	private String salle;
	private Integer thematique;
	
	//relationships
	
	@OneToOne(mappedBy = "DetailEquipe")
	private Equipe equipe;


	
	
	
	

	
	
	
	
}
