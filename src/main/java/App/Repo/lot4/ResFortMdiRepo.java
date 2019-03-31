package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.RessourceForestiereMedionale;

public interface ResFortMdiRepo extends CrudRepository<RessourceForestiereMedionale,Integer>{
	 public RessourceForestiereMedionale findByid(Integer id);
	 public RessourceForestiereMedionale findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
