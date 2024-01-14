
import java.util.function.DoublePredicate;

public class DoublePredicateImpl {
	



	  public static void main(String[] args) {
	    DoublePredicate doublePredicate = (d) -> d > 2;

	    System.out.println(doublePredicate.test(2.56));
	    
	    System.out.println(doublePredicate.test(1.56));

	  }

}
