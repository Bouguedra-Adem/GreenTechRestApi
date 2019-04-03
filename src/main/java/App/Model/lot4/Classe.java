package App.Model.lot4;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "classe")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Classe implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("descClasse")
	@Column(name="descClasse")
	private String descClasse;
	@JsonProperty("caractClasse")
    @Column(name="caractClasse")
	private String caractClasse;
	@JsonProperty("intereCreation")
	@Column(name="intereCreation")
	private String intereCreation;
	
	 @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	 private Set<Embranchement> embranchements;
	
	public Classe() {
	}

	public Classe(Integer id, String name, String descClasse, String caractClasse, String intereCreation) {
		super();
		this.id = id;
		this.name = name;
		this.descClasse = descClasse;
		this.caractClasse = caractClasse;
		this.intereCreation = intereCreation;
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

	public String getDescClasse() {
		return descClasse;
	}

	public void setDescClasse(String descClasse) {
		this.descClasse = descClasse;
	}

	public String getCaractClasse() {
		return caractClasse;
	}

	public void setCaractClasse(String caractClasse) {
		this.caractClasse = caractClasse;
	}

	public String getIntereCreation() {
		return this.intereCreation;
	}

	public void setIntereCreation(String intereCreation) {
		this.intereCreation = intereCreation;
	}
}
