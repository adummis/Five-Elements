package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.DocumentTypeEntity;
import co.gov.mintic.cartera.services.IDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentTypeRestController {
    @Autowired
    private IDocumentTypeService documentTypeService;

    @GetMapping("/documentType/{id}")
    public DocumentTypeEntity findById(@PathVariable int id){
        return this.documentTypeService.findById(id);
    }

    @GetMapping("/documentType")
    public List<DocumentTypeEntity> findAll(){
        return this.documentTypeService.findAll();
    }

    @PostMapping("/documentType")
    public DocumentTypeEntity createDocumentType(@RequestBody DocumentTypeEntity documentType){
        return this.documentTypeService.createDocumentType(documentType);
    }

    @PutMapping("/documentType/{id}")
    public DocumentTypeEntity updateDocumentType(@PathVariable int id, @RequestBody DocumentTypeEntity documentType){
        return this.documentTypeService.updateDocumentType(id, documentType);
    }

    @DeleteMapping("/documentType/{id}")
    public void deleteDocumentType(@PathVariable int id){
        this.documentTypeService.deleteDocumentType(id);
    }
}
