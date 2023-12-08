import java.util.Scanner;
import java.util.Stack;

public class Palindrom {
    static String sta(String s) {
        Stack<Character> st = new Stack<Character>();
        StringBuilder sb = new StringBuilder("");
        char[] arr = new char[s.length()];
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st.push(s.charAt(i));
            } else {
                while (!st.isEmpty()) {
                    arr[c] = st.pop();
                    c++;
                }
                arr[c] = ' ';
                c++;
            }
        }

        while (!st.isEmpty()) {
            arr[c] = st.pop();
            c++;
        }

        sb.append(arr);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sta(str);
        System.out.println(sub);

        if (str.equals(sub)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}
