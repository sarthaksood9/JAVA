import java.util.Scanner;

public class CheckSubString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.contains(s2));
    }
}
