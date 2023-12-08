import java.util.*;

public class CheckNumInArrList {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // List<Integer> arr = new ArrayList<Integer>();
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     int x = sc.nextInt();
        //     arr.add(x);
        // }
        // int key = sc.nextInt();
        // int index = -1;
        // for (int i = 0; i < n; i++) {
        //     if (arr.get(i) == key) {
        //         index = i;
        //     }
        // }
        // System.out.println(index);
        try {
            // Your code that may throw an exception
            int x=220/0;
            System.out.println(x);
        } catch (Exception e) {
            String exceptionName = e.getClass().getSimpleName();
            System.out.println("Exception Name: " + exceptionName);
        }
        
    }
}
