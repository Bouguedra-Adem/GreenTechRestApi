package App.Repo.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.RessourceForrestiereAromatique;

public interface ResFortAromRepo extends CrudRepository<RessourceForrestiereAromatique,Integer>{
	
	 public List<RessourceForrestiereAromatique> findByTypeId(Integer id);
	 public RessourceForrestiereAromatique findByid(Integer id);
	 public List<RessourceForrestiereAromatique> findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
	}
