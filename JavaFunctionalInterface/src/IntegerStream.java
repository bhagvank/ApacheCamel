/**
 *  IntegerStream class
 */

import java.util.function.Predicate;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class IntegerStream {

	public IntegerStream()
	{
		
	}
	
public static void main(String[] args) {
	

IntStream integerStream = IntStream.of(1,2,3,4,5);
integerStream.filter(new IntPredicate() {
 
           @Override
           public boolean test(int value) {
               if(value%2 == 0)
                   return false;
               return true;
           }
     }).forEach(System.out::println);

}
}
