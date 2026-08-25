class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=1,n=numbers.length-1;
        
        while(i<n){
            j=numbers[i]+numbers[n];
            if(j<target){
                i++;
            }else if(j>target){
                n--;
            }else{
                return new int[]{i+1,n+1};
            }
        }
        // for(i=0;i<n;i++){
        //     for(j=i+1;j<n;j++){
        //         if(==target){
                    
        //         }
        //     }
        // }
        return new int[0];
    }
}
