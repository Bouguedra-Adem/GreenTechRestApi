package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.organismeRecherch;
import App.Repo.lot4.organismeRechercheRepo;

@RestController
public class organismeController {
	@Autowired
	organismeRechercheRepo organismrechrepo;
		
	/*
	 * 
	 * GET
	 */
	@RequestMapping(method=RequestMethod.GET,value="/organismes")
	public List<organismeRecherch> getAll(){
		List<organismeRecherch> orgrech = new ArrayList<>();
		organismrechrepo.findAll().forEach(orgrech::add);
		return orgrech;
	}
	
	 @RequestMapping(method=RequestMethod.GET,value="/organisme/{id}")
	    public organismeRecherch getById(@PathVariable Integer id) {
		 return organismrechrepo.findByid(id);
	    }
	    @RequestMapping(method=RequestMethod.GET,value="/organisme/name/{name}")
	    public List<organismeRecherch> getByName(@PathVariable String name) {
	    	return organismrechrepo.findByName(name);
	    }
	    /*
	     * 
	     * POST
	     */
	
   /* @RequestMapping(method=RequestMethod.POST,value="/postorganisme")
    public void  add(@RequestBody organismeRecherch organisme) {
    	organisserv.UpdateAdd(organisme);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateorganisme")
    public void update(@RequestBody organismeRecherch organime) {
    	organisserv.UpdateAdd(organime);
    }
    */
    /*
     * 
     * 
     * DELETE
     * 
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/organisme/{id}")
    public void deleteById(@PathVariable Integer id) {
    	organismrechrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/organisme/name/{name}")
    public void deleteByName(@PathVariable String name) {
    	organismrechrepo.deleteByName(name);
    }
   
   
}
