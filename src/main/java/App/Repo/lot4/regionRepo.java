package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;


import App.Model.lot4.region;

public interface regionRepo extends CrudRepository<region,Integer>{
	 public region findByid(Integer id);
	 public region findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
	}
