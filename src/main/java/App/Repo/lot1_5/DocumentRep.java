package App.Repo.lot1_5;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.lot1_5.Document;
import java.util.List;

public interface DocumentRep extends JpaRepository<Document, Integer> {

	Document findBynameDocument(String name);

	List<Document> findByCategorie(String name);

	List<Document> findByTag(String name);
	



}
