package App.Controller.lot4;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import App.Model.lot4.Embranchement;
import App.Repo.lot4.ClasseRepo;
import App.Repo.lot4.EmbranchementRepo;
import App.exception.NotFoundException;

@RestController
public class EmbranchemntController {

	@Autowired
	EmbranchementRepo emrepo;
	@Autowired
	ClasseRepo classrepo;
	/*
	 * 
	 *	Get
	 *
	 */

	@RequestMapping(method=RequestMethod.GET,value="/embranchements")
	public List<Embranchement> getAllEmbranchement(){
		List<Embranchement> embs = new ArrayList<>();
		emrepo.findAll().forEach(embs::add);
		return embs;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/embranchement/{id}")
	    public Embranchement getEmbById(@PathVariable Integer id) {
	          return emrepo.findByid(id);
	}
	
	   @RequestMapping(method=RequestMethod.GET,value="/embranchment/name/{name}")
	    public List<Embranchement> getEmbByName(@PathVariable String name) {
	    	return emrepo.findByName(name);
    }

	@RequestMapping(method=RequestMethod.GET,value="/class/{classid}/embranchement")
	public List<Embranchement> getAllEmbranchementByClassId( @PathVariable Integer classid){
		List<Embranchement> embs = new ArrayList<>();
		emrepo.findByClasseId(classid).forEach(embs::add);
		return embs;
	}
	
	
	/*
	 * 
	 *	POST
	 *
	 */

   @RequestMapping(method=RequestMethod.POST,value="/class/{classid}/embranchement")
    public Embranchement  addEmbranchement(@PathVariable Integer classid,@Valid @RequestBody Embranchement emb) {
       return classrepo.findById(classid).map(classe ->{
    		emb.setClassEmbranchement(classe);
    		return emrepo.save(emb);
    	}).orElseThrow(() ->new NotFoundException("classe not fount"));
    }
 
   @RequestMapping(method=RequestMethod.PUT,value="/class/{classid}/embrancement/{embranchementid}")
   public Embranchement updateEmbranchement(@PathVariable Integer classid,
			@PathVariable Integer embranchementid,
			@Valid @RequestBody Embranchement embranchemntupdate) {
	   if(!classrepo.existsById(classid)) {
   		throw new NotFoundException("class not found!");
   	}
   	
       return emrepo.findById(embranchementid)
               .map(embrachemnt -> {
            	   
            	   embrachemnt.setName(embranchemntupdate.getName());
            	   embrachemnt.setCaractEmbranchement(embranchemntupdate.getCaractEmbranchement());
            	   embrachemnt.setDescEmbranchement(embranchemntupdate.getDescEmbranchement());
                   return emrepo.save(embrachemnt);
               }).orElseThrow(() -> new NotFoundException("Assignment not found!"));
     }
   
	/*
	 * 
	 *	DELETE
	 *
	 */

    
    @RequestMapping(method=RequestMethod.DELETE,value="/embranchement/{id}")
    public void deleteEmbById(@PathVariable Integer id) {
    	emrepo.deleteById(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/embranchement/name/{name}")
    public void deleteEmbByName(@PathVariable String name) {
    	emrepo.deleteByName(name);
    }  
}
