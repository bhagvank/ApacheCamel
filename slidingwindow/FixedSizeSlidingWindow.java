import java.util.LinkedList;
import java.util.Scanner;
 
public class FixedSizeSlidingWindow {
 
    static int[] sarr;
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
 
        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

        }
 
        System.out.println(" }");
 
        int slidingWindow = scanner.nextInt();
 
       algo(arr, slidingWindow);
 
    }
 
    public static void algo(int[] arr, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
 
        for (int i = 0; i < arr.length; i++) {
 
            while (!linkedList.isEmpty() && arr[linkedList.getLast()] <= arr[i]) {
                linkedList.removeLast();
            }
 

            while (!linkedList.isEmpty() && linkedList.getFirst() <= i - k) {
                linkedList.removeFirst();
            }
 
            linkedList.addLast(i);
 
            if(i >= k-1)
            {  

                System.out.print(" "+arr[linkedList.getFirst()]);
            }
 
        }
    }
}