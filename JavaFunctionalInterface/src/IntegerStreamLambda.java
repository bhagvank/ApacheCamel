/**
 * IntegerStream Lambda Example
 */

import java.util.function.Predicate;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntegerStreamLambda {

	/**
	 * Default Constructor
	 */
	public IntegerStreamLambda() {
		
	}

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		IntStream integerStream = IntStream.of(1,2,3,4,5);
		integerStream.filter(val -> {
			if (val % 2 == 0)
				return false;
			return true;
                 
       }).forEach(System.out::println);


	}

}
