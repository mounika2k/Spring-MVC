package com.hexaware.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.main.beans.Employee;

@Service
public class EmployeeService {
	
	List<Employee> list;
	public EmployeeService() {
		list= new ArrayList<Employee>();
		Employee e1=new Employee(1L,"Harry",1343098D);
		list.add(e1);
		e1=new Employee(2L,"Roy Wesley",1343098D);
		list.add(e1);
		e1=new Employee(3L,"Peter Parker",1343098D);
		list.add(e1);
		
	}
	public List<Employee> fetchAllEmployee(){
		return this.list;
	}

}
