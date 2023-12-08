import java.util.Scanner;
import java.util.*;

public class Changewithindices {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        int length=s.length();
        StringBuilder sb=new StringBuilder("");
         char c[]=new char[length];
       
        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);

        }
        sb.append(c);
        System.out.println(sb.toString());
    }
}
