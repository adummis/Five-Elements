package co.gov.mintic.cartera.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private long idEmployee;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @ManyToOne
    @JoinColumn(name = "id_document_type")
    private DocumentTypeEntity documentType;
    @Column(name = "document_number")
    private String documentNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "id_enterprise")
    private EnterpriseEntity enterprise;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RoleEntity role;
    @Column(name = "profile")
    private ProfileEntity profile;
    @OneToOne
    @JoinColumn(name = "id_user")
    private UserEntity user;
    @Column(name = "create_at")
    private LocalDate createdAt;
    private boolean status;

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public EnterpriseEntity getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseEntity enterprise) {
        this.enterprise = enterprise;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public ProfileEntity getProfile() {
        return profile;
    }

    public void setProfile(ProfileEntity profile) {
        this.profile = profile;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
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
        return "EmployeeEntity{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", surname='" + lastname + '\'' +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", enterprise=" + enterprise +
                ", role=" + role +
                ", profile=" + profile +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
