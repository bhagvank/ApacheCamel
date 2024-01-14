import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class ArrayReverse {

    public static Object[] invertUsingGuava(Object[] array) {
        List<Object> list = Arrays.asList(array);
        List<Object> reversed = Lists.reverse(list);
        return reversed.toArray();
    }

    public static void main(String[] args) {
        String[] typesOfInsurance = {"John", "Rose", "Peter"};
        System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) );
        Object[] listOfProducts = invertUsingGuava(typesOfInsurance);
        System.out.println("array after reverse: " + Arrays.toString(listOfProducts) );
    }
}