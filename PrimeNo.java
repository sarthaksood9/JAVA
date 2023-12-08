import java.util.*;
public class PrimeNo {
    public static void main(String[] args){
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int m=n/2;
        boolean flag=false;
        if(n==0 || n==1){
            flag=true;
        }
        else {
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    flag=true;
                    break;
                }
                
            }
        }
        if(!flag){
            System.out.println("yessssssssss");
        }
        else{
            System.out.println("no");
        }

    }
}
