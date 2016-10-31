package se.lemv.repository;

import org.springframework.data.repository.CrudRepository;

import se.lemv.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
