package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.RoleEntity;

import java.util.List;

public interface IRoleService {
    public RoleEntity findById(int id);

    public List<RoleEntity> findAll();

    public RoleEntity createRole(RoleEntity role);

    public RoleEntity updateRole(int id, RoleEntity role);

    public void deleteRole(int id);
}
