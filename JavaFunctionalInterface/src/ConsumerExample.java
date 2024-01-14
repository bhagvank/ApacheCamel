import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
	    consumer.accept("abcdefghij");

	}

}
