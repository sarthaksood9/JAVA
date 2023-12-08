import java.util.Stack;

public class InvalidOper {
    
    public static void main(String[] args){
        int[] arr={0,0,1,0};
        Stack<Integer> st=new Stack<>();
        int j=0;

        try{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    st.push(i);
                }
                if(arr[i]==0){
                    st.pop();
                }
            }
        }
        catch(Exception e){
            j++;
        }
        if(j>0){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
        }
    }
}
