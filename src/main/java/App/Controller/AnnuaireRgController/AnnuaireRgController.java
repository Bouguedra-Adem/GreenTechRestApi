package App.Controller.AnnuaireRgController;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import App.Model.AnnuaireRG.Categorie;
import App.Model.AnnuaireRG.Institut;
import App.Model.lot1_5.Document;
import App.Services.AnnuaireRgService;

@RestController
@RequestMapping("/AnnuaireRg")
public class AnnuaireRgController {
	@Resource
	private AnnuaireRgService AnRgService;
	
	@GetMapping("/Institut")
	public List<Institut> getAllInstitut() {
		return AnRgService.getAllInstitut();
	}
	 @PostMapping(value = "/CreatInstitut")
	    public ResponseEntity<Void> CreatInstitut(@RequestBody Institut ins) {
	        Institut institut=  AnRgService.CreatInstitut(ins);
	        if (institut== null)
	            return ResponseEntity.noContent().build();

	        URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("/{id}")
	                .buildAndExpand(institut.getId())
	                .toUri();
	        return ResponseEntity.created(location).build();
	    }
	 @PostMapping(value = "/CreatCategorie")
	    public ResponseEntity<Void> AddCategorie(@RequestBody Categorie cat) {
	        Categorie catt=  AnRgService.CreatCategorie(cat);
	        if (catt== null)
	            return ResponseEntity.noContent().build();

	        URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("/{id}")
	                .buildAndExpand(catt.getId())
	                .toUri();
	        return ResponseEntity.created(location).build();
	    }

}
