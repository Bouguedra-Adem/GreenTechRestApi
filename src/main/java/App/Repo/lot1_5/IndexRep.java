package App.Repo.lot1_5;

import org.springframework.data.jpa.repository.JpaRepository;


import App.Model.lot1_5.DocNonIndex;


public interface IndexRep  extends JpaRepository <DocNonIndex, Integer> {
	
	DocNonIndex findByid(int id);

}
