package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import App.Model.lot4.RessourceMarine;

public interface  RessourceMarinRepo extends CrudRepository<RessourceMarine,Integer>{

	public RessourceMarine findByid(Integer id);
    public RessourceMarine findByName(String name);
    @Modifying
    @Transactional
    public void deleteByName(String name);
}
