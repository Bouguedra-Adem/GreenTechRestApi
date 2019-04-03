package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.Type;
import App.Repo.lot4.TypeResRep;


@RestController
public class typeResFortController {
	@Autowired
	TypeResRep  typerep;
	/*
	 * 
	 * GET
	 */
	@RequestMapping("/types")
	public List<Type> getAllres(){
		List<Type> typeres = new ArrayList<>();
		typerep.findAll().forEach(typeres::add);
		return typeres;
	}
	
	  @RequestMapping(method=RequestMethod.GET,value="/type/{id}")
	    public Type getResById(@PathVariable Integer id) {
	    	return typerep.findByid(id);
	    }
	    
	    @RequestMapping(method=RequestMethod.GET,value="/type/name/{name}")
	    public List<Type> getResByName(@PathVariable String name) {
	    	return typerep.findByName(name);
	    }
	/*
	 * 
	 * POST
	 */
   @RequestMapping(method=RequestMethod.POST,value="/types")
   public void addtypes(@RequestBody Iterable<Type> types) {
	   typerep.saveAll(types);
	    }
   
    @RequestMapping(method=RequestMethod.POST,value="/type")
    public void  addClasse(@RequestBody Type type) {
    	typerep.save(type);
    }
    

    @RequestMapping(method=RequestMethod.PUT,value="/type/update")
    public void updateRes(@RequestBody Type type) {
    	typerep.save(type);
    }
    /*
     * 
     * DELETE
     * 
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/type/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    typerep.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/type/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	typerep.deleteByName(name);;
    }
    
  
    
}
/*
	@Autowired
	TypeResRep typerep;
	public List<TypeResFort> getAll(){
		List<TypeResFort> typeres = new ArrayList<>();
		typerep.findAll().forEach(typeres::add);
		return typeres;
	}
	
	public TypeResFort getById(Integer id) {
		return typerep.findByid(id);
	}
	
	public TypeResFort getByName(String name) {
		return typerep.findByName(name);
	}
	
	public void UpdateAddType(TypeResFort typeres) {
		typerep.save(typeres);
	}
	
	public void deleteType(TypeResFort typeres) {
		typerep.delete(typeres);
	}
	
	public void deleteTypeByName(String name) {
		typerep.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		typerep.deleteById(id);
	}

*/