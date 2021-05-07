package mj.empdir.employeedirectory.dao;

import java.util.List;
import mj.empdir.employeedirectory.modal.Employee;

public interface EmployeeDAO {

	 List<Employee> get();
	 
	 Employee get(int id);
	 
	 void save(Employee employee);
	 
	 void delete(int id);
	
	
	
}
