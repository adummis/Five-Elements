package co.com.mintic.proyecto4.cartera.repositories;

import co.com.mintic.proyecto4.cartera.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity, Long> {
}
