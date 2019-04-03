package App.Repo.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import App.Model.lot4.famille;

public interface familleRepo extends CrudRepository<famille,Integer>{
	 public famille findByid(Integer id);
	 public List<famille> findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
	}
