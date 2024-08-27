package com.si.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Customer;
import com.si.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	   CustomerRepository r1;


	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return r1.save(customer);
	}


	@Override
	public List<Customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return r1.findAll();
	}


	@Override
	public Customer fetchCustomerById(Long id) {
		// TODO Auto-generated method stub
		return r1.findById(id).get();
	}


	@Override
	public void deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		r1.deleteById(id);
		
	}


	@Override
	public Customer updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return r1.save(customer);
	}


	

}
