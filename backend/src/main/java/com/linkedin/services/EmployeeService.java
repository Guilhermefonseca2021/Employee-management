package com.linkedin.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.linkedin.models.EmployeeModel;
import com.linkedin.repositories.EmployeeRepository;

public abstract class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired // Esta anotação é necessária para injetar o repositório
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeModel createEmployee(EmployeeModel employee) {
        EmployeeModel employeeModel = new EmployeeModel();
        BeanUtils.copyProperties(employee, employeeModel);
        employeeRepository.save(employeeModel);
        return employeeModel; 
    }

    
}
