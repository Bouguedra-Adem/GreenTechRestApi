package App.service.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.ClasseEmb;
import App.Repo.lot4.ClasseRepo;

@Service
public class ClasseService {

	@Autowired
	ClasseRepo classrepo;
	public List<ClasseEmb> getAll(){
		List<ClasseEmb> clsemb = new ArrayList<>();
		classrepo.findAll().forEach(clsemb::add);
		return clsemb;
	}
	public ClasseEmb getById(Integer id) {
		return classrepo.findByid(id);
	}
	
	public ClasseEmb getByName(String name) {
		return classrepo.findByName(name);
	}
	
	public void UpdateAddClass(ClasseEmb classemb) {
		classrepo.save(classemb);
	}
	
	public void deleteClass(ClasseEmb classemb) {
		classrepo.delete(classemb);
	}
	
	public void deleteClassByName(String name) {
		classrepo.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		classrepo.deleteById(id);
	}
}
