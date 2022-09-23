package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.UserEntity;

import java.util.List;

public interface IUserService {
    public UserEntity findById(int id);

    public List<UserEntity> findAll();

    public UserEntity createUser(UserEntity user);

    public UserEntity updateUser(UserEntity user);

    public void deleteUser(long id);
}
