import java.util.*;

public class BinaryToDecimal {
    static void BinaryToDacimalConer(int n) {
        int t = n;
        int d = 0;
        int i = 0;
        while (t > 0) {
            int r = t % 10;
            t = t / 10;
            d = d + r * (int) Math.pow(2, i++);
        }
        System.out.println(d);
    }

    public static void main(String[] args) {
        BinaryToDacimalConer(1011);

        // __________________________________________EASYWAY________________________________________

        // easy way to get decimal of binary With only one Methord => "Integer.parseInt("valInString",2)"

        // System.out.print(Integer.parseInt("1011",2));
    }
}
