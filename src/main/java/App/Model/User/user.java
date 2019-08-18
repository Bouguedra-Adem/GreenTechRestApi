package App.Model.User;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import App.Model.lot1_5.Document;

@Entity

@Table(name="Compte")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class user {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	  
	   private String nom;
	
	   private String prenom;
	  
	   private String nss;
	
	   private String email;
	   
	   private String organisme;
	
	   private String numTelf;
	   
	   private String pass;
	   
	   private String role;
	   private int valide ;
	  
	   public int getValide() {
		return valide;
	}

	public void setValide(int valide) {
		this.valide = valide;
	}

	@OneToMany(mappedBy="User")
	   private List<DemandeRessource> demandeRess;
	   
	   @ManyToMany(
	            fetch = FetchType.LAZY,
	            cascade = {CascadeType.MERGE, CascadeType.PERSIST}
	    )
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	   
	   private List<Document> doc;
	      
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
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public String getNumTelf() {
		return numTelf;
	}

	public void setNumTelf(String numTelf) {
		this.numTelf = numTelf;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<DemandeRessource> getDemandeRess() {
		return demandeRess;
	}

	public void setDemandeRess(List<DemandeRessource> demandeRess) {
		this.demandeRess = demandeRess;
	}

	public List<Document> getDoc() {
		return doc;
	}

	public void setDoc(List<Document> doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nss=" + nss + ", email=" + email
				+ ", organisme=" + organisme + ", numTelf=" + numTelf + ", pass=" + pass + ", role=" + role
				+ ", demandeRess=" + demandeRess + ", doc=" + doc + "]";
	}

	
	   
	   
	   
	   
	   
	   
	   

}
