public class Customer {

    private final String name;
    private final String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Customer)) {
            return false;
        } else {
            Customer other = (Customer) obj;
            return Objects.equals(name, other.name)
              &amp;&amp; Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", address=" + address + "]";
    }

    
   
    public String getName() { return name; }
 
    

    public String getAddress() { return address; }
}