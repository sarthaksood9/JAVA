import java.util.Scanner;

public class HighestNo {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        int secMax=0;
        for(int i=maxindex+1;i<n;i++){
            if(arr[i]>secMax){
                secMax=arr[i];
            }
        }
        int apt;
        apt=max-secMax;
        int secmaxindex=maxindex+1;

        System.out.println(apt);

        int arrNew[]=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++){

            if(i==maxindex){
                arrNew[i]=secMax;
                count++;
                // continue;
            }
            else if(i==secmaxindex){
                arrNew[i]=apt;
                // System.out.println(apt);        
                // continue;
            }
            else{
                arrNew[i]=arr[count];
                count++;
            }

            
        }
        
        System.out.println();
        for(int i=0;i<=n;i++){
            System.out.println(arrNew[i]);        
        }

        // System.out.println(secMax);
        

    }    
}
