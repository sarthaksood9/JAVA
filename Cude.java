import java.util.Scanner;
public class Cude {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int cb= (int) Math.cbrt(arr[i]);
            int t=arr[i]*arr[i]*arr[i];
            if(t==cb){
                System.out.println("element at" +i+"is a perfect cude");
            }
            else{
                System.out.println(t-cb);
            }
        }
    }
}
