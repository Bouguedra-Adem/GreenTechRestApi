package App.service.lot4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.RessourceForestiereMedionale;
import App.Repo.lot4.ResFortMdiRepo;


@Service
public class ResFortMdiService {

	@Autowired
	ResFortMdiRepo resRepo;
	
	public List<RessourceForestiereMedionale> getAll(){
		List<RessourceForestiereMedionale> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
	public RessourceForestiereMedionale getRessourceById(Integer id) {
		return resRepo.findByid(id);
	}
	
	public RessourceForestiereMedionale getRessourceByName(String Name) {
		return resRepo.findByName(Name);
	}
	
	public void UpdateAddRessource(RessourceForestiereMedionale res) {
		resRepo.save(res);
	}
	
	public void deleteRessource(Integer id) {
		resRepo.deleteById(id);
	}
	
	public void deleteRessourceByName(String name) {
		resRepo.deleteByName(name);
	}
}