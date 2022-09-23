package co.gov.mintic.cartera.services;

import co.gov.mintic.cartera.entities.EmployeeEntity;

import java.util.List;

public interface IEmployeeService {
    public EmployeeEntity findById(int id);

    public List<EmployeeEntity> findAll();

    public EmployeeEntity createEmployee(EmployeeEntity employee);

    public EmployeeEntity updateEmployee(EmployeeEntity employee);

    public void deleteEmployee(long id);
}
