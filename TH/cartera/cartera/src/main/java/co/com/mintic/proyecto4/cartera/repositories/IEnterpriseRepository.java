package co.com.mintic.proyecto4.cartera.repositories;

import co.com.mintic.proyecto4.cartera.entities.EnterpriseEntity;
import org.springframework.data.repository.CrudRepository;

public interface IEnterpriseRepository extends CrudRepository<EnterpriseEntity, Long> {
}
