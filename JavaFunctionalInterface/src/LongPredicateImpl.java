
import java.util.function.LongPredicate;

public class LongPredicateImpl {
	
	
	
	  public static void main(String[] args) {
		    LongPredicate longPredicate = (l) -> l>4;
		    
		    System.out.println(longPredicate.test(Long.MAX_VALUE));
		    
		    System.out.println(longPredicate.test(Long.MIN_VALUE));
		  }

}
