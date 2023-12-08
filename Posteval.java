import java.util.Stack;

public class Posteval {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        String s="45+2*3/";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i)-'0');
            }
            else{
                int op2=st.peek();
                st.pop();
                int op1=st.peek();
                st.pop();
    
                switch (s.charAt(i))
                {
                case '+':
                    st.push(op1+op2);
                    break;
                case '-':
                    st.push(op1-op2);
                    break;
                case '*':
                    st.push(op1*op2);
                    break;
                case '/':
                    st.push(op1/op2);
                    break;
                // case '^':
                //     st.push(pow(op1,op2));
                //     break;
                }
            }
        }
        System.out.println(st.peek());
    }
}
