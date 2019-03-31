package App.Repo.lot4;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.ClasseEmb;

public interface ClasseRepo extends CrudRepository<ClasseEmb,Integer>{
 public ClasseEmb findByid(Integer id);
 public ClasseEmb findByName(String name);
 @Modifying
 @Transactional
 public void deleteByName(String name);
}
