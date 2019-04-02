package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.TypeResFort;
import App.service.lot4.TypeResService;

@RestController
public class typeResFortController {
	@Autowired
	TypeResService typeServ;
	
	@RequestMapping("/type")
	public List<TypeResFort> getAllres(){
	return typeServ.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/posttype")
    public void  addClasse(@RequestBody TypeResFort type) {
    	typeServ.UpdateAddType(type);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidtype/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    typeServ.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenametype/{name}")
    public void deleteResByName(@PathVariable String name) {
    	typeServ.deleteTypeByName(name);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findidtype/{id}")
    public TypeResFort getResById(@PathVariable Integer id) {
    	return typeServ.getById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/findnametype/{name}")
    public TypeResFort getResByName(@PathVariable String name) {
    	return typeServ.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updatetype")
    public void updateRes(@RequestBody TypeResFort type) {
    	typeServ.UpdateAddType(type);
    }
}
