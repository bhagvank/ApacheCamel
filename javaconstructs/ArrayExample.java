
public class ArrayExample
{
  public static void main(String args[])
  {
    
     int [] integers = {2,4,10,5,7,9};
    
     for(int i=0;i< integers.length;i++)
     {
        System.out.print("Array element "+ integers[i]);
     }
     
     
     int product =1;
     for(int i=0;i<integers.length;i++)
     {
       product = product * integers[i];
     }
     System.out.println("The product of array elements is "+ product);
  }
}