package com.pankaj.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pankaj.demospring.entity.Customer;
import com.pankaj.demospring.entity.LoginParameter;
import com.pankaj.demospring.entity.User;
import com.pankaj.demospring.services.CustomerService;
import com.pankaj.demospring.services.UserService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String goToLoginPage(Model theModel) {
		LoginParameter theLogInParameter = new LoginParameter();
		theModel.addAttribute("parameters", theLogInParameter);
		return "login";
	}

	@RequestMapping("/register")
	public String goToRegisterPage(Model theModel)

	{
		User theUser = new User();
		theModel.addAttribute("user", theUser);

		return "registerForm";
	}

	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		// customerDAO = new CustomerDAOImpl();
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);

		return "list-customer";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		Customer theCustomer = customerService.getcustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int theId, Model theModel) {

		Customer theCustomer = customerService.getcustomer(theId);

		customerService.deleteCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User theUser, Model theModel) {
		userService.saveUser(theUser);
		theModel.addAttribute("parameters", theUser);

		return "login";
	}

	@PostMapping("/verifyCredentials")
	public String verifyCredentials(@ModelAttribute("parameters") LoginParameter loginParameter, Model theModel) {

		String userName = loginParameter.getUserName();
		String password = loginParameter.getPassword();
		boolean result = userService.verify(userName, password);
		theModel.addAttribute("parameters", loginParameter);
		if (result == true)
			return "redirect:/customer/list";
		else
			return "login";
	}
}
