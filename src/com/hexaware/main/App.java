package com.hexaware.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.main.beans.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/hexaware/main/Beans.xml");
		Employee employee=(Employee)context.getBean("employee");
		
		employee.setId(1L);
		employee.setName("Harry potter");
		System.out.println(employee);
		((ClassPathXmlApplicationContext)context).close();
		
				
	}

}
