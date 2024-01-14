public class BreakExample
{
   public static void main(String args[])
   {
      int [] integers = {30, 60, 70, 87, 97};
      for(int i : integers ) {
         if( i == 70 ) {
            break;
         }
         System.out.println("printing "+ i );
 
      }
   }
}