package App.Repo.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import App.Model.lot2.APA;
import App.Model.lot4.RESSOURCE;

public interface RESSOURCERepo extends JpaRepository<RESSOURCE, Integer >{
	 
	}
