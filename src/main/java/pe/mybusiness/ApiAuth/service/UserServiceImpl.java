package pe.mybusiness.ApiAuth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.mybusiness.ApiAuth.dao.UserRepository;
import pe.mybusiness.ApiAuth.entity.User;


@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUserName(username).get();
    }

    @Override
    public User findByUsernameOrEmail(String username, String email) {
        return userRepository.findByUserNameOrEmail(username,email).get();
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUserName(username);
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    
}
