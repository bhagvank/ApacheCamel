/**
 * BiPredicate Implementation
 */

import java.util.function.BiPredicate;
public class BiPredicateImpl {


	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (str1, str2) -> (!str1.equals(str2));

		System.out.println(biPredicate.test("Check", "Check"));
		System.out.println(biPredicate.test("Check", "Check1"));

	}

}
