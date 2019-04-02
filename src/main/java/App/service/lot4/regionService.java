package App.service.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.Model.lot4.region;
import App.Repo.lot4.regionRepo;

@Service
public class regionService {
	@Autowired
	regionRepo regiorepo;
	public List<region> getAll(){
		List<region> rGion = new ArrayList<>();
		regiorepo.findAll().forEach(rGion::add);
		return rGion;
	}
	public region getById(Integer id) {
		return regiorepo.findByid(id);
	}
	
	public region getByName(String name) {
		return regiorepo.findByName(name);
	}
	
	public void UpdateAdd(region rEgion) {
		regiorepo.save(rEgion);
	}
	
	public void delete(region rEgion) {
		regiorepo.delete(rEgion);
	}
	
	public void deleteByName(String name) {
		regiorepo.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		regiorepo.deleteById(id);
	}
}
