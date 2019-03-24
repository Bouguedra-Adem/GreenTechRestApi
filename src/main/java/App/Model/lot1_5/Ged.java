package App.Model.lot1_5;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Ged")
public class Ged {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column( name="nbDocument")
	private int nbDocuemnt=0;
	
	@OneToMany(targetEntity=Document.class, mappedBy="Ged", fetch=FetchType.EAGER)
	private List <Document> Document;
	
	
	public Ged() {}
	

	public Ged(long id, int nbDocuemnt, List<App.Model.lot1_5.Document> document) {
		super();
		this.id = id;
		this.nbDocuemnt = nbDocuemnt;
		Document = document;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNbDocuemnt() {
		return nbDocuemnt;
	}

	public void setNbDocuemnt(int nbDocuemnt) {
		this.nbDocuemnt = nbDocuemnt;
	}

	public List<Document> getDocument() {
		return Document;
	}

	public void setDocument(List<Document> document) {
		Document = document;
	}

	

	
}
