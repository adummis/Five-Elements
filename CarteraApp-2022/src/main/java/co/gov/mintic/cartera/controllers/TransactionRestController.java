package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.TransactionEntity;
import co.gov.mintic.cartera.services.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionRestController {
    @Autowired
    private ITransactionService transactionService;

    @GetMapping("/transaction/{id}")
    public TransactionEntity findById(@PathVariable int id){
        return transactionService.findById(id);
    }
    @GetMapping("/transaction")
    public List<TransactionEntity> findAll(){
        return this.transactionService.findAll();
    }

    @PostMapping("/transaction")
    public TransactionEntity createTransaction (@RequestBody TransactionEntity transaction){
        return this.transactionService.createTransaction(transaction);
    }

    @PutMapping("/transaction")
    public TransactionEntity updateTransaction(@RequestBody TransactionEntity transaction){
        return this.transactionService.updateTransaction(transaction);
    }

    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable int id){
        this.transactionService.deleteTransaction(id);
    }
}
