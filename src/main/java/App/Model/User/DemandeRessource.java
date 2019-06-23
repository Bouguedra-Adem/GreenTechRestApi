package App.Model.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DemandeRessource")
public class DemandeRessource {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id  ;
	    @ManyToOne
	    private App.Model.User.user User;
	    private int valide; /*0 =non envoyé,1 =envoyé mais n'est pas validé,2=envoyé et validé*/
	    private int  RessourceId;
	    private String date;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public App.Model.User.user getUser() {
			return User;
		}
		public void setUser(App.Model.User.user user) {
			User = user;
		}
		public int getValide() {
			return valide;
		}
		public void setValide(int valide) {
			this.valide = valide;
		}
		public int getRessourceId() {
			return RessourceId;
		}
		public void setRessourceId(int ressourceId) {
			RessourceId = ressourceId;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
	    
	   

}
