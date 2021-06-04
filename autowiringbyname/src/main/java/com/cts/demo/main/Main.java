package com.cts.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.demo.model.Address;
import com.cts.demo.model.Employee;

public class Main {

	public static void main(String[] args) {

    ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
	Employee employee=(Employee)  context.getBean("employee");
    System.out.println(employee.getId());
    Address add=employee.getAddress();
    System.out.println(add.getHno());	
	}

}
