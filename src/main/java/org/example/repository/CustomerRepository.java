package org.example.repository;

import org.example.model.Customer;

import java.util.List;
import org.example.model.Customer;
public interface CustomerRepository {

    public List<Customer> findAll();
}


//import org.example.model.Customer;


//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface CustomerRepository extends JpaRepository<Customer, Long> {

//}