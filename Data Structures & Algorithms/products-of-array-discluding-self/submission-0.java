class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod=1,i=1,zero=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                prod*=nums[i];
            }
        }
        if(zero>1){
            return res;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=prod;
            }else{
                if(zero==0)
                    res[i] = (prod/nums[i]);
                else
                    res[i]=0;
            }
        }
        return res;
    }
}  
