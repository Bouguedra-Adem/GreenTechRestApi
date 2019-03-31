package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "type_Res_Fort")
public class TypeResFort {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	@JsonProperty("libele")
    @Column(name="libele")
	private String libele;
	
	public TypeResFort() {
	}

	public TypeResFort(Integer id, String name, String libele) {
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
