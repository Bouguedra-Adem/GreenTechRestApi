package App.Model.AnnuaireRG;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String nameCategorie;
	public Categorie() {
	
		// TODO Auto-generated constructor stub
	}
	public Categorie(int id, String nameCategorie) {
		super();
		this.id = id;
		this.nameCategorie = nameCategorie;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameCategorie() {
		return nameCategorie;
	}
	public void setNameCategorie(String nameCategorie) {
		this.nameCategorie = nameCategorie;
	}
	
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nameCategorie=" + nameCategorie +  "]";
	}
	
	
	
	
}
