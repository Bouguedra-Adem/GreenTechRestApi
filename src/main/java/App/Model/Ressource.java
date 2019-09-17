package App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ressource {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String RessourceName;
	private String RessourceDescription;
	private String RessourceType;
	private String RessourceImage;
    private int RessourceOcccupe;
  
	public Ressource(int id, String ressourceName, String ressourceDescription, String ressourceType,
			String ressourceImage, int ressourceOcccupe) {
		super();
		this.id = id;
		RessourceName = ressourceName;
		RessourceDescription = ressourceDescription;
		RessourceType = ressourceType;
		RessourceImage = ressourceImage;
		RessourceOcccupe = ressourceOcccupe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRessourceName() {
		return RessourceName;
	}
	public void setRessourceName(String ressourceName) {
		RessourceName = ressourceName;
	}
	public String getRessourceDescription() {
		return RessourceDescription;
	}
	public void setRessourceDescription(String ressourceDescription) {
		RessourceDescription = ressourceDescription;
	}
	public String getRessourceType() {
		return RessourceType;
	}
	public void setRessourceType(String ressourceType) {
		RessourceType = ressourceType;
	}
	public String getRessourceImage() {
		return RessourceImage;
	}
	public void setRessourceImage(String ressourceImage) {
		RessourceImage = ressourceImage;
	}
	public int getRessourceOcccupe() {
		return RessourceOcccupe;
	}
	public void setRessourceOcccupe(int ressourceOcccupe) {
		RessourceOcccupe = ressourceOcccupe;
	}
	
	
	}
