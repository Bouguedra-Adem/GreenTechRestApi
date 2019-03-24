package App.Model;
import App.Model.lot1_5.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Utilisateur")
public class User {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column( name = "id", updatable = false, nullable = false)
	private int id ;
	@NotNull
	@Column( name="name")
	private String name ;
	@NotNull
	@Column( name="username")
	private String username;
	@NotNull
	@Column( name="age")
	private int age;
	@NotNull
	@Column( name="job")
	private String job;
	@NotNull
	@Column( name="organisme")
	private String organisme;
	
	
	
	@OneToMany (mappedBy="demandeur",cascade=CascadeType.ALL)
	 private List<DemandePermis> demande;
   
	public User(int id, String name, String username, int age, String job, String organisme,
			List<DemandePermis> demande) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.age = age;
		this.job = job;
		this.organisme = organisme;
		this.demande = demande;
	}

	public User() {
		
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public List<DemandePermis> getDemande() {
		return demande;
	}

	public void setDemande(List<DemandePermis> demande) {
		this.demande = demande;
	}
	

}
