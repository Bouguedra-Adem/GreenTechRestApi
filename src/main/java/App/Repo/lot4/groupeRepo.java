package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;


import App.Model.lot4.groupe;

public interface groupeRepo extends CrudRepository<groupe,Integer>{
	 public groupe findByid(Integer id);
	 public groupe findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
	}
