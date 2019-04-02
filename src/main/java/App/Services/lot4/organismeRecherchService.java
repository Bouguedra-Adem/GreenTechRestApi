package App.Services.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.organismeRecherch;
import App.Repo.lot4.organismeRechercheRepo;

@Service
public class organismeRecherchService {
	
	@Autowired
	organismeRechercheRepo organismrechrepo;
	public List<organismeRecherch> getAll(){
		List<organismeRecherch> orgrech = new ArrayList<>();
		organismrechrepo.findAll().forEach(orgrech::add);
		return orgrech;
	}
	public organismeRecherch getById(Integer id) {
		return organismrechrepo.findByid(id);
	}
	
	public organismeRecherch getByName(String name) {
		return organismrechrepo.findByName(name);
	}
	
	public void UpdateAdd(organismeRecherch recheorg) {
		organismrechrepo.save(recheorg);
	}
	
	public void delete(organismeRecherch rechorg) {
		organismrechrepo.delete(rechorg);
	}
	
	public void deleteByName(String name) {
		organismrechrepo.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		organismrechrepo.deleteById(id);
	}
}
