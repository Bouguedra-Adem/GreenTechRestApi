package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.ClasseEmb;
import App.service.lot4.ClasseService;

@RestController
public class ClasseController {

	@Autowired
	ClasseService classServ;
	
	@RequestMapping("/class")
	public List<ClasseEmb> getAllClasses(){
	return classServ.getAll();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postclass")
    public void  addClasse(@RequestBody ClasseEmb classemb) {
    	classServ.UpdateAddClass(classemb);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidclass/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	classServ.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenameclass/{name}")
    public void deleteResByName(@PathVariable String name) {
    	classServ.deleteClassByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidclass/{id}")
    public ClasseEmb getResById(@PathVariable Integer id) {
    	return classServ.getById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnameclass/{name}")
    public ClasseEmb getResByName(@PathVariable String name) {
    	return classServ.getByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateclass")
    public void updateRes(@RequestBody ClasseEmb classemb) {
    	classServ.UpdateAddClass(classemb);
    }
}
