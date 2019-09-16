package App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ressource {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String RessourceName;
	private String RessourceDescription;
	private String RessourceType;
	private String RessourceImage;
	
	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ressource(long id, String ressourceName, String ressourceDescription, String ressourceType,
			String ressourceImage) {
		super();
		this.id = id;
		RessourceName = ressourceName;
		RessourceDescription = ressourceDescription;
		RessourceType = ressourceType;
		RessourceImage = ressourceImage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	}
