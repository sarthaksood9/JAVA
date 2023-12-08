import java.util.*;
public class ReverseStringSB {

    public static String reverseWord(String s){
        String w[]=s.split(" ");
        String revWord="";
        for(String k:w){
            StringBuilder sb=new StringBuilder(k);
            sb.reverse();
            revWord+=sb.toString()+" ";
        }
        return revWord;
    }
    public static void main(String[] args){

        // StringBuilder sb=new StringBuilder("");
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        // System.out.println(d);
        System.out.println(reverseWord(d));

    }
}
