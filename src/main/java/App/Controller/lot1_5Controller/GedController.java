package App.Controller.lot1_5Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.serializer.Serializer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import App.Model.lot1_5.Document;
import App.Model.lot1_5.Ged;
import App.Repo.lot1_5.GedRepo;

@Controller
public class GedController implements Serializer<Ged> {
	
	@Autowired
	private GedRepo gedRep;
	
	@GetMapping ("/Ged")
	@ResponseBody
	public  List<Ged> returnAllGed() {
		System.out.println(( gedRep.findAll())+"aadel");
		return  gedRep.findAll();
		
		
	}

	@Override
	public void serialize(Ged object, OutputStream outputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
