package co.com.mintic.proyecto4.cartera.repositories;

import co.com.mintic.proyecto4.cartera.entities.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface ITransactionRepository extends CrudRepository<TransactionEntity, Long> {
}
