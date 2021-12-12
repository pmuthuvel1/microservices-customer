package com.crm.customer.repo;

import com.crm.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
