package App.Controller.lot2Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import App.Model.lot2.APA;
import App.Repo.lot2.APARep;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApaController {
	
	@Autowired
	@Resource
	private App.Services.ApaService ApaService;
	
	
	@GetMapping("/Apa") 
	public List<APA> getAllDocuemnt(){
		return ApaService.getAllAPA();
	
	}
	@PostMapping(value = "/SaveApa")
    public boolean AddDocument(@RequestBody APA apa) {
        APA AapaAdd=  this.ApaService.CreatAPA(apa);
        if (AapaAdd == null)
            return false;
        else
        	return true;
    }
	@DeleteMapping("/Apa/{id}")
	public ResponseEntity<String> DeleteDocument(@PathVariable("id") int id) {
		System.out.println("Suppression de l'article qui a l'ID = " + id + "...");
		this.ApaService.DeleteAPA(id);
		return new ResponseEntity<>("Document supprimé avec succés!", HttpStatus.OK);
	}

	@PutMapping("/Apa/{id}")
	  public ResponseEntity<APA> UpdateDocument(@PathVariable("id") int id, @RequestBody APA apa) {
	    System.out.println("Modification du document qui a l'ID = " + id + "...");
	 
	    Optional<APA> apaDATA = this.ApaService.findAPAById(id);
	 
	    if (apaDATA.isPresent()) {
	      APA _apa = apaDATA.get();
	      _apa.setNameAPA(apa.getNameAPA());
	      _apa.setDescriptionAPA(apa.getDescriptionAPA());
	      _apa.setTypeAPA(apa.getTypeAPA());
	      _apa.setCategorieAPA(apa.getCategorieAPA());
	      _apa.setDateMaj(apa.getDateMaj());
	      _apa.setTagAPA(apa.getTagAPA());
	      
	      return new ResponseEntity<>(this.ApaService.saveAPA(_apa), HttpStatus.OK );
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	

}
