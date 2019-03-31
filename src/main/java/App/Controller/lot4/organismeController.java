package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.organismeRecherch;
import App.service.lot4.organismeRecherchService;

@RestController
public class organismeController {
	@Autowired
	organismeRecherchService organisserv;
	
	@RequestMapping("/organismes")
	public List<organismeRecherch> getAll(){
	return organisserv.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postorganisme")
    public void  add(@RequestBody organismeRecherch organisme) {
    	organisserv.UpdateAdd(organisme);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidorganisme/{id}")
    public void deleteById(@PathVariable Integer id) {
    	organisserv.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenameorganisme/{name}")
    public void deleteByName(@PathVariable String name) {
    	organisserv.deleteByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidorganisme/{id}")
    public organismeRecherch getById(@PathVariable Integer id) {
    	return organisserv.getById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnameorganisme/{name}")
    public organismeRecherch getByName(@PathVariable String name) {
    	return organisserv.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateorganisme")
    public void update(@RequestBody organismeRecherch organime) {
    	organisserv.UpdateAdd(organime);
    }
}
