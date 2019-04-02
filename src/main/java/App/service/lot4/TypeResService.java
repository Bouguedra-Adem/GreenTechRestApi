package App.service.lot4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import App.Model.lot4.TypeResFort;
import App.Repo.lot4.TypeResRep;

@Service
public class TypeResService {
	@Autowired
	TypeResRep typerep;
	public List<TypeResFort> getAll(){
		List<TypeResFort> typeres = new ArrayList<>();
		typerep.findAll().forEach(typeres::add);
		return typeres;
	}
	
	public TypeResFort getById(Integer id) {
		return typerep.findByid(id);
	}
	
	public TypeResFort getByName(String name) {
		return typerep.findByName(name);
	}
	
	public void UpdateAddType(TypeResFort typeres) {
		typerep.save(typeres);
	}
	
	public void deleteType(TypeResFort typeres) {
		typerep.delete(typeres);
	}
	
	public void deleteTypeByName(String name) {
		typerep.deleteByName(name);
	}
	
	public void deleteById(Integer id) {
		typerep.deleteById(id);
	}
}
