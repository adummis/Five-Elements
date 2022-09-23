package co.gov.mintic.cartera.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long idUser;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "_password", nullable = false)
    private String _password;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "create_at")
    private Date createdAt;
    @Column(name = "status")
    private boolean status;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
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
        return "UserEntity{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", _password='" + _password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", status=" + status +
                '}';
    }
}
