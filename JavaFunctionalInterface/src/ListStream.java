import java.util.stream.Collectors;
import java.util.*;

public class ListStream {


	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> listStream = Arrays.asList("David", "Thomas", "Bill", "Eric", "Ford");

		listStream.stream()
				  .filter(list -> list.startsWith("D"))
				  .collect(Collectors.toList()).forEach(System.out::println);


	}

}
