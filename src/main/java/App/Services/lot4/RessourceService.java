package App.Services.lot4;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.lot4.RESSOURCE;
import App.Repo.lot4.RESSOURCERepo;

@Service
public class RessourceService {
	@Resource
	private RESSOURCERepo RessourceRep;
	
	public List<RESSOURCE> getAllRESSOURCES() {
		return this.RessourceRep.findAll();
	}
	public RESSOURCE CreatRESSOURCE(RESSOURCE ressource) {
		return this.RessourceRep.save(ressource);
	}
	public RESSOURCE UpdateRESSOURCE(RESSOURCE ressource) {
		return this.RessourceRep.save(ressource);
	}
	public void DeleteRESSOURCE(int id) {
		 this.RessourceRep.deleteById(id);
	}
	public RESSOURCE getRESSOURCEById(int id) {
		return this.RessourceRep.getOne(id);
	}
	public Optional<RESSOURCE> findRESSOURCEById(int id) {
		return this.RessourceRep.findById(id);
	}
	public RESSOURCE saveRESSOURCE(RESSOURCE ressource) {
		return this.RessourceRep.save(ressource);
	}
	
}