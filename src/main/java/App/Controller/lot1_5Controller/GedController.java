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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import App.Model.Ressource;
import App.Model.User.user;
import App.Model.lot1_5.DocNonIndex;
import App.Model.lot1_5.Document;
import App.Model.lot1_5.Ged;
import App.Repo.lot1_5.DocumentRep;
import App.Services.DocumentService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GedController implements Serializer<Ged> {
	
	@Autowired
	@Resource
	private DocumentService DocService;
	
	
	
	@GetMapping ("/Ged")
	public Ged returnAllGed() {
		Ged ged=new Ged();
		
		ged.setDocument(returnAllDocument());
		ged.setNbDocument(returnAllDocument().size());
		return ged;
	}
	@GetMapping ("/Doc")
	public List<Document> returnAllDocument(){
		List <Document> Doc=this.DocService.getAllDocument();
		
	            
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
	
     @DeleteMapping(value = "/Doc/{id}")
     public void DeleteDoc(@PathVariable int id ) {
    	 this.DocService.DeleteDocument(id);
     }
     
 	@PutMapping("/DocIndex/{Idindex}")
 	public void ValideIndex(@PathVariable int Idindex,@RequestBody Document doc) {
 		System.out.println(doc);
 		System.out.println(Idindex);
 		this.DocService.setIndex(Idindex,doc);
 	}
 	@PostMapping(value="/DocIndex/create")
	public  void addIndex ( @RequestBody DocNonIndex Doc) {
		  this.DocService.CreatDocumentIndex(Doc);
	}
 	@GetMapping ("/DocIndex")
	public List<DocNonIndex> returnAllDocumentIndex(){
		List <DocNonIndex> Doc=this.DocService.getAllDocumentNonIndex();
			            
		return Doc;
	}

	@Override
	public void serialize(Ged object, OutputStream outputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
