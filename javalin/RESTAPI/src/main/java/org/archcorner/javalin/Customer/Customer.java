package org.archcorner.javalin.Customer;

public class Customer {
    public final int id;
    public final String name;
	public final int ssn;

    public Customer(int id, String name, int ssn) {
        this.id = id;
        this.name = name;
		this.ssn = ssn;
    }
}
