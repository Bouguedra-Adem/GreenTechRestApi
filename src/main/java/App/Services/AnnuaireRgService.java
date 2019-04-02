package App.Services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.AnnuaireRG.Branche;
import App.Model.AnnuaireRG.Categorie;
import App.Model.AnnuaireRG.Institut;
import App.Repo.AnnuaireRg.BrancheRep;
import App.Repo.AnnuaireRg.CategorieRep;
import App.Repo.AnnuaireRg.InstitutRep;

@Service 
public class AnnuaireRgService {
	@Resource
	private BrancheRep brancheRep;
	@Resource
	private CategorieRep categorieRep;
	@Resource
	private InstitutRep institutRep;
	
	
	public List<Institut> getAllInstitut(){
		return institutRep.findAll();
	}
	public Institut CreatInstitut(Institut ins){
		return institutRep.save(ins);
	}
	public Institut UpdateInstitut(Institut ins){
		return institutRep.save(ins);
	}
	public void DeleteInstitut(int id){
		institutRep.deleteById(id);
	}
	public void getIstitutByCategorie(Categorie cat){
		institutRep.findBycategorie(cat);
	}
	public List<Categorie> getAllCategorie(){
		return categorieRep.findAll();
	}
	public Categorie CreatCategorie(Categorie cat){
		 return categorieRep.save(cat);
	}
	public void UpdateCategorie(Categorie cat){
		 categorieRep.save(cat);
	}
	public void DeleteCategorie(int id){
		 categorieRep.deleteById(id);
	}
	public List<Branche> getAllBranche(){
		return brancheRep.findAll();
	}
	public void  CreatBracnhe(Branche br){
		  brancheRep.save(br);
	}
	public void   UpdateBracnhe(Branche br){
		  brancheRep.save(br);
	}
	public void  DeleteBracnhe(int id){
		  brancheRep.deleteById(id);
	}

}
