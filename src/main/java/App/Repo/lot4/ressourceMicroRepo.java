package App.Repo.lot4;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import App.Model.lot4.ressourceMicroorganisme;


public interface ressourceMicroRepo extends CrudRepository<ressourceMicroorganisme,Integer>{
	public ressourceMicroorganisme findByid(Integer id);
    public List<ressourceMicroorganisme> findByName(String name);
    @Modifying
    @Transactional
    public void deleteByName(String name);
}
