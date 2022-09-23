package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.EnterpriseEntity;
import co.gov.mintic.cartera.repositories.IEnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService implements IEnterpriseService{

    @Autowired
    private IEnterpriseRepository enterpriseRepository;

    @Override
    public EnterpriseEntity findById(int id) {
        Optional<EnterpriseEntity> enterprise = enterpriseRepository.findById((long) id);
        return enterprise.get();
    }

    @Override
    public List<EnterpriseEntity> findAll() {
        List<EnterpriseEntity> enterprises = (List<EnterpriseEntity>) enterpriseRepository.findAll();
        return enterprises;
    }

    @Override
    public EnterpriseEntity createEnterprise(EnterpriseEntity enterprise) {
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public EnterpriseEntity updateEnterprise(EnterpriseEntity enterprise) {
        return enterpriseRepository.save(enterprise);
    }

    @Override
    public void deleteEnterprise(long id) {
        enterpriseRepository.deleteById(id);
    }
}
