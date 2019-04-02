package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.groupe;
import App.Services.lot4.groupeService;

@RestController
public class groupeController {
	@Autowired
	groupeService groupeserv;
	
	@RequestMapping("/groupes")
	public List<groupe> getAll(){
	return groupeserv.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postgroupe")
    public void  add(@RequestBody groupe gr) {
    	groupeserv.UpdateAdd(gr);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidgroupe/{id}")
    public void deleteById(@PathVariable Integer id) {
    	groupeserv.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenamegroupe/{name}")
    public void deleteByName(@PathVariable String name) {
    	groupeserv.deleteByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidgroupe/{id}")
    public groupe getById(@PathVariable Integer id) {
    	return groupeserv.getById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnamegroupe/{name}")
    public groupe getByName(@PathVariable String name) {
    	return groupeserv.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updategroupe")
    public void update(@RequestBody groupe gr) {
    	groupeserv.UpdateAdd(gr);
    }
}
