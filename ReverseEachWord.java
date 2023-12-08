import java.util.Scanner;
import java.util.*;
public class ReverseEachWord {
    static void rever(String s){
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				st.push(s.charAt(i));
			}
			else{
				while(!st.isEmpty()){
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		while(!st.isEmpty()){
			System.out.print(st.pop());
		}
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		rever(str);
	}
}
