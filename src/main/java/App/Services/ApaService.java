package App.Services;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import App.Model.lot2.APA;
import App.Repo.lot2.APARep;

@Service
public class ApaService {
	@Resource
	private APARep ApaRep;
	
	public List< APA> getAllAPA() {
		return this.ApaRep.findAll();
	}
	public APA CreatAPA(APA Doc) {
		return this.ApaRep.save(Doc);
	}
	public APA UpdateAPA(APA Doc) {
		return this.ApaRep.save(Doc);
	}
	public void DeleteAPA(int id) {
		 this.ApaRep.deleteById(id);
	}
	public APA getAPAById(int id) {
		return this.ApaRep.getOne(id);
	}
	public Optional<APA> findAPAById(int id) {
		return this.ApaRep.findById(id);
	}
	public APA saveAPA(APA apa) {
		return this.ApaRep.save(apa);
	}
	
}


