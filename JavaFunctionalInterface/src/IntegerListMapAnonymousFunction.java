
import java.util.*;
import java.util.function.*;

public class IntegerListMapAnonymousFunction {

	public static void main(String[] args) {

List stringList = Arrays.asList("4","5","6");
            stringList.stream()
                   .map(new Function ()
                   {
             @Override
             public Integer apply(Object string) {
                 return Integer.parseInt(String.valueOf(string));
             }      
           }).forEach(stringInteger -> System.out.println("parsed integer: "+stringInteger));


	}

}
