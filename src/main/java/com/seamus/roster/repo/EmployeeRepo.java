package com.seamus.roster.repo;

import com.seamus.roster.data.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
