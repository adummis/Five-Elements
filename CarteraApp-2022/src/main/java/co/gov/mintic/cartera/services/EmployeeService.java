package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.EmployeeEntity;
import co.gov.mintic.cartera.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity findById(int id) {
        Optional<EmployeeEntity> employee = employeeRepository.findById((long) id);
        return employee.get();
    }

    @Override
    public List<EmployeeEntity> findAll() {
        List<EmployeeEntity> employees = (List<EmployeeEntity>) employeeRepository.findAll();
        return employees;
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
