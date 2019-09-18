package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.Ressource;
import App.Model.User.user;
import App.Model.lot4.RessourceMarine;
import App.Repo.lot4.EmbranchementRepo;
import App.Repo.lot4.RessourceMarinRepo;
import App.Services.RessourceService;
import App.exception.NotFoundException;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RessourceController {
	@Autowired
	@Resource
	RessourceService resService;

	@GetMapping("/AllResource")
	public List<Ressource> AllUser() {
		return this.resService.getAllRessource();
	}
	@PostMapping(value="/Ressource")
	public  void addRessource ( @RequestBody Ressource res) {
		  System.out.println(res.toString());
		  this.resService.saveRessource(res);
		 
		}
		
	 @DeleteMapping ("/Ressource/{idRessource}")
	  public void  DelteRessource (@PathVariable int idRessource) {
		 System.out.println(idRessource);
   	    this.resService.DeleteRessource(idRessource);
		
	}
	 @PutMapping ("/Ressource/occupe")
	 public void setRessourceOcup(int id,int occupe) {
		    
		 Ressource res=this.resService.findById(id);
		 res.setRessource_occcupe(occupe);
		 this.resService.saveRessource(res);
		
   }
	/*
	 * GET
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
/*	@RequestMapping(method=RequestMethod.GET,value="/ressourceMarines")
	public List<RessourceMarine> getAllRessource(String ressource){
		List<RessourceMarine> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/ressourceMarine/{id}")
    public RessourceMarine getResById(@PathVariable Integer id) {
    return resRepo.findByid(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/ressourceMarine/name/{name}")
    public List<RessourceMarine> getResByName(@PathVariable String name) {
    return resRepo.findByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/embranchement/{embranchementid}/ressourceMarines")
	public List<RessourceMarine> getAllRessourceByEmbranchementId( @PathVariable Integer embranchementid){
		List<RessourceMarine> ress = new ArrayList<>();
		resRepo.findByEmbranchementId(embranchementid).forEach(ress::add);
		return ress;
	}
	/*
	 * 
	 * POST
	 * 
	
    @RequestMapping(method=RequestMethod.POST,value="/embranchement/{embranchementid}/ressourceMarines")
    public RessourceMarine  addRessource(@PathVariable Integer embranchementid,@Valid @RequestBody RessourceMarine ress) {
       return emrepo.findById(embranchementid).map(emb ->{
    	   ress.setEmbranchement(emb);
    		return resRepo.save(ress);
    	}).orElseThrow(() ->new NotFoundException("Embranchement not fount"));
    }
  */
   /* @RequestMapping(method=RequestMethod.PUT,value="/embranchement/{embranchementid}/ressourceMarine/{ressourceMarineid}")
    public RessourceMarine updateRessourceMarine(@PathVariable Integer embranchementid,
 			@PathVariable Integer ressourceMarineid,
 			@Valid @RequestBody RessourceMarine ressourceMarineUpdate) {
 	   if(!emrepo.existsById(embranchementid)) {
    		throw new NotFoundException("Embranchement not found!");
    	}
    	
        return resRepo.findById(ressourceMarineid)
                .map(ressm -> {
                ressm.setDegreConfidentialite(ressourceMarineUpdate.getDegreConfidentialite());
             	ressm.setDescription(ressourceMarineUpdate.getDescription());
                ressm.setImageURL(ressourceMarineUpdate.getImageURL());
                ressm.setName(ressourceMarineUpdate.getName());
                ressm.setValidite(ressourceMarineUpdate.isValidite());
                return resRepo.save(ressm);
                }).orElseThrow(() -> new NotFoundException("Assignment not found!"));
      }
   
    /*
     * 
     * DELETE
     * 
  /*   */
  /*  @RequestMapping(method=RequestMethod.DELETE,value="ressourceMarine/{id}")
    public void deleteResById(@PathVariable Integer id) {
    	resRepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceMarine/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resRepo.deleteByName(name);
    }*/
}