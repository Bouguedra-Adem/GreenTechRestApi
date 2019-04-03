package App.Repo.lot4;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.Embranchement;


public interface  EmbranchementRepo extends CrudRepository<Embranchement,Integer>{

	public Embranchement findByid(Integer id);
    public List<Embranchement> findByName(String name);
    public List<Embranchement> findByClasseId(Integer classid);
    @Modifying
    @Transactional
    public void deleteByName(String name);
}

