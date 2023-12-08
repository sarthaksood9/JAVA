public class Triplets {
    public static void main(String[] args){
        int[] arr={0,-1,2,-3,1};
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        c++;
                    }
                }
            }
        }
        // System.out.println(c);
        if(c>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
