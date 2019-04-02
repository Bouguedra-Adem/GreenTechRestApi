package App.Model.AnnuaireRG;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

@Entity
public class Institut {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nameInstitut;
	private String activite;
    private String phoneNumber; 
    private String lienFb;
    private String Eamil;
    @OneToMany
    private List<Branche> branche;
	@ManyToOne
	private Categorie categorie;
	
	public Institut() {
	
		// TODO Auto-generated constructor stub
	}

	public Institut(int id, String nameInstitut, String activite, String phoneNumber, String lienFb, String eamil,
			List<Branche> branche, Categorie categorie) {
		super();
		this.id = id;
		this.nameInstitut = nameInstitut;
		this.activite = activite;
		this.phoneNumber = phoneNumber;
		this.lienFb = lienFb;
		Eamil = eamil;
		this.branche = branche;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameInstitut() {
		return nameInstitut;
	}

	public void setNameInstitut(String nameInstitut) {
		this.nameInstitut = nameInstitut;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLienFb() {
		return lienFb;
	}

	public void setLienFb(String lienFb) {
		this.lienFb = lienFb;
	}

	public String getEamil() {
		return Eamil;
	}

	public void setEamil(String eamil) {
		Eamil = eamil;
	}

	public List<Branche> getBranche() {
		return branche;
	}

	public void setBranche(List<Branche> branche) {
		this.branche = branche;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Institut [id=" + id + ", nameInstitut=" + nameInstitut + ", activite=" + activite + ", phoneNumber="
				+ phoneNumber + ", lienFb=" + lienFb + ", Eamil=" + Eamil + ", branche=" + branche + ", categorie="
				+ categorie + "]";
	}

	

}
