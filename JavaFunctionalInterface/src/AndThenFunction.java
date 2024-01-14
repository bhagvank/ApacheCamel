
import java.util.function.*;

public class AndThenFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> product = (value) -> value * 4;
		Function<Integer, Integer> sum      = (value) -> value + 5;

		Function<Integer, Integer> productThenSum = product.andThen(sum);

		Integer result = productThenSum.apply(6);
		System.out.println(result);

	}

}
