package App.Controller.lot1_5Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.serializer.Serializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import App.Model.Ressource;
import App.Model.lot1_5.Document;
import App.Model.lot1_5.Ged;
import App.Repo.lot1_5.DocumentRep;
import App.Services.DocumentService;


@RestController
public class GedController implements Serializer<Ged> {
	
	@Autowired
	@Resource
	private DocumentService DocService;
	
	
	@GetMapping ("/Ged")
	public Ged returnAllGed() {
		Ged ged=new Ged();
		System.out.println(returnAllDocument().toString());
		ged.setDocument(returnAllDocument());
		ged.setNbDocument(returnAllDocument().size());
		return ged;
	}
	@GetMapping ("/Doc")
	public List<Document> returnAllDocument(){
		List <Document> Doc=this.DocService.getAllDocument();
		 for(Iterator<Document> it=Doc.iterator(); it.hasNext();) 
	            System.out.println(it.next().toString()); 
		return Doc;
	}
	@GetMapping ("/Doc/{id}")
	public Document  FindDocumentById(@PathVariable int id){
		return DocService.getDocumentById(id);
	}

	 @PostMapping(value = "/Doc")
	    public ResponseEntity<Void> AddDocument(@RequestBody Document doc) {
	        Document DocAdd=  DocService.CreatDocument(doc);
	        if (DocAdd == null)
	            return ResponseEntity.noContent().build();

	        URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("/{id}")
	                .buildAndExpand(DocAdd.getId())
	                .toUri();
	        return ResponseEntity.created(location).build();
	    }
	


	@Override
	public void serialize(Ged object, OutputStream outputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
