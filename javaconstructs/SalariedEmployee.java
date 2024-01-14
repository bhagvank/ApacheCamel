public class SalariedEmployee extends Employee {
   private double empSalary; 
   
   public SalariedEmployee(String name, String id, int age, double empSalary) {
      super(name, id, age);
      setEmpSalary(empSalary);
   }
   
   
   public double getEmpSalary() {
      return empSalary;
   }
   
   public void setEmpSalary(double empSalary) {
      if(empSalary >= 0.0) {
         this.empSalary = empSalary;
      }
   }
    
  public static void main(String[] args)
  {
      SalariedEmployee salarEmp = new SalariedEmployee("Steve Smith", "Sanjose, CA", 33, 56000.00);
      Employee emp = new SalariedEmployee("John Ray", "Dallas, TX", 43, 44000.00);
      
      System.out.println("Employee "+salarEmp.getName()+" salary " +salarEmp.getEmpSalary());
      
      System.out.println("Employee "+ emp.getName()+ " age "+ emp.getAge());
  }
}