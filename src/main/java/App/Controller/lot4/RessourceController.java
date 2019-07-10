package App.Controller.lot4;

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

import App.Model.lot4.RESSOURCE;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RessourceController {
	
	@Autowired
	@Resource
	private App.Services.lot4.RessourceService RessourceService;
	
	
	@GetMapping("/Ressources") 
	public List<RESSOURCE> getAllRessources(){
		return RessourceService.getAllRESSOURCES();
	
	}
	@PostMapping(value = "/SaveRessource")
    public boolean AddRessource(@RequestBody RESSOURCE ressource) {
        RESSOURCE Add=  this.RessourceService.CreatRESSOURCE(ressource);
        if (Add == null)
            return false;
        else
        	return true;
    }
	@DeleteMapping("/Ressource/{id}")
	public ResponseEntity<String> DeleteRessource(@PathVariable("id") int id) {
		System.out.println("Suppression de la ressource qui a l'ID = " + id + "...");
		this.RessourceService.DeleteRESSOURCE(id);
		return new ResponseEntity<>("Ressource supprimée avec succés!", HttpStatus.OK);
	}

	@PutMapping("/Ressource/{id}")
	  public ResponseEntity<RESSOURCE> UpdateRessource(@PathVariable("id") int id, @RequestBody RESSOURCE ressource) {
	    System.out.println("Modification du document qui a l'ID = " + id + "...");
	 
	    Optional<RESSOURCE> ressourceDATA = this.RessourceService.findRESSOURCEById(id);
	 
	    if (ressourceDATA.isPresent()) {
	      RESSOURCE _ressource = ressourceDATA.get();
	      _ressource.setNameRESSOURCE(ressource.getNameRESSOURCE());
	      _ressource.setDescriptionRESSOURCE(ressource.getDescriptionRESSOURCE());
	      _ressource.setTypeRESSOURCE(ressource.getTypeRESSOURCE());
	      _ressource.setCategorieRESSOURCE(ressource.getCategorieRESSOURCE());
	      _ressource.setDateMaj(ressource.getDateMaj());
	      _ressource.setTagRESSOURCE(ressource.getTagRESSOURCE());
	      
	      return new ResponseEntity<>(this.RessourceService.saveRESSOURCE(_ressource), HttpStatus.OK );
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	

}
