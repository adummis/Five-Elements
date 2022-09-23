package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface ITransactionRepository extends CrudRepository<TransactionEntity, Long> {
}
