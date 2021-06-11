package com.hexaware.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexaware.main.beans.Account;
import com.hexaware.main.beans.Employee;

import com.hexaware.main.beans.User;
import com.hexaware.main.model.DBConfig;
import com.hexaware.main.service.EmployeeService;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private Account account;
	@Autowired
	private User user;

	
	@Autowired
	private DBConfig db;
	
	@RequestMapping("/")
	public String showHome(Model model) {// dependency injection
		//go to service layer and fetch list of employees
		List<Employee> list=employeeService.fetchAllEmployee();
		//to pass data from ctrl to jsp we use Model Interface
		model.addAttribute("list",list);
		return "index"; 
	}
	@RequestMapping("/project")
	public String showWelcome() {
		return "project";
	}
	@RequestMapping("/login")
	public String showLogin(Model model) {
		model.addAttribute("user",user);
		model.addAttribute("msg","");
		return "login";
	}
	@RequestMapping("/account")
	public String showAccount(Model model) {
		model.addAttribute("account",account);
		return "account";
	}
	@RequestMapping("/process-signup")
	public String processLogin(@Valid User user,BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("msg","");
			return "login";
		}
		//DBConfig and insert
		
		int status=db.addUser(user);
		if(status==1) {
			model.addAttribute("msg","Signup success,Pls login!!");
			return "login";
		}
		return "login";
	}
	@RequestMapping("/process-login")
	public String Login(@Valid User user1,BindingResult result,
			Model model) {
		
		db.processLogin(user1);
		return "welcome";
		
			
		
	}
	@RequestMapping("/create-account")
	public String processAccount(@Valid Account account,BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("msg","");
			return "login";
		}
		//DBConfig and insert
		
		int status=db.addAccount(account);
		if(status==1) {
			model.addAttribute("msg","Account created successfully!!");
			return "welcome";
		}
		return "login";
	}
	@RequestMapping("/fetch-account")
	public String getAllAccounts(Model model) {
		List<Account> account=db.getAllAccounts();
		model.addAttribute("account",account);
		return "fetch-account";

	}
	@RequestMapping("/users")
	public String getAllUsers(Model model) {
		List<User> user=db.getAllUsers();
		model.addAttribute("user",user);
		return "users";

	}


}
