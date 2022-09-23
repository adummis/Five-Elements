package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepository extends CrudRepository<RoleEntity, Long> {
}
