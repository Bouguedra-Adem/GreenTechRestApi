package App.Services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.Ressource;
import App.Model.User.user;
import App.Repo.lot1_5.RessourceRep;

@Service (value="RessourceService")
public class RessourceService {
	
	@Resource
	private RessourceRep Resrep;

	
	  public List<Ressource> getAllRessource(){
	    	return this.Resrep.findAll();
	    }
	  public Ressource saveRessource(Ressource res) {
		    
			return this.Resrep.save(res);
			
	}
	  public void DeleteRessource(int id) {
		    
			this.Resrep.deleteById(id);
			
	    }
	  public Ressource findById(int id) {
		    
		return 	this.Resrep.findById(id);
			
	    }
}
