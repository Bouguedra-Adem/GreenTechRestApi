package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "embranchement")
public class Embranchement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
}
