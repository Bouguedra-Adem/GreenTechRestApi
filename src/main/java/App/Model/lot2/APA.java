package App.Model.lot2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class APA {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nameAPA;
	private String categorie;
	private String type;
	private String  lienAssetes;
	private String date_publication;
	private String  dateMsj;
	public APA() {
	
		// TODO Auto-generated constructor stub
	}
	public APA(int id, String nameAPA, String categorie, String type, String lienAssetes, String date_publication,
			String dateMsj) {
		super();
		this.id = id;
		this.nameAPA = nameAPA;
		this.categorie = categorie;
		this.type = type;
		this.lienAssetes = lienAssetes;
		this.date_publication = date_publication;
		this.dateMsj = dateMsj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getnameAPA() {
		return nameAPA;
	}
	public void setnameAPA(String nameAPA) {
		this.nameAPA = nameAPA;
	}
	public String getcategorie() {
		return categorie;
	}
	public void setcategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLienAssetes() {
		return lienAssetes;
	}
	public void setLienAssetes(String lienAssetes) {
		this.lienAssetes = lienAssetes;
	}
	public String getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(String date_publication) {
		this.date_publication = date_publication;
	}
	public String getDateMsj() {
		return dateMsj;
	}
	public void setDateMsj(String dateMsj) {
		this.dateMsj = dateMsj;
	}
	@Override
	public String toString() {
		return "APA [id=" + id + ", nameAPA=" + nameAPA + ", categorie=" + categorie + ", type=" + type + ", lienAssetes="
				+ lienAssetes + ", date_publication=" + date_publication + ", dateMsj=" + dateMsj + "]";
	}
	
	
	
	

}
