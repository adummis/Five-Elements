package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
