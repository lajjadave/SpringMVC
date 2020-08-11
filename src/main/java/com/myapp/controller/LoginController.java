package com.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapp.model.Employee;
import com.myapp.service.CustomerService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/login")
	public String login() {
		
		return "welcomeEmployee.jsp";
	}
	
	@GetMapping("/signup")
	public String signUp(Employee emp, Model model) {
		model.addAttribute("emp", emp);
		return "registration.jsp";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("emp") Employee emp) {
		customerService.addEmployee(emp);
		return "welcomeEmployee.jsp";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest req, Model model) {
		int emp = Integer.parseInt(req.getParameter("empId"));
		Employee employee = customerService.updateEmployee(emp);
		model.addAttribute("e", employee);
		System.out.println(emp + "86986896");
		return "update.jsp";
	}
	
	@PostMapping("/saveUpdate")
	public String saveUpdate(@ModelAttribute("emp") Employee emp) {
		customerService.addEmployee(emp);
		return "redirect:index.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest req, Model model) {
		int emp = Integer.parseInt(req.getParameter("empId"));
		customerService.deleteEmployee(emp);
//		model.addAttribute("e", employee);
//		System.out.println(emp + "86986896");
		return "redirect:index.jsp";
	}
	
	@GetMapping("/list")
	public String listEmployees(Model model) {
		System.out.println("here");
		List<Employee> employees = customerService.listAllEmployees();
		model.addAttribute("employees", employees);
		return "listEmployees.jsp";
	}
	
	
}
