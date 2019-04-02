package App.Services.lot4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.RessourceMarine;
import App.Repo.lot4.RessourceMarinRepo;

@Service
public class RessourceMarineService {

	@Autowired
	RessourceMarinRepo resRepo;
	
	public List<RessourceMarine> getAll(){
		List<RessourceMarine> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
	public RessourceMarine getRessourceById(Integer id) {
		return resRepo.findByid(id);
	}
	
	public RessourceMarine getRessourceByName(String Name) {
		return resRepo.findByName(Name);
	}
	
	public void UpdateAddRessource(RessourceMarine res) {
		resRepo.save(res);
	}
	
	public void deleteRessource(Integer id) {
		resRepo.deleteById(id);
	}
	
	public void deleteRessourceByName(String name) {
		resRepo.deleteByName(name);
	}
}
