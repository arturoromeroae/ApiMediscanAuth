package pe.mybusiness.ApiAuth.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.mybusiness.ApiAuth.dao.RoleRepository;
import pe.mybusiness.ApiAuth.entity.Role;
@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    RoleRepository roleRepository;
    
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name).get();
    }

    @Override
    public Role add(Role role) {
        return roleRepository.save(role);
    }
}
