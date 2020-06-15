package login.system.application.service;

import login.system.application.model.User;

public interface UserService {

	void save(User user);

    User findByUsername(String username);
}
