import java.util.function.*;
public class ComposeFunction {

	public static void main(String[] args) {
		
		Function<Integer, String> intToString = Object::toString;
		Function<String, String> perc = str ->  str + "%";
		 
		Function<Integer, String> addPercentage = perc.compose(intToString);
		 
		System.out.println(addPercentage.apply(6));

	}

}
