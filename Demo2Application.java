package com.example.demo2;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bean.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImp;

@SpringBootApplication
public class Demo2Application {
	public static void main(String[] args) {
		
		double max=0;
		Employee employee1=new Employee();
		EmployeeService employeeService=new EmployeeServiceImp();
		for(Employee employee:employeeService.getEmployee()) {
			if(max <employee.getSalary()) {
				max=employee.getSalary();
				employee1=employee;
				
			}
		}
		System.out.println(max);
		System.out.println(employee1);
		
	}

	

}
