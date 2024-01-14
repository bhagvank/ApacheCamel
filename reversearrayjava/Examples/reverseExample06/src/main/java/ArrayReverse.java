import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayReverse {

    public static Object[] invertUsingApacheCommonsLang(Object[] array) {
         ArrayUtils.reverse(array);
        return array;
    }

    public static void main(String[] args) {
        String[] typesOfInsurance = {"John", "Rose", "Peter"};
        System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) );
        Object[] listOfProducts = invertUsingApacheCommonsLang(typesOfInsurance);
        System.out.println("array after reverse: " + Arrays.toString(listOfProducts) );
    }

}