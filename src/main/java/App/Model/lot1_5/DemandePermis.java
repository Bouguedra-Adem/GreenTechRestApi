package App.Model.lot1_5;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import App.Model.User;

@Entity
@Table(name="DemandePermis")
public class DemandePermis {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private long id;
	   private String Etude;
	   @ManyToOne
	   @JoinColumn(name = "User_ID")
	   private User demandeur ;
	public DemandePermis(long id, String etude, User demandeur) {
		super();
		this.id = id;
		Etude = etude;
		this.demandeur = demandeur;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEtude() {
		return Etude;
	}
	public void setEtude(String etude) {
		Etude = etude;
	}
	public User getDemandeur() {
		return demandeur;
	}
	public void setDemandeur(User demandeur) {
		this.demandeur = demandeur;
	}
	   
	
	   
	
    
}
