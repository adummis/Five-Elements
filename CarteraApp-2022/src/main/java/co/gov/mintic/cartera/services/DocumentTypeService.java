package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.DocumentTypeEntity;
import co.gov.mintic.cartera.repositories.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService implements IDocumentTypeService{

    @Autowired
    private IDocumentTypeRepository documentTypeRepository;
    @Override
    public DocumentTypeEntity findById(int id) {
        Optional<DocumentTypeEntity> documentType = documentTypeRepository.findById((long) id);
        return documentType.get();
    }

    @Override
    public List<DocumentTypeEntity> findAll() {
        List<DocumentTypeEntity> documentTypes = (List<DocumentTypeEntity>) documentTypeRepository.findAll();
        return documentTypes;
    }

    @Override
    public DocumentTypeEntity createDocumentType(DocumentTypeEntity documentType) {
        DocumentTypeEntity newDocumentType = documentTypeRepository.save(documentType);
        return newDocumentType;
    }

    @Override
    public DocumentTypeEntity updateDocumentType(int id, DocumentTypeEntity documentType) {
        DocumentTypeEntity putDocumentType = documentTypeRepository.save(documentType);
        return putDocumentType;
    }

    @Override
    public void deleteDocumentType(int id) {
        documentTypeRepository.deleteById((long) id);
    }
}
