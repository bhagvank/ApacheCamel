
import java.util.function.IntToDoubleFunction;

public class IntegerToDoubleTransform {

	public static void main(String[] args) {

		
		IntToDoubleFunction intToDoubFunction = (val) -> { return Math.cos(val);};
		
		System.out.println( intToDoubFunction.applyAsDouble(1));

	}

}
