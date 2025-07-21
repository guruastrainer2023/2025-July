package com.training.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.EmployeeManagement;

public class Main08 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeManagement employeeManagement=
				(EmployeeManagement) context.getBean("empManagementBean");
		
		System.out.println(employeeManagement);
		
		context.close();
		

	}

}
