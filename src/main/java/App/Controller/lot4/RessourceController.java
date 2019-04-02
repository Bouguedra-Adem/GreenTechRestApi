package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.RessourceMarine;
import App.Services.lot4.RessourceMarineService;

@RestController
public class RessourceController {
	@Autowired
	RessourceMarineService resSevMarine;
	
	@RequestMapping("/ressource")
	public List<RessourceMarine> getAllRessource(String ressource){
	return resSevMarine.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/post")
    public void  addRessource(@RequestBody RessourceMarine ressource) {
      	resSevMarine.UpdateAddRessource(ressource);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteid/{id}")
    public void deleteResById(@PathVariable Integer id) {
    	resSevMarine.deleteRessource(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletename/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resSevMarine.deleteRessourceByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findid/{id}")
    public RessourceMarine getResById(@PathVariable Integer id) {
    	return resSevMarine.getRessourceById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findname/{name}")
    public RessourceMarine getResByName(@PathVariable String name) {
    	return resSevMarine.getRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/update")
    public void updateRes(@RequestBody RessourceMarine ressource) {
    	resSevMarine.UpdateAddRessource(ressource);
    }
}
