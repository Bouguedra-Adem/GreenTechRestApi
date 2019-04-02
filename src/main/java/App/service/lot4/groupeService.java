package App.service.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.Model.lot4.groupe;
import App.Repo.lot4.groupeRepo;

@Service
public class groupeService {
	
	@Autowired
	groupeRepo grouperepo;
	public List<groupe> getAll(){
		List<groupe> clsemb = new ArrayList<>();
		grouperepo.findAll().forEach(clsemb::add);
		return clsemb;
	}
	public groupe getById(Integer id) {
		return grouperepo.findByid(id);
	}
	
	public groupe getByName(String name) {
		return grouperepo.findByName(name);
	}
	
	public void UpdateAdd(groupe Famille) {
		grouperepo.save(Famille);
	}
	
	public void delete(groupe Famille) {
		grouperepo.delete(Famille);
	}
	
	public void deleteByName(String name) {
		grouperepo.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		grouperepo.deleteById(id);
	}
}
