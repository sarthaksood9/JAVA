import java.util.Scanner;

public class splitByTwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        if(str.length()%2==0){
            for(int i=0;i<str.length();i+=2){
                    if(str.charAt(j)<str.charAt(j+1)){
                        System.out.print(str.charAt(i+1));
                    }
                    else{
                        System.out.print(str.charAt(i));
                    }
                }
                
            }
        }
        else{
            for(int i=0;i<str.length()-1;i+=2){
                    if(str.charAt(j)<str.charAt(j+1)){
                        System.out.print(str.charAt(i+1));
                    }
                    else{
                        System.out.print(str.charAt(i));
                    }
                }
            }
            System.out.println(str.charAt(str.length()-1));
        }
        
    }
}
