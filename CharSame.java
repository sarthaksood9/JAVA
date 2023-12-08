import java.util.Scanner;
import java.util.*;

// public class CharSame {
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         String str = ob.next();
//         int sum = 0;
//         for (int i = 0; i < str.length(); i++) {
//             int temp = 0;
// if (Character.isDigit(ch)) {
// int x = Character.getNumericValue(ch);
// temp = temp * 10 + x;
// }
// char chr = str.charAt(i);

// if (Character.isDigit(chr)) {
//     int count = 0;
//     for (int j = i; j < str.length(); j++) {
//         String ss = "";
//         char ch = str.charAt(j);
//         if (Character.isDigit(ch)) {
//             ss=ss+ch;
//             count++;
//         } else {
//             for (int a = 0; a < count; j++) {
//                 char fg=ss.charAt(a);
//                 int x = Character.getNumericValue(fg);
//                 temp = temp * 10 + x;

//             }
//             break;
//         }
//     }

// }
// sum = sum + temp;
// while(Character.isDigit(ch)){
// count++;
// }
// for(int j=0;j<count;j++){
// int x=Character.getNumericValue(ch);
// temp=temp*10+x;

// }

// }
// System.out.println(sum);

// }

// }
public class CharSame {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        // String string = ob.next();
        // int sum = 0;
        // String temp = "0";
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (Character.isDigit(ch)) {
        // temp = temp + ch;
        // // System.out.println(temp);
        // } else if(!Character.isDigit(ch) || i==str.length()-1){
        // sum = sum+Integer.parseInt(temp);
        // temp="0";
        // }
        // }
        // System.out.println(sum);
        // String str = "welcome to javatutorial on Java2blog jefej efjj";

        // int count = 1;

        // for (int i = 0; i < str.length() - 1; i++)
        // {
        // if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
        // {
        // count++;
        // }
        // }
        // System.out.println("Number of words in a string : " + count);
        // if (str == null || str.isEmpty()) {
        // System.out.println("no");
        // }
        // StringTokenizer tokens = new StringTokenizer(str);
        // System.out.println(tokens.countTokens());

        // int count=0;

        // char ch[]= new char[string.length()];
        // for(int i=0;i<string.length();i++)
        // {
        // ch[i]= string.charAt(i);
        // if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
        // count++;
        // }
        // System.out.println(count);

        String str = ob.nextLine();
 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == ' ' && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);

    }

}