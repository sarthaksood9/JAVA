import java.util.Stack;

public class InfixToPost {
    static int prec(char a){
        if(a=='^'){
            return 3;
        }
        else if(a=='*' || a=='/'){
            return 2;
        }
        else if(a=='+' || a=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Stack<Character> st=new Stack<>();
        String s="(a-b/c)*(a/k-l)";
        String rev="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                rev+=s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!st.empty() && st.peek()!='('){
                    rev+=st.peek();
                    st.pop();
                }
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                while(!st.empty() && prec(st.peek())>prec(s.charAt(i))){
                    rev+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            rev+=st.peek();
            st.pop();
        }
        System.out.println(rev);
    }
}
