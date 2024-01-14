import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReverse {

    static Object[] invertUsingStreams(Object[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
    }

    public static void main(String[] args) {
        String[] typesOfInsurance = {"Cherry", "Pineapple", "Melon"};
        System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) );
        Object[] listOfProducts = invertUsingStreams(typesOfInsurance);
        System.out.println("array after reverse: " + Arrays.toString(listOfProducts) );
    }
}
