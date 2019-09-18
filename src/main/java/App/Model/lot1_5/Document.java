package App.Model.lot1_5;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import App.Model.User.user;

@Entity
@Table(name="Document")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Document {
	@Id 
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   @Column(name="nameDocument")  
	    private String nameDocument="";
	   @Column(name="bref_Description")  
	    private String bref_description="";
	   @Column(name="date_publication")
	    private String date_publication;
	   @Column (name="dateMsj")
	   private String  dateMsj;
	   @Column (name="type")
	    private String type="";
	   @Column (name="categorie")
	    private String categorie="";
	   private 	String tag;
	   private 	String lienAssetes;
	   @ManyToMany(
	            fetch = FetchType.LAZY,
	            cascade = {CascadeType.MERGE, CascadeType.PERSIST}, 
	            mappedBy = "doc"
	    )
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	   private List<user> Userr;
	   
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Document(int id, String nameDocument, String bref_description, String date_publication, String dateMsj,
			String type, String categorie, String tag, String lienAssetes) {
		super();
		this.id = id;
		this.nameDocument = nameDocument;
		this.bref_description = bref_description;
		this.date_publication = date_publication;
		this.dateMsj = dateMsj;
		this.type = type;
		this.categorie = categorie;
		this.tag = tag;
		this.lienAssetes = lienAssetes;
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

	public String getBref_description() {
		return bref_description;
	}

	public void setBref_description(String bref_description) {
		this.bref_description = bref_description;
	}

	public String getDate_publication() {
		return date_publication;
	}

	public void setDate_publication(String date_publication) {
		this.date_publication = date_publication;
	}

	public String getDateMsj() {
		return dateMsj;
	}

	public void setDateMsj(String dateMsj) {
		this.dateMsj = dateMsj;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
    
	public String getLienAssetes() {
		return lienAssetes;
	}



	public void setLienAssetes(String lienAssetes) {
		this.lienAssetes = lienAssetes;
	}



	public List<user> getUser() {
		return Userr;
	}



	public void setUser(List<user> user) {
		Userr = user;
	}



	@Override
	public String toString() {
		return "Document [id=" + id + ", nameDocument=" + nameDocument + ", bref_description=" + bref_description
				+ ", date_publication=" + date_publication + ", dateMsj=" + dateMsj + ", type=" + type + ", categorie="
				+ categorie + ", tag=" + tag + ", lienAssetes=" + lienAssetes + "]";
	}
   
	
} 
