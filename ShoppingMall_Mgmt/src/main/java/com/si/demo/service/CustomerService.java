package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Customer;

public interface CustomerService {

	Customer save(Customer customer);

	List<Customer> fetchCustomerList();

	Customer fetchCustomerById(Long id);

	void deleteCustomerById(Long id);

	Customer updateCustomerDetails(Customer customer);


}
