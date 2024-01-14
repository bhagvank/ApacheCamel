public class EncapsulationExample {

   public static void main(String args[]) {
      Employee employee = new Employee();
      employee.setName("Steve Smith");
      employee.setAge(32);
      employee.setId("243243");

      System.out.println("Name : " + employee.getName() + " Age : " + employee.getAge()+ " Id : " + employee.getId());
   }
}