package com.github.xronys.projects.springboot_rest.service;


import com.github.xronys.projects.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee>  getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
