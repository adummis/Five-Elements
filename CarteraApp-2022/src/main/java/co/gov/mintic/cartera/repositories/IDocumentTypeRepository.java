package co.gov.mintic.cartera.repositories;

import co.gov.mintic.cartera.entities.DocumentTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface IDocumentTypeRepository extends CrudRepository<DocumentTypeEntity, Long> {
}
