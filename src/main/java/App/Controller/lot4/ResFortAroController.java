package App.Controller.lot4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.RessourceForrestiereAromatique;
import App.Services.lot4.ResFortAromService;

@RestController
public class ResFortAroController {

	@Autowired
	ResFortAromService resServ;
	
	@RequestMapping("/resfa")
	public List<RessourceForrestiereAromatique> getAllres(){
	return resServ.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postresfa")
    public void  addClasse(@RequestBody RessourceForrestiereAromatique ressource) {
    	resServ.UpdateAddRessource(ressource);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidresfa/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    resServ.deleteRessource(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenamereafa/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resServ.deleteRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findidresfa/{id}")
    public RessourceForrestiereAromatique getResById(@PathVariable Integer id) {
    	return resServ.getRessourceById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findnameresfa/{name}")
    public RessourceForrestiereAromatique getResByName(@PathVariable String name) {
    	return resServ.getRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateresfa")
    public void updateRes(@RequestBody RessourceForrestiereAromatique ressource) {
    	resServ.UpdateAddRessource(ressource);
    }
}
