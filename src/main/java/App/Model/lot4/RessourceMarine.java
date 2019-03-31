package App.Model.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ressource_Marine")
public class RessourceMarine{
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @JsonProperty("id")
   private Integer id;
   @Column(name="name")
   @JsonProperty("name")
   private String name;
   @JsonProperty("description")
   @Column(name="description")
   private String description;
   @JsonProperty("imageURL")
   @Column(name="imageURL")
   private String imageURL;
   @JsonProperty("validation")
   @Column(name="validation")
   private boolean validite;
   @JsonProperty("confidentialite")
   @Column(name="confidentialite")
   private String degreConfidentialite;
   
   
   public RessourceMarine() {
	   
   }
   
   public RessourceMarine(Integer id, String name, String description, String imageURL, boolean validite,
		   String degreConfidentialite) {
	   super();
	   this.id = id;
	   this.name = name;
	   this.description = description;
	   this.imageURL = imageURL;
	   this.validite = validite;
	   this.degreConfidentialite = degreConfidentialite;
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
}
