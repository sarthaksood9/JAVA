import java.util.Scanner;
import java.util.*;

public class Sumoftrimplet {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]==arr[k] || arr[i]+arr[k]==arr[j] || arr[j]+arr[k]==arr[i] ){
                        count++;
                    }
                }
                
            }
        }
        System.out.println(count);
    }
}
