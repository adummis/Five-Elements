package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity, Long> {
}
