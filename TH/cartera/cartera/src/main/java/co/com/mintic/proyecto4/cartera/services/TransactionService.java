package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.TransactionEntity;
import co.com.mintic.proyecto4.cartera.repositories.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public TransactionEntity findById(int id) {
        Optional<TransactionEntity> transaction = transactionRepository.findById((long) id);
        return transaction.get();
    }

    @Override
    public List<TransactionEntity> findAll() {
        List<TransactionEntity> transactions = (List<TransactionEntity>) transactionRepository.findAll();
        return transactions;
    }

    @Override
    public TransactionEntity createTransaction(TransactionEntity transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public TransactionEntity updateTransaction(TransactionEntity transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(long id) {
        transactionRepository.deleteById(id);
    }
}
