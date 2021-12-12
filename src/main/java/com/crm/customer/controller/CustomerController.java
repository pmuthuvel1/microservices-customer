package com.crm.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.customer.model.Customer;
import com.crm.customer.repo.CustomerRepo;

@RestController
@RequestMapping("customerapi")
public class CustomerController {

	@Autowired
    private CustomerRepo customerRepo;
	
	@GetMapping("findAll")
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

	@PostMapping("create")
    public Customer create(@RequestBody Customer customer) {
        return customerRepo.save(customer);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        customerRepo.deleteById(id);
    }

    @PutMapping("update/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        return customerRepo.save(customer);
    }
}
