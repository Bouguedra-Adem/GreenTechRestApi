package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.RessourceForestiereMedionale;
import App.Repo.lot4.ResFortMdiRepo;
@RestController
public class ResFortMedController {
	
	@Autowired
	ResFortMdiRepo resRepo;
	
	/*
	 * 
	 * GET
	 * 
	 */
	
	@RequestMapping(method=RequestMethod.GET,value="/ressourceFortMeds")
	public List<RessourceForestiereMedionale> getAllres(){
		List<RessourceForestiereMedionale> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	  
    @RequestMapping(method=RequestMethod.GET,value="/ressourceFortMed/{id}")
    public RessourceForestiereMedionale getResById(@PathVariable Integer id) {
    	return resRepo.findByid(id);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/ressourceFortMed/name/{name}")
    public RessourceForestiereMedionale getResByName(@PathVariable String name) {
    	return resRepo.findByName(name);
    }
    
	/*
	 * 
	 * POST
	 * 
	 */
    
    @RequestMapping(method=RequestMethod.POST,value="/ressourceFortMed")
    public void  addClasse(@RequestBody RessourceForestiereMedionale ressource) {
    	resRepo.save(ressource);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/ressourceFortMed/update")
    public void updateRes(@RequestBody RessourceForestiereMedionale ressource) {
    	resRepo.save(ressource);
    }
    
    /*
     * 
     * DELETE
     * 
     */
    
    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceFortMed/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	resRepo.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceFortMed/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	resRepo.deleteByName(name);
    }
}