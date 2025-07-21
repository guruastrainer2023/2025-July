package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/emp")
	public ModelAndView f1() {
		ModelAndView mav=new ModelAndView("empOutput");
		Employee employee=
				new Employee(1001, "Kiran","Male", "Mumbai", 40000.00);
		mav.addObject("empl", employee);
		return mav;
	}
	
	@RequestMapping("/input")
	public ModelAndView f2() {
		ModelAndView mav=new ModelAndView("empInput");
		Employee employee=new Employee();
		mav.addObject("emp", employee);
		return mav;
	}
	
	@RequestMapping(value="/output",method = RequestMethod.POST)
	public String f3( @Valid  @ModelAttribute("emp") Employee employee, BindingResult result) {
		System.out.println(result.hasErrors());
		System.out.println(result.hasFieldErrors());
		if(result.hasErrors()) {
			System.out.println(result.hasErrors());
			return "empInput";
		}else {
			
			return "empOutput";
		}
		
		
	}
	
	@RequestMapping("/allemployees")
	public ModelAndView f4() {
		ModelAndView mav=new ModelAndView("empList");
		Employee employee1=new Employee(101, "Sundar", "Male", "Chennai", 12000.00);
		Employee employee2=new Employee(102, "Aditya", "Male", "Cochin", 22000.00);
		Employee employee3=new Employee(103, "Suman", "Male", "Bengaluru", 38000.00);
		Employee employee4=new Employee(104, "Syed", "Male", "Hyderabad", 11000.00);
		Employee employee5=new Employee(105, "Joshep", "Male", "Chennai", 24000.00);

		List<Employee> employees=new LinkedList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		mav.addObject("emps", employees);
		return mav;
		
	}
}
