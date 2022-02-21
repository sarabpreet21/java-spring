package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;

import java.util.List;

public class DefaultCustomerService {

    private CustomerRepositoryDB repository = new CustomerRepositoryDB();

    public List<Customer> getAllCustomers() {
        System.out.println(repository);
        return repository.findAll();
    }

}