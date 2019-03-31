package App.service.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.Model.lot4.RessourceForrestiereAromatique;
import App.Repo.lot4.ResFortAromRepo;


@Service
public class ResFortAromService {

	@Autowired
	ResFortAromRepo resRepo;
	
	
	public List<RessourceForrestiereAromatique> getAll(){
		List<RessourceForrestiereAromatique> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
	public RessourceForrestiereAromatique getRessourceById(Integer id) {
		return resRepo.findByid(id);
	}
	
	public RessourceForrestiereAromatique getRessourceByName(String Name) {
		return resRepo.findByName(Name);
	}
	
	public void UpdateAddRessource(RessourceForrestiereAromatique res) {
		resRepo.save(res);
	}
	
	public void deleteRessource(Integer id) {
		resRepo.deleteById(id);
	}
	
	public void deleteRessourceByName(String name) {
		resRepo.deleteByName(name);
	}
}
