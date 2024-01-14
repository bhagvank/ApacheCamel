public class ExceptionExample{  
  public static void main(String args[]) throws Exception{  
  try{  
   int result=36/0;  
   System.out.println(" the result is "+result);  
  }  
  catch(ArithmeticException exception)
  {
    System.out.println(exception);
      
    throw new Exception("division by zero");  
  }  
  finally
  {
    System.out.println("finally block is executed at the end");}  
    System.out.println("code below is used for next steps");  
  }  
}