package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.groupe;
import App.Repo.lot4.groupeRepo;
@RestController
public class groupeController {
	@Autowired
	groupeRepo grouperepo;
	/*
	 * 
	 * GET
	 * 
	 */
	@RequestMapping("/groupes")
	public List<groupe> getAll(){
		List<groupe> clsemb = new ArrayList<>();
		grouperepo.findAll().forEach(clsemb::add);
		return clsemb;
	}
	 @RequestMapping(method=RequestMethod.GET,value="/groupe/{id}")
	 public groupe getById(@PathVariable Integer id) {
	    	return grouperepo.findByid(id);
	}
    @RequestMapping(method=RequestMethod.GET,value="/groupe/name/{name}")
	public List<groupe> getByName(@PathVariable String name) {
	return grouperepo.findByName(name);
	}  
	    
	    /*
	     * 
	     * POST
	     * 
	     */
  /*  @RequestMapping(method=RequestMethod.POST,value="/postgroupe")
    public void  add(@RequestBody groupe gr) {
    	groupeserv.UpdateAdd(gr);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updategroupe")
    public void update(@RequestBody groupe gr) {
    	groupeserv.UpdateAdd(gr);
    }*/
    /*
     * 
     * DELETE
     */
    
    @RequestMapping(method=RequestMethod.DELETE,value="/groupe/{id}")
    public void deleteById(@PathVariable Integer id) {
    	grouperepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/groupe/name/{name}")
    public void deleteByName(@PathVariable String name) {
    	grouperepo.deleteByName(name);
    }
}
