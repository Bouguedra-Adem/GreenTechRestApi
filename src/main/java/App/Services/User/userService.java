package App.Services.User;

import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.User.DemandeRessource;
import App.Model.User.user;
import App.Model.lot1_5.Document;
import App.Repo.User.DemandePermisRepo;
import App.Repo.lot1_5.DocumentRep;

@Service (value="userService")

public class userService  {
	@Resource
	private App.Repo.User.UserRepo UserRepo;
	@Resource
	private DemandePermisRepo DemandeRepo;
	@Resource
	private DocumentRep DocRepo;
	
    public List<user> getAlluser(){
    	return this.UserRepo.findAll();
    }
	public user findByPassword(String Password) {
		System.out.println(this.UserRepo.findBypass(Password));
		return this.UserRepo.findBypass(Password);
	}
	public user findByid(int id) {
		
		return this.UserRepo.findByid(id);
	}
	public user saveUser(user User) {
		    
			return this.UserRepo.save(User);
			
	}
	public void DeleteUser(int id) {
	    
		this.UserRepo.deleteById(id);
		
    }
	
	public void saveDemande(DemandeRessource demande,int iduser) {
		 user us=this.UserRepo.getOne(iduser);
		 us.getDemandeRess().add(demande);
		 this.DemandeRepo.save(demande);
	}
	
	public void saveDocument(int idDocument,int iduser) {
		   user us=this.UserRepo.getOne(iduser);
		 System.out.println(us.toString());
		   Document document=this.DocRepo.getOne(idDocument);
		   if (!us.getDoc().contains(document)) {
		 
		   us.getDoc().add(document);
	       this.UserRepo.save(us); 
		   }
		
	
	}
		 
	
	public void DelteDoc(int idDocument,int iduser ) {
		user us=this.UserRepo.getOne(iduser);
		 Predicate<Document> DocPredicate = p-> p.getId() ==idDocument;
		 us.getDoc().removeIf(DocPredicate);
		 Document document=this.DocRepo.getOne(idDocument);
		 Predicate<user> userPredicate = p-> p.getId() ==iduser;
		 document.getUser().removeIf(userPredicate);
		 
	}
	public void DelteDDemande(int idDemande,int iduser ) {
		user us=this.UserRepo.getOne(iduser);
		 Predicate<DemandeRessource> DemandePredicate = p-> p.getId() ==idDemande;
		 us.getDemandeRess().removeIf(DemandePredicate);
		 
	}
	

}
