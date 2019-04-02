package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.region;
import App.Services.lot4.regionService;

@RestController
public class regionController {
	@Autowired
	regionService regionserv;
	
	@RequestMapping("/regions")
	public List<region> getAll(){
	return regionserv.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postregion")
    public void  add(@RequestBody region reg) {
    	regionserv.UpdateAdd(reg);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidregion/{id}")
    public void deleteById(@PathVariable Integer id) {
    	regionserv.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenameregion/{name}")
    public void deleteByName(@PathVariable String name) {
    	regionserv.deleteByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidregion/{id}")
    public region getById(@PathVariable Integer id) {
    	return regionserv.getById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnameregion/{name}")
    public region getByName(@PathVariable String name) {
    	return regionserv.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateregion")
    public void update(@RequestBody region reg) {
    	regionserv.UpdateAdd(reg);
    }
}
