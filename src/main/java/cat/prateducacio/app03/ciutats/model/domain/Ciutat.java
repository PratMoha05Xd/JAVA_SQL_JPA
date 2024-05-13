package cat.prateducacio.app03.ciutats.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ciutats")
public class Ciutat {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="Nom", length=100, unique=true, nullable=false)
	private String nom;
	
	@Column(name="Prefix", nullable=false)
	private String prefix;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String  prefix) {
		this.prefix = prefix;
	}

}
