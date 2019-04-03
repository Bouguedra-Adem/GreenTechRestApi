package App.Model.lot4;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "embranchement")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Embranchement implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@Column(name="descEmbranchement")
	@JsonProperty("descEmbranchement")
	private String descEmbranchement;
    @Column(name="name")
	@JsonProperty("name")
	private String name;
    @Column(name="caractEmbranchement")
	@JsonProperty("caractEmbranchement")
	private String caractEmbranchement;
    
 
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "classe_id", nullable = false)
    @JsonIgnore
    private Classe classe;
    
    @OneToMany(mappedBy = "embranchement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<RessourceMarine> ressourceMarines;
    
	public Embranchement() {
	}
	public Embranchement(Integer id, String descEmbranchement, String name, String caractEmbranchement) {
		super();
		this.id = id;
		this.descEmbranchement = descEmbranchement;
		this.name = name;
		this.caractEmbranchement = caractEmbranchement;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescEmbranchement() {
		return descEmbranchement;
	}
	public void setDescEmbranchement(String descEmbranchement) {
		this.descEmbranchement = descEmbranchement;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaractEmbranchement() {
		return caractEmbranchement;
	}
	public void setCaractEmbranchement(String caractEmbranchement) {
		this.caractEmbranchement = caractEmbranchement;
	}
	public Classe getClassEmbranchement() {
		return classe;
	}
	public void setClassEmbranchement(Classe classEmbranchement) {
		this.classe = classEmbranchement;
	}	
}
