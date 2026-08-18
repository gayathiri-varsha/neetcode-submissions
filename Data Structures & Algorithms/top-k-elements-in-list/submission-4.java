class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int max = 0,n=nums.length,i,j,p=0;
        int[] res = new int[k];
        Map<Integer,List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        Map<Integer,Integer> temp = new HashMap<>();
        for(Integer num:nums){
            int count = temp.merge(num,1,Integer::sum);

            map.computeIfAbsent(count,kk->new ArrayList<>()).add(num);
            if(count>1){
                map.get(count-1).remove(Integer.valueOf(num));
            }
        }
     
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            int c=entry.getValue().size();
            max=c;
            for(Integer l :entry.getValue()){
                res[p++]=l;
            }
            if(p==k){
                return res;
            }
        }
        return res;
    }
}






















        // Map<Integer,Integer> map = new HashMap<>();
        // Map<Integer,List<Integer>> m = new HashMap<>();


        // int i,n=nums.length,p=0;
        // List<Integer> list = new ArrayList<>();
        //  for(int num:nums){
        //     int count = map.merge(num,1,Integer::sum);
        //     if(count==k)
        //         list.add(num);
                // res[p++]=num;
            // }
        // for(i=0;i<n;i++){
           
        //     if(map.containsKey(nums[i])){
        //          map.put(nums[i],map.get(nums[i])+1);
        //     }else{
        //     map.put(nums[i],1);
        //     }

        //     if(map.get(nums[i]==k)){
        //         res[p++]=map.getKey();
        //     }
        // }
        // int[] res= new int[list.size()];
        // for(Integer l:list){
        //      res[p++]=l;

        // }
        // res=list.stream.mapToInt(Integer::intValue)

//         return res;
//     }
// }
