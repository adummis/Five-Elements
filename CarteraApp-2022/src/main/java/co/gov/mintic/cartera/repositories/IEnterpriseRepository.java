package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.EnterpriseEntity;
import org.springframework.data.repository.CrudRepository;

public interface IEnterpriseRepository extends CrudRepository<EnterpriseEntity, Long> {
}
