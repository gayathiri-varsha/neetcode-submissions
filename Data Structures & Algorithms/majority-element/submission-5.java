class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int res=0,max=0;
        for(int i:nums){
            int count = map.merge(i,1,Integer::sum);
            if(count>nums.length/2){
               return i;
            }
        }
        System.out.println(map);
        // int[] count = new int[Integer.MAX_VALUE];
        // int max=0,res=0;
        // for(int i:nums){
        //     count[i]++;
        //     if(count[i]>max){
        //         max=count[i];
        //         res=i;
        //     }
        // }
        return res;
    }
}