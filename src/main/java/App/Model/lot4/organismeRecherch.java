package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "organisme_recherche")
public class organismeRecherch {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("adresse")
    @Column(name="adresse")
	private String adresse;
	@JsonProperty("domaine")
    @Column(name="domaine")
	private String domaine;
	public organismeRecherch() {
		
	}
	public organismeRecherch(Integer id, String name, String adresse, String domaine) {
		super();
		this.id = id;
		this.name = name;
		this.adresse = adresse;
		this.domaine = domaine;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}	
}
