package org.example.app;

import org.example.AppConfig;
import org.example.model.Customer;
import org.example.repository.CustomerRepositoryDB;
import org.example.repository.CustomerRepositoryStub;
import org.example.service.CustomerService;
import org.example.service.DefaultCustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = context.getBean("customerService",CustomerService.class);

//        CustomerRepositoryDB dbrepo = new CustomerRepositoryDB();
//        CustomerRepositoryStub stubrepo = new CustomerRepositoryStub();
//
//        DefaultCustomerService service = new DefaultCustomerService(stubrepo);
        List<Customer> customers = service.getAllCustomers();
////
       customers.forEach(System.out::println);

    }
}