public class TypeCasting
{  
  public static void main(String[] args)  
  {  
   int x = 6;  
   long y = x;  
   float z = y;  
   System.out.println("Before conversion, integer value "+x);  
   System.out.println("After conversion, long value "+y);  
   System.out.println("After conversion, float value "+z);  
  
   double doub = 256.76;  
    
   long lon = (long)doub;  
   
   int intValue = (int)lon;  
   System.out.println("Before conversion: "+doub);  
    
   System.out.println("After conversion  long type: "+lon);  
 
   System.out.println("After conversion  int type: "+intValue); 
}  
}  