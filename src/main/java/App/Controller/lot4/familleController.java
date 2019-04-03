package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import App.Model.lot4.famille;
import App.Repo.lot4.familleRepo;

@RestController
public class familleController {
	@Autowired
	familleRepo famillerepo;
	/*
	 * 
	 * 
	 * GET
	 */
	@RequestMapping(method=RequestMethod.GET,value="/familles")
	public List<famille> getAll(){
		List<famille> clsemb = new ArrayList<>();
		famillerepo.findAll().forEach(clsemb::add);
        return clsemb;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/famille/{id}")
	public famille getById(@PathVariable Integer id) {
	return famillerepo.findByid(id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/famille/name/{name}")
	public List<famille> getByName(@PathVariable String name) {
	 return famillerepo.findByName(name);
	}
	/*
	 * 
	 * POST
	 */
	    
   /* @RequestMapping(method=RequestMethod.POST,value="/postfamille")
    public void  add(@RequestBody famille fami) {
    	familleserv.UpdateAdd(fami);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updatefamille")
    public void update(@RequestBody famille fami) {
    	familleserv.UpdateAdd(fami);
    }*/
    /*
     * 
     * DELETE
     * 
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/famille/{id}")
    public void deleteById(@PathVariable Integer id) {
    	famillerepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/famille/name/{name}")
    public void deleteByName(@PathVariable String name) {
    	famillerepo.deleteByName(name);
    }
 
    
   
}
