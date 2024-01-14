import java.util.stream.IntStream;

public class IntegerStreamSimple {
	
	
	
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		IntStream.range(1, 6).filter(i -> i % 2 != 0).forEach(System.out::println);


	}

}
