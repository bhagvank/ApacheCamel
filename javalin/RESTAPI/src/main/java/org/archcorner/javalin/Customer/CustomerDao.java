package org.archcorner.javalin.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class CustomerDao {

    private final List<Customer> customers = Arrays.asList(
            new Customer(0, "George Smith",334872136),
            new Customer(1, "Tania Rogers",231872636),
            new Customer(2, "Carol Smith",431875136)
    );

    private static CustomerDao customerDao = null;

    private CustomerDao() {
    }

    static CustomerDao instance() {
        if (customerDao == null) {
            customerDao = new CustomerDao();
        }
        return customerDao;
    }

    Optional<Customer> getCustomerById(int id) { return customers.stream().filter(customer -> customer.id == id).findFirst(); }

    Iterable<String> getAllCustomerNames() {
        return customers.stream().map(customer -> customer.name).collect(Collectors.toList());
    }
}
