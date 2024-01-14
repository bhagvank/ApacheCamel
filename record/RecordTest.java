public class RecordTest
{
   public static void main(String[] args)
   {
	   Customer customer = new Customer("George Smith", "201 Rosewood Street");
	   
	   System.out.println(customer.name() + " "+customer.address());
   }
}

record Customer (String name, String address) {}