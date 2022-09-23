package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.DocumentTypeEntity;

import java.util.List;

public interface IDocumentTypeService {
    public DocumentTypeEntity findById(int id);

    public List<DocumentTypeEntity> findAll();

    public DocumentTypeEntity createDocumentType(DocumentTypeEntity documentType);

    public DocumentTypeEntity updateDocumentType(int id, DocumentTypeEntity documentType);

    public void deleteDocumentType(int id);
}
