package App.Repo.lot1_5;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.Model.lot1_5.Ged;

@Repository
public interface GedRepo extends JpaRepository<Ged,Long> {

	

 
     	
}
