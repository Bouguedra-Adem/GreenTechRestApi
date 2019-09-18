package App.Services;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.User.user;
import App.Model.lot1_5.DocNonIndex;
import App.Model.lot1_5.Document;
import App.Repo.lot1_5.DocumentRep;
import App.Repo.lot1_5.IndexRep;

@Service (value="DocumentService")
public class DocumentService {
	@Resource
	private DocumentRep DocRep;
	@Resource
	private IndexRep DocIndex;
	
	public List< Document> getAllDocument() {
		return this.DocRep.findAll();
	}
	public Document CreatDocument(Document Doc) {
		return this.DocRep.save(Doc);
	}
	public Document UpdateDocument(Document Doc) {
		return this.DocRep.save(Doc);
	}
	public void DeleteDocument(int id) {
		 this.DocRep.deleteById(id);
	}
	public Document getDocumentById(int id) {
		return this.DocRep.getOne(id);
	}
	public Document getDocumentByName(String name) {
		return this.DocRep.findBynameDocument(name);
	}
	public List<Document> getDocumentByTag(String name) {
		return this.DocRep.findByTag(name);
	}
	public  List<Document> getDocumentByCategorie(String name) {
		return this.DocRep.findByCategorie(name);
	}
	public List<DocNonIndex> getAllDocNonIndex(){
		return this.DocIndex.findAll();
	}
/**************************************************************************/	
	public List<DocNonIndex> getAllDocumentNonIndex() {
		return this.DocIndex.findAll();
	}
	public DocNonIndex CreatDocumentIndex(DocNonIndex Doc) {
		return this.DocIndex.save(Doc);
	}
	public DocNonIndex UpdateDocumentIndex(DocNonIndex Doc) {
		return this.DocIndex.save(Doc);
	}
	public void setIndex(int id, Document Doc) {
	    
		DocNonIndex doc =this.DocIndex.findByid(id);
		doc.setIndex(1);
		 this.DocIndex.save(doc);
		 this.DocRep.save(Doc);
		
   }
}
