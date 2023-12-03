package pe.mybusiness.ApiAuth.service;
import java.util.List;
import pe.mybusiness.ApiAuth.entity.Role;
public interface RoleService {
    List<Role> findAll(); 
    Role findByName(String name);
    Role add (Role role);
}
