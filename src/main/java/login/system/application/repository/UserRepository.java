package login.system.application.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import login.system.application.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
	

}
