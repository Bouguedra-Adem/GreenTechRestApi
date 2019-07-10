package App.Model.lot4;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class RESSOURCE{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nameRESSOURCE;
	private String descriptionRESSOURCE;
	private String typeRESSOURCE;
	private String categorieRESSOURCE;
	private String tagRESSOURCE;
	private String datePublicationRESSOURCE;
	private String dateMaj;
	private int idEditeur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameRESSOURCE() {
		return nameRESSOURCE;
	}
	public void setNameRESSOURCE(String nameRESSOURCE) {
		this.nameRESSOURCE = nameRESSOURCE;
	}
	public String getDescriptionRESSOURCE() {
		return descriptionRESSOURCE;
	}
	public void setDescriptionRESSOURCE(String descriptionRESSOURCE) {
		this.descriptionRESSOURCE = descriptionRESSOURCE;
	}
	public String getTypeRESSOURCE() {
		return typeRESSOURCE;
	}
	public void setTypeRESSOURCE(String typeRESSOURCE) {
		this.typeRESSOURCE = typeRESSOURCE;
	}
	public String getCategorieRESSOURCE() {
		return categorieRESSOURCE;
	}
	public void setCategorieRESSOURCE(String categorieRESSOURCE) {
		this.categorieRESSOURCE = categorieRESSOURCE;
	}
	public String getTagRESSOURCE() {
		return tagRESSOURCE;
	}
	public void setTagRESSOURCE(String tagRESSOURCE) {
		this.tagRESSOURCE = tagRESSOURCE;
	}
	public String getDatePublicationRESSOURCE() {
		return datePublicationRESSOURCE;
	}
	public void setDatePublicationRESSOURCE(String datePublicationRESSOURCE) {
		this.datePublicationRESSOURCE = datePublicationRESSOURCE;
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
	public RESSOURCE() {
		
	}
	public RESSOURCE(int id, String nameRESSOURCE, String descriptionRESSOURCE, String typeRESSOURCE, String categorieRESSOURCE, String tagRESSOURCE,
			String datePublicationRESSOURCE, String dateMaj, int idEditeur) {
		super();
		this.id = id;
		this.nameRESSOURCE = nameRESSOURCE;
		this.descriptionRESSOURCE = descriptionRESSOURCE;
		this.typeRESSOURCE = typeRESSOURCE;
		this.categorieRESSOURCE = categorieRESSOURCE;
		this.tagRESSOURCE = tagRESSOURCE;
		this.datePublicationRESSOURCE = datePublicationRESSOURCE;
		this.dateMaj = dateMaj;
		this.idEditeur = idEditeur;
	}
	
	@Override
	public String toString() {
		return "RESSOURCE [id=" + id + ", nameRESSOURCE=" + nameRESSOURCE + ", descriptionRESSOURCE=" + descriptionRESSOURCE + ", typeRESSOURCE=" + typeRESSOURCE + ", categorieRESSOURCE="
				+ categorieRESSOURCE + ", tagRESSOURCE=" + tagRESSOURCE + ", datePublicationRESSOURCE=" + datePublicationRESSOURCE + ", dateMaj=" + dateMaj + ", idEditeur=" + idEditeur + "]";
	}
}
