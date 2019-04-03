package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.region;
import App.Repo.lot4.regionRepo;
@RestController
public class regionController {
	@Autowired
	regionRepo regiorepo;
	
	/*
	 * 
	 * 
	 * GET
	 */
	@RequestMapping("/regions")
	public List<region> getAll(){
		List<region> rGion = new ArrayList<>();
		regiorepo.findAll().forEach(rGion::add);
		return rGion;
	}
	@RequestMapping(method=RequestMethod.GET,value="/region/{id}")
    public region getById(@PathVariable Integer id) {
    	return regiorepo.findByid(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/region/name/{name}")
    public region getByName(@PathVariable String name) {
    return regiorepo.findByName(name);
    }
	/*
	 * 
	 * POST
	 */
    
    /*@RequestMapping(method=RequestMethod.POST,value="/postregion")
    public void  add(@RequestBody region reg) {
    	regionserv.UpdateAdd(reg);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateregion")
    public void update(@RequestBody region reg) {
    	regionserv.UpdateAdd(reg);
    }*/
    
    /*
     * 
     * DELETE
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/region/{id}")
    public void deleteById(@PathVariable Integer id) {
    	regiorepo.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/region/name/{name}")
    public void deleteByName(@PathVariable String name) {
    	regiorepo.deleteByName(name);
    } 
}
