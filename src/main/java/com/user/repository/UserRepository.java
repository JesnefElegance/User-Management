package com.user.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.user.entity.Customer;
import com.user.entity.User;

@Repository
public class UserRepository {

	private Session getUserSession() {
		
		return new Configuration().configure()
				 				  .addAnnotatedClass(User.class)
				 				  .buildSessionFactory()
				 				  .openSession();
	}
	
	private Session getCustomerSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		return session;
	}
	
	public List<Customer> signUp(User u) {
		
		Session session = getUserSession();
		
		Transaction trans = session.beginTransaction();
		
		session.save(u);
		
		trans.commit();
		
		session.close();
		
		
		session = getCustomerSession();
		
		List<Customer> customers = findAll();
		
		session.close();
		
		return customers;
	}

	public List<Customer> saveCustomer(Customer c) {

		Session session = getCustomerSession();
		
		Transaction trans = session.beginTransaction();
		
		session.save(c);
		
		trans.commit();
		
		List<Customer> customers = findAll();
		
		session.close();
		
		session.close();
		return customers;
	}

	public Customer findCustomer(int customerId) {
		
		Session session = getCustomerSession();
		
		Customer customer = session.find(Customer.class, customerId);
		
		session.close();
		
		return customer;
	}

	public List<Customer> deleteCustomer(int customerId) {
		
		Session session = getCustomerSession();
		Transaction trans = session.beginTransaction();
		
		Customer customer = findCustomer(customerId);
		
		session.delete(customer);
		
		trans.commit();
		
		session.close();
		
		return findAll();
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> findAll() {
		
		Session session = getCustomerSession();
		List<Customer> customers = session.createQuery("from Customer").getResultList();
		session.close();
		
		return customers;
	}

	public List<Customer> updateCustomer(Customer c) {

		Session session = getCustomerSession();
		
		Transaction trans = session.beginTransaction();
		
		session.update(c);
		
		trans.commit();
		
		List<Customer> customers = findAll();
		
		session.close();
		
		return customers;
	}
}
