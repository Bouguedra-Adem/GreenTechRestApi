package App.Controller;

import java.net.URI;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import App.Model.User.DemandeRessource;
import App.Model.User.user;
import App.Services.User.userService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	@Resource
	private userService ServiceUser ;
	
	
	@PostMapping(value="/User")
	public  void addUser (@Valid @RequestBody user User) {
		 System.out.println(User);
		  this.ServiceUser.saveUser(User);
		 
		}
		
	 @DeleteMapping ("/User/{iduser}")
	  public void  DelteDoc (@PathVariable int iduser) {
   	 this.ServiceUser.DeleteUser(iduser);
		
	}
	
	
	@GetMapping("/User/var")
	public user GetUser(@RequestParam String password) {
		System.out.println(password +"aaaaaaaaaaniiiiiiiiihnaaa");
		 return this.ServiceUser.findByPassword(password);
	}
	

	@PutMapping("/User/Demande/{iduser}")
	public void saveDemande(@RequestBody DemandeRessource demande ,@PathVariable int iduser ) {
		this.ServiceUser.saveDemande(demande, iduser);
		
	}
	
	@PutMapping("/User/Document/{idDocument}/{iduser}")
	
	public void saveDocument(@PathVariable int idDocument,@PathVariable int iduser) {
		System.out.println("var1="+idDocument+"var2="+iduser);
		this.ServiceUser.saveDocument( idDocument,iduser);
	}
    @DeleteMapping ("/User/Document/{iduser}/{idDocument}")
	  public void  DelteDoc (@PathVariable int idDocument,@PathVariable int iduser) {
    	 this.ServiceUser.DelteDoc(idDocument, iduser);
		
	}
	
    @DeleteMapping ("/User/Demande/{iduser}/{idDemande}")
     public void DelteDDemande(@PathVariable int idDemande,@PathVariable int iduser) {
    	this.ServiceUser.DelteDDemande(idDemande, iduser);
    	 
     }

}
