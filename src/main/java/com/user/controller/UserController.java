package com.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.entity.Customer;
import com.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/signUp")
	public void signUp(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String userEmail = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		
		List<Customer> customers = service.signUp(userEmail, userPassword);
		
		req.setAttribute("customers", customers);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
	
	@RequestMapping("/manageUser")
	public void saveUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String customerName = req.getParameter("customerName");
		String customerEmail = req.getParameter("customerEmail");
		int customerAge = Integer.parseInt(req.getParameter("customerAge"));
		String customerAddress = req.getParameter("customerAddress");
		
		List<Customer> customers = service.saveCustomer(customerName, customerEmail, customerAge, customerAddress);
		
		req.setAttribute("customers", customers);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
	
	@RequestMapping("/updateCustomer")
	public void updateCustomer(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(req.getParameter("customerId"));
		
		Customer customer = service.findCustomer(customerId);
		
		req.setAttribute("customer", customer);
		RequestDispatcher rd = req.getRequestDispatcher("updateCustomer.jsp");
		rd.forward(req, res);
	}
	
	@RequestMapping("/deleteCustomer")
	public void deleteCustomer(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(req.getParameter("customerId"));
		
		List<Customer> customers = service.deleteCustomer(customerId);
		
		req.setAttribute("customers", customers);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
	
	@RequestMapping("/updateUser")
	public void updateUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(req.getParameter("customerId"));
		String customerName = req.getParameter("customerName");
		String customerEmail = req.getParameter("customerEmail");
		int customerAge = Integer.parseInt(req.getParameter("customerAge"));
		String customerAddress = req.getParameter("customerAddress");
		
		List<Customer> customers = service.updateCustomer(customerId, customerName, customerEmail, customerAge, customerAddress);
		
		req.setAttribute("customers", customers);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
}














