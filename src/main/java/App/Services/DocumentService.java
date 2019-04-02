package App.Services;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.lot1_5.Document;
import App.Repo.lot1_5.DocumentRep;

@Service (value="DocumentService")
public class DocumentService {
	@Resource
	private DocumentRep DocRep;
	
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
}
