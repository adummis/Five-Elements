package co.gov.mintic.cartera.entities;

import javax.persistence.*;

@Entity
@Table(name = "document_type")
public class DocumentTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document_type")
    private long idDocumentType;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "acronym", nullable = false)
    private String acronym;
    @Column(name = "status")
    private boolean status;

    public long getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(long idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DocumentTypeEntity{" +
                "idDocumentType=" + idDocumentType +
                ", description='" + description + '\'' +
                ", acronym='" + acronym + '\'' +
                ", status=" + status +
                '}';
    }
}
