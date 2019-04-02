package App.service.lot4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.Embranchement;
import App.Repo.lot4.EmbranchementRepo;

@Service
public class EmbranchementService{
	
	@Autowired
    EmbranchementRepo emrepo;
	
	public List<Embranchement> getAllEmb(){
		List<Embranchement> embs = new ArrayList<>();
		emrepo.findAll().forEach(embs::add);
		return embs;
	}
	
	public Embranchement getEmbById(Integer id) {
		return emrepo.findByid(id);
	}
	
	public Embranchement getEmbByName(String name) {
		return emrepo.findByName(name);
	}
	
	public void UpdateAddEmb(Embranchement emb) {
		emrepo.save(emb);
	}
	
	public void deleteEmbByName(String name) {
		emrepo.deleteByName(name);
	}
    
	public void deleteembByid(Integer id) {
		emrepo.deleteById(id);
	}
	
	public void deleteEmb(Embranchement emb) {
		emrepo.delete(emb);
	}
	
}
