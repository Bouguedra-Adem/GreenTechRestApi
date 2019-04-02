package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "groupe")
public class groupe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("descGroupe")
    @Column(name="descGroupe")
	private String descGroupe;
	public groupe() {
		
	}
	public groupe(Integer id, String name, String descGroupe) {
		super();
		this.id = id;
		this.name = name;
		this.descGroupe = descGroupe;
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
	public String getDescGroupe() {
		return descGroupe;
	}
	public void setDescGroupe(String descGroupe) {
		this.descGroupe = descGroupe;
	}
	
}
