package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Customer;
import com.si.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService s1;
	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		
		return s1.save(customer);
	}
	@GetMapping("/customer")
    public List<Customer> fetchDepartmentList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return s1.fetchCustomerList();
    }
	 @GetMapping("/customer/{id}")
	    public Customer fetchCustomerById(@PathVariable("id") Long id)
	            {
	        return s1.fetchCustomerById(id);
	    }
	 @DeleteMapping("/customer/{id}")
	    public String deleteCustomerById(@PathVariable("id") Long id) {
	        s1.deleteCustomerById(id);
	        return "Customer deleted Successfully!!";
	    }
	 @PutMapping("/customer/{id}")
	   public Customer updateCustomerDetails(@RequestBody Customer customer) {
	       return s1.updateCustomerDetails(customer);
	   }


	
	
	

}
