package App.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ressource {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	 @Column(name="ressource_name")  
	private String ressource_name;
	 @Column(name="ressource_description")  
	private String ressource_description;
	 @Column(name="ressource_type")  
	private String ressource_type;
	 @Column(name="ressource_image") 
	private String ressource_image;
	 @Column(name="ressource_occcupe") 
    private int ressource_occcupe;
	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ressource(int id, String ressource_name, String ressource_description, String ressource_type,
			String ressource_image, int ressource_occcupe) {
		super();
		this.id = id;
		this.ressource_name = ressource_name;
		this.ressource_description = ressource_description;
		this.ressource_type = ressource_type;
		this.ressource_image = ressource_image;
		this.ressource_occcupe = ressource_occcupe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRessource_name() {
		return ressource_name;
	}
	public void setRessource_name(String ressource_name) {
		this.ressource_name = ressource_name;
	}
	public String getRessource_description() {
		return ressource_description;
	}
	public void setRessource_description(String ressource_description) {
		this.ressource_description = ressource_description;
	}
	public String getRessource_type() {
		return ressource_type;
	}
	public void setRessource_type(String ressource_type) {
		this.ressource_type = ressource_type;
	}
	public String getRessource_image() {
		return ressource_image;
	}
	public void setRessource_image(String ressource_image) {
		this.ressource_image = ressource_image;
	}
	public int getRessource_occcupe() {
		return ressource_occcupe;
	}
	public void setRessource_occcupe(int ressource_occcupe) {
		this.ressource_occcupe = ressource_occcupe;
	}
	@Override
	public String toString() {
		return "Ressource [id=" + id + ", ressource_name=" + ressource_name + ", ressource_description="
				+ ressource_description + ", ressource_type=" + ressource_type + ", ressource_image=" + ressource_image
				+ ", ressource_occcupe=" + ressource_occcupe + "]";
	}
  
	
	}
