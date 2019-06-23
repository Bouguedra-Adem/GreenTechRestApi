package App.Model.User;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import App.Model.lot1_5.Document;

@Entity

@Table(name="Compte")
public class user {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   @NotEmpty
	   private String Nom;
	   @NotEmpty
	   private String Prenom;
	   @NotEmpty
	   private String Nss;
	   @NotEmpty
	   private String email;
	   @NotEmpty
	   private String Organisme;
	   @NotEmpty
	   private String NumTelf;
	   @NotEmpty
	   private String motdepasse;
	   @NotEmpty
	   private String role;
	   @NotNull
	   @OneToMany(mappedBy="User")
	   private List<DemandeRessource> DemandeRess;
	   @NotNull
	   @ManyToMany(mappedBy = "Userr")
	   private List<Document> Doc;
	      
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNss() {
		return Nss;
	}
	public void setNss(String nss) {
		Nss = nss;
	}
	public String getOrganisme() {
		return Organisme;
	}
	public void setOrganisme(String organisme) {
		Organisme = organisme;
	}
	public String getNumTelf() {
		return NumTelf;
	}
	public void setNumTelf(String numTelf) {
		NumTelf = numTelf;
	}
	
	public List<DemandeRessource> getDemandeRess() {
		return DemandeRess;
	}
	public void setDemandeRess(List<DemandeRessource> demandeRess) {
		DemandeRess = demandeRess;
	}
	public List<Document> getDoc() {
		return Doc;
	}
	public void setDoc(List<Document> doc) {
		Doc = doc;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		motdepasse = motdepasse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Nss=" + Nss + ", email=" + email
				+ ", Organisme=" + Organisme + ", NumTelf=" + NumTelf + ", motdepasse=" + motdepasse + ", role=" + role
				+ ", DemandeRess=" + DemandeRess + ", Doc=" + Doc + "]";
	}
	
	   
	   
	   
	   
	   
	   
	   
	   

}
