import java.util.*;

public class SumOfAllCommVov {

    static int fact(int i){
        if(i==1){
            return 1;
        }
        else{
            return(i*(fact(i-1)));
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String ss=sc.next();
        String ss2=sc.next();

        Set<Character> arr=new HashSet<>();

        int sum=0;

        for(int i=0;i<ss.length();i++){
            for(int j=i;j<ss2.length();j++){
                if(ss.charAt(i)==ss2.charAt(j) && ((ss.charAt(i)=='a' || ss.charAt(i)=='e' || ss.charAt(i)=='i' || ss.charAt(i)=='o' || ss.charAt(i)=='u') || (ss.charAt(i)=='A' || ss.charAt(i)=='E' || ss.charAt(i)=='I' || ss.charAt(i)=='O' || ss.charAt(i)=='U'))){
                    char cm=ss.charAt(i);
                    
                    arr.add(cm);
                }
            }
        }


        for(Character i:arr){
            sum=(sum+i)-96;
        }

        if(arr.isEmpty()){
            System.out.println(-1);
        }
        else{
            int x=fact(sum);
            System.out.println(x);
        }
        
    }
}
