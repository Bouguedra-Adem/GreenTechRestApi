package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.RessourceForestiereMedionale;
import App.service.lot4.ResFortMdiService;

@RestController
public class ResFortMedController {

	@Autowired
	ResFortMdiService resServ;
	
	@RequestMapping("/resfm")
	public List<RessourceForestiereMedionale> getAllres(){
	return resServ.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postresfm")
    public void  addClasse(@RequestBody RessourceForestiereMedionale ressource) {
    	resServ.UpdateAddRessource(ressource);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidresfm/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    resServ.deleteRessource(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenamereafm/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resServ.deleteRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findidresfm/{id}")
    public RessourceForestiereMedionale getResById(@PathVariable Integer id) {
    	return resServ.getRessourceById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findnameresfm/{name}")
    public RessourceForestiereMedionale getResByName(@PathVariable String name) {
    	return resServ.getRessourceByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateresfm")
    public void updateRes(@RequestBody RessourceForestiereMedionale ressource) {
    	resServ.UpdateAddRessource(ressource);
    }
}
