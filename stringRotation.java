import java.util.Scanner;

public class stringRotation {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        n=sc.nextInt();
        String[]arr=s.split(" ");
        int min=0;
        int max=0;
        int jj=0;
        for(int i=0;i<arr.length;i++){
            if(jj<arr[i].length()){
                jj=arr[i].length();
            }
        }
        System.out.println(jj);

    }
}
