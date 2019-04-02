package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "famille")
public class famille {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("descFamille")
    @Column(name="descFamille")
	private String descFamille;
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
