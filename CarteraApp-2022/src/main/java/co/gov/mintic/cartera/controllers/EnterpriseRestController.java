package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.EnterpriseEntity;
import co.gov.mintic.cartera.entities.TransactionEntity;
import co.gov.mintic.cartera.services.IEnterpriseService;
import co.gov.mintic.cartera.services.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {
    @Autowired
    private IEnterpriseService enterpriseService;
    @Autowired
    private ITransactionService transactionService;

    @GetMapping("/enterprise/{id}")
    public EnterpriseEntity findById(@PathVariable int id){
        return enterpriseService.findById(id);
    }
    @GetMapping("/enterprise")
    public List<EnterpriseEntity> findAll(){
        return this.enterpriseService.findAll();
    }

    @GetMapping("/enterprise/{id}/transaction")
    public List<TransactionEntity> findAllTransaction(){
        return this.transactionService.findAll();
    }

    @PostMapping("/enterprise")
    public EnterpriseEntity createEnterprise (@RequestBody EnterpriseEntity enterprise){
        return this.enterpriseService.createEnterprise(enterprise);
    }

    @PutMapping("/enterprise")
    public EnterpriseEntity updateEnterprise(@RequestBody EnterpriseEntity enterprise){
        return this.enterpriseService.updateEnterprise(enterprise);
    }

    @DeleteMapping("/enterprise/{id}")
    public void deleteEnterprise(@PathVariable int id){
        this.enterpriseService.deleteEnterprise(id);
    }
}
