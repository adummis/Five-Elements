package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.TransactionEntity;

import java.util.List;

public interface ITransactionService {
    public TransactionEntity findById(int id);

    public List<TransactionEntity> findAll();

    public TransactionEntity createTransaction(TransactionEntity transaction);

    public TransactionEntity updateTransaction(TransactionEntity transaction);

    public void deleteTransaction(long id);
}
