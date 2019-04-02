package App.Repo.AnnuaireRg;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.AnnuaireRG.Categorie;
import App.Model.AnnuaireRG.Institut;

public interface  InstitutRep  extends JpaRepository<Institut, Integer>{

	void findBycategorie(Categorie cat);

}
