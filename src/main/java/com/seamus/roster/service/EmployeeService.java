package com.seamus.roster.service;

import com.seamus.roster.data.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployee(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
