class Solution {
    public int removeElement(int[] nums, int val) {
        int i,c=0,k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i] != val){
                c++;
                nums[k++] = nums[i];
            }
        }
        return c;
    }
}