package pe.mybusiness.ApiAuth.service;

import pe.mybusiness.ApiAuth.entity.User;


public interface UserService {
    User findByEmail(String email);
    User findByUsername(String username);
    User findByUsernameOrEmail(String username, String email);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
    User add(User user);
}
