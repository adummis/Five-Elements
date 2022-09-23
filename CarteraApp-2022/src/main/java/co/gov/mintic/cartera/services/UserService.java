package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.UserEntity;
import co.gov.mintic.cartera.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserEntity findById(int id) {
        Optional<UserEntity> user = userRepository.findById((long) id);
        return user.get();
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> users = (List<UserEntity>) userRepository.findAll();
        return users;
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
