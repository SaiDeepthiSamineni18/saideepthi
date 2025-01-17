package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Customer;
@Repository  
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
