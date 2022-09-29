package co.com.mintic.proyecto4.cartera.services;

import co.com.mintic.proyecto4.cartera.entities.EmployeeEntity;

import java.util.List;

public interface IEmployeeService {
    public EmployeeEntity findById(int id);

    public List<EmployeeEntity> findAll();

    public EmployeeEntity createEmployee(EmployeeEntity employee);

    public EmployeeEntity updateEmployee(EmployeeEntity employee);

    public void deleteEmployee(long id);
}
