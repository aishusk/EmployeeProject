package com.Employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> emp = new ArrayList<>(Arrays.asList(
			new Employee("1","Aishwarya"),
			new Employee("2","Ashu"),
			new Employee("3","Shrey"),
			new Employee("4","Samu")
			
			));
	
	
	public List<Employee> getEmployees()
	{
		return emp;
		
	}
	
	public Employee getEmployeeById(String id)
	{
	return emp.stream().filter(e->e.getId().equals(id)).findFirst().get();
	}
	
	public void addEmployee(Employee employee)
	{
		emp.add(employee);
	}

	public void updateEmployee(Employee employee, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<emp.size();i++)
		{
			Employee e = emp.get(i);
			if(id.equals(e.getId()))
			{
				emp.set(i, employee);
			}
			
		}
	}

	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		emp.removeIf(e->e.getId().equals(id));
	}
}
