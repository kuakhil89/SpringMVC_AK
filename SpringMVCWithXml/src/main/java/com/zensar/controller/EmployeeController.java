package com.zensar.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.beans.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/login")
	public String grtLoginPage(Model model)
	{
		//model.addAttribute("msg", "Employee Test Information");
		return "login";
		
	}
	
	/*@RequestMapping(value="/submitPage",method=RequestMethod.GET)
	public String submitLoginPage()
	{
		System.out.println("Ram");
		return "submitPage";
		
	}*/
	
	@RequestMapping(value="/addEmployeeInfo")
	public String getLoginPage(@ModelAttribute("emp") Employee employee)
	{
		System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" "+employee.getEmployeeSalary());
		
		return "login";
		
	}
	
	/*@RequestMapping(value="/submitPage",method=RequestMethod.POST)
	public String testLoginPage()
	{
		System.out.println("Seeta");
		return "submitPage";
		
	}*/
	
	/*@RequestMapping(value="/submitEmployeeInfo")
	public String submitLoginPage(@RequestParam("employeeId") int id,@RequestParam("employeeName") String name,@RequestParam("employeeSalary") int salary)
	{
		System.out.println(id+" "+name+" "+salary);
		System.out.println("Seeta");
		return "submitPage";
		
	}*/
	
	/*@RequestMapping(value="/submitEmployeeInfo",method=RequestMethod.POST)
	//@PostMapping("/submitEmployeeInfo")
	public ModelAndView submitLoginPage(@RequestParam(name="employeeId",defaultValue="10") int id,@RequestParam("employeeName") String name,@RequestParam("employeeSalary") int salary
			,@RequestParam("address.state") String state,@RequestParam("address.city") String city,@RequestParam("address.pinCode") int pinCode)
	{
		
		ModelAndView modelAndView=new ModelAndView("submitPage");
		Employee employee=new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employee.setEmployeeSalary(salary);
		
		Address  address=new Address();
		address.setCity(city);
		address.setState(state);
		address.setPinCode(pinCode);
		employee.setAddress(address);
		
		modelAndView.addObject("employee", employee);
		System.out.println(id+" "+name+" "+salary);
		System.out.println("Seeta");
		return modelAndView;
		
	}*/
	
	@RequestMapping(value="/submitEmployeeInfo",method=RequestMethod.POST)
	//@PostMapping("/submitEmployeeInfo")
	public String submitLoginPage(@Valid @ModelAttribute("employee")Employee employee/*,Model model*/,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "login";
		}
		
		System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" "+employee.getEmployeeSalary());
		
		//model.addAttribute("msg", "Employee Test Information");
		
		ModelAndView modelAndView=new ModelAndView("submitPage");
		/*Employee employee=new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employee.setEmployeeSalary(salary);
		
		Address  address=new Address();
		address.setCity(city);
		address.setState(state);
		address.setPinCode(pinCode);
		employee.setAddress(address);*/
		
		/*modelAndView.addObject("employee", employee);*/
		/*System.out.println(id+" "+name+" "+salary);
		System.out.println("Seeta");*/
		return "submitPage";
		
	}
	@ModelAttribute
	public void addCommonMessage(Model model)
	{
		model.addAttribute("msg", "Employee Test Information");
	}

}
