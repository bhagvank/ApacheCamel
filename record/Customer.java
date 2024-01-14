import java.util.Objects;
public record Customer(String name, String address) {
    public Customer {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

	public static void main(String[] args)
	{
	
		Customer customer = new Customer("George Smith", "201 Rosewood Street");
		System.out.println(customer.name() + " "+customer.address());
	}
}