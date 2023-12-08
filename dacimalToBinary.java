import java.util.*;

public class dacimalToBinary {
    static void DecimalToBinary(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int t = n;
        while (t > 0) {
            int r = t % 2;
            t = t / 2;
            arr.add(r);
        }
        for (int f = arr.size()-1; f >=0; f--) {
            System.out.print(arr.get(f));
        }
    }

    public static void main(String[] args) {
        DecimalToBinary(18);

        // __________________________________________EASY WAY________________________________________

        // easy way to get Binary With only one Methord => "Integer.toBinaryString(val)"

        // System.out.print(Integer.toBinaryString(5));

    }
}
