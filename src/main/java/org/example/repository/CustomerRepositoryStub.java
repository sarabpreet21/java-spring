package org.example.repository;
import java.util.List;
import org.example.model.Customer;

import static java.util.Arrays.asList;

public class CustomerRepositoryStub implements CustomerRepository {
    public List<Customer> findAll(){
        return asList(
                new Customer("1","Brijesh","New Delhi"),
                new Customer("2","Sarabpreet","New Delhi"),
                new Customer("3","Aryan","New Delhi")
        );
    }
}
