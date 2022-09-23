package co.gov.mintic.cartera.entities;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private long idRole;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private boolean status;

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "idRole=" + idRole +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
