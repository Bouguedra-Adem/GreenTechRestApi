package App.Repo.lot4;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import App.Model.lot4.ressourceAliAgr;

public interface ressourceAliAgrRepo extends CrudRepository<ressourceAliAgr,Integer>{

	public ressourceAliAgr findByid(Integer id);
    public ressourceAliAgr findByName(String name);
    @Modifying
    @Transactional
    public void deleteByName(String name);
}
