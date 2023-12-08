import java.util.Scanner;

public class CountOfsubString {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Sub = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            // System.out.print(words[i]+" ");
            if (words[i].equals(Sub)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
