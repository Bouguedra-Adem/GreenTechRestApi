package App.Controller.lot4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot4.Embranchement;
import App.Services.lot4.EmbranchementService;

@RestController
public class EmbranchemntController {

	@Autowired
	EmbranchementService embserv;
	
	@RequestMapping("/Embs")
	public List<Embranchement> getAllEmbranchement(){
	return embserv.getAllEmb();
	}
	
    @RequestMapping(method=RequestMethod.POST,value="/postemb")
    public void  addEmbranchement(@RequestBody Embranchement emb) {
    embserv.UpdateAddEmb(emb);
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteidemb/{id}")
    public void deleteEmbById(@PathVariable Integer id) {
    	embserv.deleteembByid(id);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/deletenameemb/{name}")
    public void deleteEmbByName(@PathVariable String name) {
    	embserv.deleteEmbByName(name);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findidemb/{id}")
    public Embranchement getEmbById(@PathVariable Integer id) {
          return embserv.getEmbById(id);
    }
    @RequestMapping(method=RequestMethod.GET,value="/findnameemb/{name}")
    public Embranchement getEmbByName(@PathVariable String name) {
    	return embserv.getEmbByName(name);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/updateemb")
    public void updateEmb(@RequestBody Embranchement emb) {
    	embserv.UpdateAddEmb(emb);
    }
}
