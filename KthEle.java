// import java.util.ArrayList;
// import java.util.Scanner;
import java.util.*;

public class KthEle{
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while(n!=-1){
            n=sc.nextInt(); 
            arr.add(n);
        }
        int k=sc.nextInt();
        int gg=arr.size()-k+1;
        System.out.println(gg);

    }
}