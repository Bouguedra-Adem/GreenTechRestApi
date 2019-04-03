package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.ressourceAliAgr;
import App.Services.lot4.ressourceAliAgrService;

@RestController
public class resAliAgrController {
	@Autowired
	ressourceAliAgrService resArgAliservice;
	
	@RequestMapping("/ressourcalim")
	public List<ressourceAliAgr> getAllRessource(String ressource){
	return resArgAliservice.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postresalim")
    public void  addRessource(@RequestBody ressourceAliAgr ressource) {
      	resArgAliservice.UpdateAddRessource(ressource);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidresalim/{id}")
    public void deleteResById(@PathVariable Integer id) {
    	resArgAliservice.deleteRessource(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenameresalim/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resArgAliservice.deleteRessourceByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidresalim/{id}")
    public ressourceAliAgr getResById(@PathVariable Integer id) {
    	return resArgAliservice.getRessourceById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnameresalim/{name}")
    public ressourceAliAgr getResByName(@PathVariable String name) {
    	return resArgAliservice.getRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateresalim")
    public void updateRes(@RequestBody ressourceAliAgr ressource) {
    	resArgAliservice.UpdateAddRessource(ressource);
    }
}
