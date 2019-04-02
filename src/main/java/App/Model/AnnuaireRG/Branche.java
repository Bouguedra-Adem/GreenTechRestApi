package App.Model.AnnuaireRG;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branche {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
   private String nameBranche;
   private String Adresse;
	public Branche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branche(int id, String nameBranche, String adresse) {
		super();
		this.id = id;
		this.nameBranche = nameBranche;
		Adresse = adresse;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameBranche() {
		return nameBranche;
	}
	public void setNameBranche(String nameBranche) {
		this.nameBranche = nameBranche;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	@Override
	public String toString() {
		return "Branche [id=" + id + ", nameBranche=" + nameBranche + ", Adresse=" + Adresse + "]";
	}
	
   
}
