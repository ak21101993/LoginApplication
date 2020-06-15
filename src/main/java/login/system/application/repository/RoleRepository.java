package login.system.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import login.system.application.model.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{

}
