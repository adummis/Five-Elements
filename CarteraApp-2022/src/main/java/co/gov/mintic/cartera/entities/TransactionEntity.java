package co.gov.mintic.cartera.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private long idTransaction;
    @Column(name = "amount")
    private float amount;
    @Column(name = "transaction_concept")
    private String transactionConcept;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private EmployeeEntity employee;
    @Column(name = "created_at")
    private Date createdAt;

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTransactionConcept() {
        return transactionConcept;
    }

    public void setTransactionConcept(String transactionConcept) {
        this.transactionConcept = transactionConcept;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "idTransaction=" + idTransaction +
                ", amount=" + amount +
                ", transactionConcept='" + transactionConcept + '\'' +
                ", employee=" + employee +
                ", createdAt=" + createdAt +
                '}';
    }
}
