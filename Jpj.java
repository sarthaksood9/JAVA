public class Jpj {
    public static void main(String[] args){
        // int nums[]={1,1,1,2,2,3};
        // int nums[]={1,1,1,1,2,2,3};
        int nums[]={0,0,1,1,1,1,2,3,3};
        // nums=int 
        int c=0;
        int gc=0;
        int l=1;
        int ac=0;
        int i=0;
        while(i<nums.length){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ac++;
                    gc++;
                    if(c<2){
                        c++;
                        l++;
                    }
                    if(gc>=2){
                        int tx=l-1;
                        for(int h=2;h<ac;h++){
                            for(int k=tx;k<nums.length-1;k++){
                                nums[k]=-99;
                                int temp=nums[k];
                                nums[k]=nums[k+1];
                                nums[k+1]=temp;
                            }
                            // tx++;
                        }
                    }
                    

                    // else if(ac>2) {
                    //     int tx=l-1;
                    //     int tx1=l;
                    //     // tx=tx-1;
                    //     while(nums[tx]==nums[j]){
                    //         for(int k=tx1;k<nums.length-1;k++){
                    //             nums[k]=-99;
                    //             int temp=nums[k];
                    //             nums[k]=nums[k+1];
                    //             nums[k+1]=temp;
                    //         }
                    //         tx++;
                    //     }
                    // }

                    // else if(ac>2){
                    //     for(int k=l-1;k<nums.length-1;k++){
                    //         nums[k]=-99;
                    //         int temp=nums[k];
                    //         nums[k]=nums[k+1];
                    //         nums[k+1]=temp;
                    //     } 
                    // }


                    // else{
                    //     for(int k=j;k<nums.length-1;k++){
                    //     int temp=nums[k];
                    //     nums[k]=nums[k+1];
                    //     nums[k+1]=temp;
                    //     }
                    // }
                }
                // System.out.print("ji");
            }
            c=0;
            i=ac-1;
            // ac=0;
            gc=0;
            // ac=0;
        }
        // for(int y=0;y<)
        System.out.println(l);
        for(int f=0;f<nums.length;f++){
            System.out.print(nums[f]);
        }
    }
}
