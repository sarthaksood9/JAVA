import java.util.Scanner;

public class LeftMostRep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean f=true;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    f=false;
                    break;
                }
            }
            if(f==false){
                break;
            }
        }
        if(f==true){
            System.out.println("-1");
        }
    }
}
