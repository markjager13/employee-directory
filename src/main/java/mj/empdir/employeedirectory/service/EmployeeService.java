package mj.empdir.employeedirectory.service;

import java.util.List;
import mj.empdir.employeedirectory.modal.Employee;


public interface EmployeeService {
	
	List<Employee> get();
	 
	 Employee get(int id);
	 
	 void save(Employee employee);
	 
	 void delete(int id);

}
