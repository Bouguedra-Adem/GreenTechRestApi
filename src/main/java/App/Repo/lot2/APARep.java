package App.Repo.lot2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import App.Model.lot2.APA;

@Repository 
public interface APARep extends JpaRepository<APA, Integer > {

	APA findBynameAPA(String name);

	List<APA> findByCategorie(String name);



	
	


}
