package App.service.lot4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.famille;
import App.Repo.lot4.familleRepo;

@Service
public class familleService {
	
	@Autowired
	familleRepo famillerepo;
	public List<famille> getAll(){
		List<famille> clsemb = new ArrayList<>();
		famillerepo.findAll().forEach(clsemb::add);
		return clsemb;
	}
	public famille getById(Integer id) {
		return famillerepo.findByid(id);
	}
	
	public famille getByName(String name) {
		return famillerepo.findByName(name);
	}
	
	public void UpdateAdd(famille Famille) {
		famillerepo.save(Famille);
	}
	
	public void delete(famille Famille) {
		famillerepo.delete(Famille);
	}
	
	public void deleteByName(String name) {
		famillerepo.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		famillerepo.deleteById(id);
	}
}
