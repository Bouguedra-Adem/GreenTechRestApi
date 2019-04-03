package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.RessourceForrestiereAromatique;
import App.Model.lot4.RessourceMarine;
import App.Repo.lot4.ResFortAromRepo;
import App.Repo.lot4.TypeResRep;
import App.exception.NotFoundException;


@RestController
public class ResFortAroController {
	@Autowired
	ResFortAromRepo  resRepo;
	TypeResRep typerepo;

	/*
	 * 
	 * GET
	 */
	@RequestMapping(method=RequestMethod.GET,value="/ressourceArmpatiques")
	public List<RessourceForrestiereAromatique> getAllres(){
		List<RessourceForrestiereAromatique> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/ressourceArmpatique/{id}")
    public RessourceForrestiereAromatique getResById(@PathVariable Integer id) {
	return resRepo.findByid(id);
	}
	    
    @RequestMapping(method=RequestMethod.GET,value="/ressourceArmpatique/name/{name}")
	public List<RessourceForrestiereAromatique> getResByName(@PathVariable String name) {
	return resRepo.findByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/type/{typeid}/ressourceAromatique")
    public List<RessourceForrestiereAromatique> getAllRessourceByTypeId( @PathVariable Integer typeid){
		List<RessourceForrestiereAromatique> ress = new ArrayList<>();
		resRepo.findByTypeId(typeid).forEach(ress::add);
		return ress;
	}
	
	/*
	 * 
	 * 
	 * POST
	 */
	
    @RequestMapping(method=RequestMethod.POST,value="/type/{typeid}/ressourceAromatique")
    public RessourceForrestiereAromatique  addRessource(@PathVariable Integer typeid,
    		@Valid @RequestBody RessourceForrestiereAromatique ressource) {
        	 return typerepo.findById(typeid).map(type ->{
        		 ressource.setType(type);
         		return resRepo.save(ressource);
         	}).orElseThrow(() ->new NotFoundException("type not fount"));
        }
        
      
    
    @RequestMapping(method=RequestMethod.PUT,value="/type/{typeid}/ressource/{ressourceid}")
    public RessourceForrestiereAromatique updateRessource(@PathVariable Integer typeid,
 			@PathVariable Integer ressourceid,
 			@Valid @RequestBody RessourceForrestiereAromatique ressourceUpdate) {
 	   if(!typerepo.existsById(typeid)) {
    		throw new NotFoundException("type not found!");
    	}
    	
        return resRepo.findById(ressourceid)
                .map(res -> {
             	  res.setDescription(ressourceUpdate.getDescription());
             	  res.setDegreConfidentialite(ressourceUpdate.getDegreConfidentialite());
             	  res.setImageURL(ressourceUpdate.getImageURL());
             	  res.setName(ressourceUpdate.getName());
             	  res.setProduitDerive(ressourceUpdate.getProduitDerive());
             	  return resRepo.save(res);
                }).orElseThrow(() -> new NotFoundException("Assignment not found!"));
      }
    

    /*
     * 
     * DELETE
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceArmpatique/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    resRepo.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceArmpatique/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resRepo.deleteByName(name);
    } 
}
