package org.archcorner.javalin.Customer;

import io.javalin.Handler;

import java.util.Objects;

public class CustomerController {
    public static Handler fetchAllCustomerNames = ctx -> {
        CustomerDao dao = CustomerDao.instance();
        Iterable<String> allCustomers = dao.getAllCustomerNames();
        ctx.json(allCustomers);
    };

    public static Handler fetchById = ctx -> {
        int id = Integer.parseInt(Objects.requireNonNull(ctx.param("id")));
        CustomerDao dao = CustomerDao.instance();
        Customer customer = dao.getCustomerById(id).get();
        if (customer == null) {
            ctx.html("Not Found");
        } else {
            ctx.json(customer);
        }
    };
}
