package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.RessourceForrestiereAromatique;

public interface ResFortAromRepo extends CrudRepository<RessourceForrestiereAromatique,Integer>{
	 public RessourceForrestiereAromatique findByid(Integer id);
	 public RessourceForrestiereAromatique findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
	}
