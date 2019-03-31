package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.TypeResFort;

public interface TypeResRep extends CrudRepository<TypeResFort,Integer>{
	 public TypeResFort findByid(Integer id);
	 public TypeResFort findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
