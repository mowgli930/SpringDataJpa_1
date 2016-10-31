package se.lemv.repository;

import org.springframework.data.repository.CrudRepository;

import se.lemv.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
