import java.util.Scanner;

public class SortarrIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[n];

        int count = 0;
        
        int max = 0;
        int mix = 0;
        for(int j=0;j<n;j++){
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    mix=i;
                }
            }
            arr2[j] = mix;
            arr[mix]=0;
            max=0;
            System.out.println(arr2[j]);
        }

    }
}
