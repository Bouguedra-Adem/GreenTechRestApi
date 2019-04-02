package App.Controller.lot2Controller;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import App.Model.lot2.APA;

@RestController
public class ApaController {
	
	@Autowired
	@Resource
	private App.Services.ApaService ApaService;
	
	
	@GetMapping("/Apa") 
	public List<APA> getAllDocuemnt(){
		return ApaService.getAllAPA();
	
	}
	 @PostMapping(value = "/SaveApa")
	    public ResponseEntity<Void> AddDocument(@RequestBody APA apa) {
	        APA AapaAdd=  ApaService.CreatAPA(apa);
	        if (AapaAdd == null)
	            return ResponseEntity.noContent().build();

	        URI location = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("/{id}")
	                .buildAndExpand(AapaAdd.getId())
	                .toUri();
	        return ResponseEntity.created(location).build();
	    }
	
	
	
	

}
