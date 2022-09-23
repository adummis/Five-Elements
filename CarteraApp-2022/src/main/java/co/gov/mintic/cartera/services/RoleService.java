package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.RoleEntity;
import co.gov.mintic.cartera.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public RoleEntity findById(int id) {
        Optional<RoleEntity> role = roleRepository.findById((long) id);
        return role.get();
    }

    @Override
    public List<RoleEntity> findAll() {
        List<RoleEntity> roles = (List<RoleEntity>) roleRepository.findAll();
        return roles;
    }

    @Override
    public RoleEntity createRole(RoleEntity role) {
        RoleEntity newRole = roleRepository.save(role);
        return newRole;
    }

    @Override
    public RoleEntity updateRole(int id, RoleEntity rol) {
        RoleEntity putRole = roleRepository.save(rol);
        return putRole;
    }

    @Override
    public void deleteRole(int id) {
        roleRepository.deleteById((long) id);
    }
}
