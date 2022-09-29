package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.DocumentTypeEntity;

import java.util.List;

public interface IDocumentTypeService {
    public DocumentTypeEntity findById(int id);

    public List<DocumentTypeEntity> findAll();

    public DocumentTypeEntity createDocumentType(DocumentTypeEntity documentType);

    public DocumentTypeEntity updateDocumentType(int id, DocumentTypeEntity documentType);

    public void deleteDocumentType(int id);
}
