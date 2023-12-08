import java.util.Scanner;

public class ReverseString {
    
        static void reversess(String str){
            String[] strArr=null;
            strArr=str.split(" ");
            for(int i=strArr.length-1;i>=0;i--){
                if(i>0){
                    System.out.print(strArr[i]+" ");
                }
                else{
                    System.out.print(strArr[i]);

                }
            }

        }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reversess(str);
    }
}



// import java.util.Scanner;
// public class Reversal {
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         String str = ob.next();
//         StringBuilder s = new StringBuilder(str);
//         s.reverse();
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             if(str.charAt(i)==s.charAt(i)){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }