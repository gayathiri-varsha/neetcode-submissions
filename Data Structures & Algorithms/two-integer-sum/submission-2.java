class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        // int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        // int k=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target && i!= j){
        //             res[0]=i;
        //             res[1]=j;
        //         }
        //     }
        // }
        // return res;
        return new int[]{0,0};
    }
}
