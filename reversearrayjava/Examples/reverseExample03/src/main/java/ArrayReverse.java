import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArrayReverse {

    public static void main(String args[])  {

        String[] assetClasses = {"Apple", "Banana", "Orange", "Grapes"};
        System.out.println("Array before reversing: " + Arrays.toString(assetClasses));
        ArrayUtils.reverse(assetClasses);
        System.out.println("Array after reversing: " + Arrays.toString(assetClasses));

    }

}