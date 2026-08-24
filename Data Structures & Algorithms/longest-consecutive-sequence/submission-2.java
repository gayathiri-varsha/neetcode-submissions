class Solution {
    public int longestConsecutive(int[] nums) {
        
        int i,j,max=0,c=1;

        
        if(nums.length ==1 ||nums.length==0){
            return nums.length;
        }
        Arrays.sort(nums);

        for(i=0;i<nums.length-1;i++){
            int x=nums[i+1] - nums[i];
            if(x==1){
                c++;

            }else if(x==0){
                continue;
            }else{
                if(c>max){
                    max=c;
                }
                c=1;
            }

        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
