package App.Repo.lot4;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.organismeRecherch;


public interface organismeRechercheRepo extends CrudRepository<organismeRecherch,Integer>{
	 public organismeRecherch findByid(Integer id);
	 public organismeRecherch findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
