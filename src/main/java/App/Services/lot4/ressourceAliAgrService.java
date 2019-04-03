package App.Services.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.Model.lot4.ressourceAliAgr;
import App.Repo.lot4.ressourceAliAgrRepo;


@Service
public class ressourceAliAgrService {

	@Autowired
	ressourceAliAgrRepo resRepo;
	
	public List<ressourceAliAgr> getAll(){
		List<ressourceAliAgr> res = new ArrayList<>();
		resRepo.findAll().forEach(res::add);
		return res;
	}
	
	public ressourceAliAgr getRessourceById(Integer id) {
		return resRepo.findByid(id);
	}
	
	public ressourceAliAgr getRessourceByName(String Name) {
		return resRepo.findByName(Name);
	}
	
	public void UpdateAddRessource(ressourceAliAgr res) {
		resRepo.save(res);
	}
	
	public void deleteRessource(Integer id) {
		resRepo.deleteById(id);
	}
	
	public void deleteRessourceByName(String name) {
		resRepo.deleteByName(name);
	}
}