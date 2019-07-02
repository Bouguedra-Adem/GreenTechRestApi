package App.Repo.User;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.User.user;


public interface UserRepo extends  JpaRepository<user, Integer> {
	
    user findBypass(String Pass);
    user findByid(int id);
        
}
