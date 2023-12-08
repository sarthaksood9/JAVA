import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while (n >= 10) {
            int product = 1;
            while (n != 0) {
                product *= n % 10;
                n = n/10;
            }
            n = product;
            // count++;
            System.out.println(product);
        }
            // int x=27%10;
            // System.out.println(x);
            // x=x/10;
            // int y=x%10;
            // System.out.println(y);



    }
}
