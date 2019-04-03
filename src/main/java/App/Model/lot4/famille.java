package App.Model.lot4;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "famille")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class famille implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("descFamille")
    @Column(name="descFamille")
	private String descFamille;
	
	@ManyToMany(mappedBy = "familles")
    private Set<ressourceMicroorganisme> ressources = new HashSet<>();
	
	public famille() {
		
	}
	public famille(Integer id, String name, String descFamille) {
		super();
		this.id = id;
		this.name = name;
		this.descFamille = descFamille;
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
	public String getDescFamille() {
		return descFamille;
	}
	public void setDescFamille(String descFamille) {
		this.descFamille = descFamille;
	}
}
