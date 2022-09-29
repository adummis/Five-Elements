package co.com.mintic.proyecto4.cartera.repositories;

import co.com.mintic.proyecto4.cartera.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
}
