package App.Controller.lot4;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.Classe;
import App.Repo.lot4.ClasseRepo;
import App.exception.NotFoundException;

@RestController
public class ClasseController{
	@Autowired
	ClasseRepo classrepo;
	/*
	 * 
	 *	Get
	 *
	 */
	@RequestMapping(method=RequestMethod.GET,value="/classes")
	public List<Classe> getAllClasses(){
		List<Classe> clsemb = new ArrayList<>();
		classrepo.findAll().forEach(clsemb::add);
		return clsemb;
	}
	

    @RequestMapping(method=RequestMethod.GET,value="/class/name/{name}")
    public List<Classe> getResByName(@PathVariable String name) {
    	return classrepo.findByName(name);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/class/{id}")
	public Classe getResById(@PathVariable Integer id) {
	    Optional<Classe> classe = classrepo.findById(id);
	    	if(classe.isPresent()) {
	    	    return	classe.get();    	
	    		}else {
	    		throw new NotFoundException("Classe not found with id : " + id);
	   }
	}
	/*
	 * 
	 *	POST
	 *
	 */
	

    @RequestMapping(method=RequestMethod.POST,value="/classes")
    public void addClasses(@RequestBody Iterable<Classe> classes) {
    	classrepo.saveAll(classes);
    }
	
    @RequestMapping(method=RequestMethod.POST,value="/class")
    public void  addClasse(@RequestBody Classe classemb) {
    	classrepo.save(classemb);
    }
    
    
	@RequestMapping(method=RequestMethod.PUT,value="/class")
    public void updateClasse(@RequestBody Classe classemb) {
    	classrepo.save(classemb);
    }

	/*
	 * 
	 *	DELETE
	 *
	 */
	
    @RequestMapping(method=RequestMethod.DELETE,value="/class/{id}")
    public void deleteClassById(@PathVariable Integer id) {
    	classrepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/class/name/{name}")
    public void deleteResByName(@PathVariable String name) {
    	classrepo.deleteByName(name);
    }  
}

