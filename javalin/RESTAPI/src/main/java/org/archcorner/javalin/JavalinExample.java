package org.archcorner.javalin;

import org.archcorner.javalin.Customer.CustomerController;
import io.javalin.Javalin;

public class JavalinExample {
    public static void main(String[] args) {
        Javalin example = Javalin.create()
                .port(7000)
                .start();

        example.get("/example", ctx -> ctx.html("This is a Javalin Example"));
        example.get("/customers", CustomerController.fetchAllCustomerNames);
        example.get("/customers/:id", CustomerController.fetchById);
    }
}
