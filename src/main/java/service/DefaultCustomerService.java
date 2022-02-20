package service;

import model.Customer;
import repository.CustomerRepositoryDB;

import java.util.List;

public class DefaultCustomerService {

    private CustomerRepositoryDB repository = new CustomerRepositoryDB();

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

}