package App.Repo.lot4;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import App.Model.lot4.Classe;

public interface ClasseRepo extends  CrudRepository<Classe,Integer>{
 public Classe findByid(Integer id);
 public List<Classe> findByName(String name);
 @Modifying
 @Transactional
 public void deleteByName(String name);
}
