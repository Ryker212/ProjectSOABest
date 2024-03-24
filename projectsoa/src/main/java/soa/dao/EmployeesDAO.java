package soa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.Employees;
import soa.repository.EmployeesRepository;

@Service
public class EmployeesDAO {

	@Autowired
	private EmployeesRepository employeesRepository;
	
	public List<Employees> findAll(){
		return (List<Employees>) employeesRepository.findAll();
	}
	
	public Employees findByID(int i) {
		return employeesRepository.findById(i).get();
	}
	
	public Employees add(Map<String, String> body) {
		String username = body.get("username");
		String pass = body.get("pass");
		String name = body.get("name");
		String position = body.get("position");
		Employees newEmplyees = new Employees(username, position, name, pass);
		return employeesRepository.save(newEmplyees);
	}
	public Employees login(Map<String, String> body) {
		String username = body.get("username");
		String pass = body.get("pass");
		Integer i = null;
		List<Employees> employeesList = findAll();
		
		
		for (Employees employees : employeesList) {
			if (employees.getUsername().equalsIgnoreCase(username) && employees.getPass().equals(pass)) {
				i = employees.getId();
				return employeesRepository.findById(i).get();
			}
		}
		return null;
	}
}
