package App.Model.lot1_5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="Index")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class DocNonIndex {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   @Column(name="nameDocument")  
	    private String nameDocument="";
	   @Column(name="index")  
	    private int  index;
	public DocNonIndex() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocNonIndex(int id, String nameDocument, int index) {
		super();
		this.id = id;
		this.nameDocument = nameDocument;
		this.index = index;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameDocument() {
		return nameDocument;
	}
	public void setNameDocument(String nameDocument) {
		this.nameDocument = nameDocument;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	  

}
