import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReverse {

    public static void main(String[] args)
    {
        List colors = new ArrayList<>(
                Arrays.asList("100", "200", "300"));
        System.out.println("Before Reversing: " + colors);

        for (int i = 0, j = colors.size() - 1; i < j; i++) {
            colors.add(i, colors.remove(j));
        }

        System.out.println("After Reversing: " + colors);
    }
}