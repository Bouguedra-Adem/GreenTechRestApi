package App.Model.lot4;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "ressource_fort_aromatique")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class RessourceForrestiereAromatique implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("description")
    @Column(name="description")
	private String description;
	@JsonProperty("imageURL")
    @Column(name="imageURL")
	private String imageURL;
	@JsonProperty("validite")
    @Column(name="validite")
    private boolean validite;
	@JsonProperty("degreConfidentialite")
    @Column(name="degreConfidentialite")
	private String degreConfidentialite;
	@JsonProperty("produitDerive")
    @Column(name="produitDerive")
	private String produitDerive;
	
	
    
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    @JsonIgnore
    private Type type;
	
	public RessourceForrestiereAromatique() {
	}
	
	public RessourceForrestiereAromatique(Integer id, String name, String description, String imageURL,
			boolean validite, String degreConfidentialite, String produitDerive) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
		this.validite = validite;
		this.degreConfidentialite = degreConfidentialite;
		this.produitDerive = produitDerive;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public boolean isValidite() {
		return validite;
	}

	public void setValidite(boolean validite) {
		this.validite = validite;
	}

	public String getDegreConfidentialite() {
		return degreConfidentialite;
	}

	public void setDegreConfidentialite(String degreConfidentialite) {
		this.degreConfidentialite = degreConfidentialite;
	}


	public String getProduitDerive() {
		return produitDerive;
	}


	public void setProduitDerive(String produitDerive) {
		this.produitDerive = produitDerive;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
}
	

