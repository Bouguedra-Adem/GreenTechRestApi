package App.Model.User;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")

public class user {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   private String Nom;
	   private String Prenom;
	   private String Nss;
	   private String Organisme;
	   private String NumTelf;
	   @OneToMany(mappedBy="User")
	   private List<DemandeRessource> DemandeRess;
	   
	   
	   

}
