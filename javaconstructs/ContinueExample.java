public class ContinueExample
{
   public static void main(String args[])
   {
      int [] integers = {13, 21, 54, 80, 90};
      for(int i : integers ) {
         if( i == 80 ) {
            continue;
         }
         System.out.println( "priniting "+ i );

      }
   }
}