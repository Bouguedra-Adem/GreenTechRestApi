package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import App.Model.lot4.famille;
import App.service.lot4.familleService;

@RestController
public class familleController {
	@Autowired
	familleService familleserv;
	
	@RequestMapping("/familles")
	public List<famille> getAll(){
	return familleserv.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postfamille")
    public void  add(@RequestBody famille fami) {
    	familleserv.UpdateAdd(fami);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidfamille/{id}")
    public void deleteById(@PathVariable Integer id) {
    	familleserv.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenamefamille/{name}")
    public void deleteByName(@PathVariable String name) {
    	familleserv.deleteByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidfamille/{id}")
    public famille getById(@PathVariable Integer id) {
    	return familleserv.getById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnamefamille/{name}")
    public famille getByName(@PathVariable String name) {
    	return familleserv.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updatefamille")
    public void update(@RequestBody famille fami) {
    	familleserv.UpdateAdd(fami);
    }
}
