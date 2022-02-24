package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultCustomerService implements CustomerService{

    private CustomerRepository repository;
    public DefaultCustomerService(CustomerRepository repository){
        this.repository = repository;
    }




    public List<Customer> getAllCustomers() {
        System.out.println(repository);
        return repository.findAll()
                .stream()
                .map(c -> new Customer(c.getId(),"########"+c.getName()+"####",c.getCity()))
        .collect(Collectors.toList());
    }

}