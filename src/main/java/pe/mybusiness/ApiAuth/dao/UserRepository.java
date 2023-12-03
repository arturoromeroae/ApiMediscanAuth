
package pe.mybusiness.ApiAuth.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.mybusiness.ApiAuth.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);
    Optional<User> findByUserName(String username);
    Optional<User> findByUserNameOrEmail(String username, String email);
    Boolean existsByEmail(String email);
    Boolean existsByUserName(String username);
}
