package App.Model.lot1_5;

import java.util.List;

import App.Model.Ressource;

public class Ged {
	
    private int nbDocument;
    private List <Document> Document;
   
	public Ged(int nbDocument, List<App.Model.lot1_5.Document> document) {
		super();
		this.nbDocument = nbDocument;
		Document = document;
		
	}
	public Ged() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNbDocument() {
		return nbDocument;
	}
	public void setNbDocument(int nbDocument) {
		this.nbDocument = nbDocument;
	}
	
	public List<Document> getDocument() {
		return Document;
	}
	public void setDocument(List<Document> document) {
		Document = document;
	}
	@Override
	public String toString() {
		return "Ged [nbDocument=" + nbDocument + ", Document=" + Document + "]";
	}
	
	
    
    
    
}
