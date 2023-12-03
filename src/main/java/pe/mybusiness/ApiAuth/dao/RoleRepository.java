
package pe.mybusiness.ApiAuth.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.mybusiness.ApiAuth.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
    
    Optional<Role> findByName(String name);
}
