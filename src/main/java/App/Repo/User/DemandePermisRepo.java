package App.Repo.User;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.User.DemandeRessource;

public interface DemandePermisRepo  extends JpaRepository<DemandeRessource, Integer>{

}
