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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "type_Res_Fort")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Type  implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("libele")
    @Column(name="libele")
	private String libele;
	
	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<RessourceForrestiereAromatique> ressources;
	
	public Type() {
	}
    
	public Type(Integer id, String name, String libele) {
		super();
		this.id = id;
		this.name = name;
		this.libele = libele;
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

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
   
}
