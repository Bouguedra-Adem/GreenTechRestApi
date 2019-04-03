package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.ressourceMicroorganisme;
import App.Repo.lot4.ressourceMicroRepo;

@RestController
public class resMicroController {
	@Autowired
	ressourceMicroRepo resRepo;
	/*
	 *
	 * GET
	 *
	 */
	@RequestMapping(method=RequestMethod.GET,value="/ressourceMicros")
	public List<ressourceMicroorganisme> getAllRessource(String ressource){
		List<ressourceMicroorganisme> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
    @RequestMapping(method=RequestMethod.GET,value="/ressourceMicro/{id}")
    public ressourceMicroorganisme getResById(@PathVariable Integer id) {
	 return resRepo.findByid(id);
	}
    
	@RequestMapping(method=RequestMethod.GET,value="/ressourceMicro/name/{name}")
	public List<ressourceMicroorganisme> getResByName(@PathVariable String name) {
	return resRepo.findByName(name);
	}
	/*
	 * 
	 * POST
	 * 
	 * 
	 */
    @RequestMapping(method=RequestMethod.POST,value="/ressourceMicro")
    public void  addRessource(@RequestBody ressourceMicroorganisme ressource) {
    	resRepo.save(ressource);
    }
    
   
    
    /*@RequestMapping(method=RequestMethod.PUT,value="/updateresmicro")
    public void updateRes(@RequestBody ressourceMicroorganisme ressource) {
    	resMicServ.UpdateAddRessource(ressource);
    }*/
    /*
     * 
     * DELETE
     * 
     */
    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceMicro/{id}")
    public void deleteResById(@PathVariable Integer id) {
    	resRepo.deleteById(id);
    	}

    @RequestMapping(method=RequestMethod.DELETE,value="/ressourceMicro/{name}")
    public void deleteResByName(@PathVariable String name) {
        resRepo.deleteByName(name);
    }   
}
/*@Autowired
ressourceMicroRepo resRepo;

public List<ressourceMicroorganisme> getAll(){
	List<ressourceMicroorganisme> res = new ArrayList<>();
	resRepo.findAll().forEach(res::add);
	return res;
}

public ressourceMicroorganisme getRessourceById(Integer id) {
	return resRepo.findByid(id);
}

public ressourceMicroorganisme getRessourceByName(String Name) {
	return resRepo.findByName(Name);
}

public void UpdateAddRessource(ressourceMicroorganisme res) {
	resRepo.save(res);
}

public void deleteRessource(Integer id) {
	resRepo.deleteById(id);
}

public void deleteRessourceByName(String name) {
	resRepo.deleteByName(name);
}
*/