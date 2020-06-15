package login.system.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import login.system.application.model.User;
import login.system.application.repository.RoleRepository;
import login.system.application.repository.UserRepository;

import java.util.Date;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        user.setMobile(user.getMobile());
        user.setDOB(user.getDOB());
        user.setAddress(user.getAddress());
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }	

}
