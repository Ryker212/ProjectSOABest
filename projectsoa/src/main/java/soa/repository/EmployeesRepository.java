package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import soa.model.Employees;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
