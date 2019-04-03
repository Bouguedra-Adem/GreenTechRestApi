package App.Repo.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.Type;

public interface TypeResRep extends CrudRepository<Type,Integer>{
	 public Type findByid(Integer id);
	 public List<Type> findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
