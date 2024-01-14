
import java.util.*;

public class IntegerListMapFunction {

	public static void main(String[] args) {
		

      List<String> stringList = Arrays.asList("4","5","6");
            stringList.stream()
                   .map(integer -> Integer.parseInt(integer))
                   .forEach(stringInteger -> System.out.println("String changed to integer: "+stringInteger));


	}

}
