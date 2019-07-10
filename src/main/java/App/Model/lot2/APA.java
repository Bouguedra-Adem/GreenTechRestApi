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
	private String descriptionAPA;
	private String typeAPA;
	private String categorieAPA;
	private String tagAPA;
	private String datePublicationAPA;
	private String dateMaj;
	private int idEditeur;
	
	public APA() {
		
	}
	public APA(int id, String nameAPA, String descriptionAPA, String typeAPA, String categorieAPA, String tagAPA,
			String datePublicationAPA, String dateMaj, int idEditeur) {
		super();
		this.id = id;
		this.nameAPA = nameAPA;
		this.descriptionAPA = descriptionAPA;
		this.typeAPA = typeAPA;
		this.categorieAPA = categorieAPA;
		this.tagAPA = tagAPA;
		this.datePublicationAPA = datePublicationAPA;
		this.dateMaj = dateMaj;
		this.idEditeur = idEditeur;
	}
	
	@Override
	public String toString() {
		return "APA [id=" + id + ", nameAPA=" + nameAPA + ", descriptionAPA=" + descriptionAPA + ", typeAPA=" + typeAPA + ", categorieAPA="
				+ categorieAPA + ", tagAPA=" + tagAPA + ", datePublicationAPA=" + datePublicationAPA + ", dateMaj=" + dateMaj + ", idEditeur=" + idEditeur + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameAPA() {
		return nameAPA;
	}
	public void setNameAPA(String nameAPA) {
		this.nameAPA = nameAPA;
	}
	public String getDescriptionAPA() {
		return descriptionAPA;
	}
	public void setDescriptionAPA(String descriptionAPA) {
		this.descriptionAPA = descriptionAPA;
	}
	public String getTypeAPA() {
		return typeAPA;
	}
	public void setTypeAPA(String typeAPA) {
		this.typeAPA = typeAPA;
	}
	public String getCategorieAPA() {
		return categorieAPA;
	}
	public void setCategorieAPA(String categorieAPA) {
		this.categorieAPA = categorieAPA;
	}
	public String getTagAPA() {
		return tagAPA;
	}
	public void setTagAPA(String tagAPA) {
		this.tagAPA = tagAPA;
	}
	public String getDatePublicationAPA() {
		return datePublicationAPA;
	}
	public void setDatePublicationAPA(String datePublicationAPA) {
		this.datePublicationAPA = datePublicationAPA;
	}
	public String getDateMaj() {
		return dateMaj;
	}
	public void setDateMaj(String dateMaj) {
		this.dateMaj = dateMaj;
	}
	public int getIdEditeur() {
		return idEditeur;
	}
	public void setIdEditeur(int idEditeur) {
		this.idEditeur = idEditeur;
	}
	
	
	
	

}
