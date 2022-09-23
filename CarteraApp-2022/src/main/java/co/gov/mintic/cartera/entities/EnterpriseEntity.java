package co.gov.mintic.cartera.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "enterprise")
public class EnterpriseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enterprise")
    private long idEnterprise;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "id_document_type")
    private DocumentTypeEntity documentType;
    @Column(name = "document_number")
    private String documentNumber;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "status")
    private boolean status;

    public long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DocumentTypeEntity getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeEntity documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EnterpriseEntity{" +
                "idEnterprise=" + idEnterprise +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
