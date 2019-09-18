package App.Repo.lot1_5;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.Ressource;

public interface RessourceRep extends JpaRepository<Ressource, Integer> {
	Ressource findById(int id);

}
