package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "region")
public class region {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("descRegion")
    @Column(name="descRegion")
	private String descRegion;
	@JsonProperty("caractRegion")
    @Column(name="caractRegion")
	private String caractRegion;
	
	
	public region() {
	}


	public region(Integer id, String name, String descRegion, String caractRegion) {
		super();
		this.id = id;
		this.name = name;
		this.descRegion = descRegion;
		this.caractRegion = caractRegion;
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


	public String getDescRegion() {
		return descRegion;
	}


	public void setDescRegion(String descRegion) {
		this.descRegion = descRegion;
	}


	public String getCaractRegion() {
		return caractRegion;
	}


	public void setCaractRegion(String caractRegion) {
		this.caractRegion = caractRegion;
	}
	
	
}
