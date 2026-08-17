class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
        
        //  List<List<String>> res = new ArrayList<>();
        // for(int i=0;i<strs.length;i++){
        //     List<String> ann = new ArrayList<>();
        //     int flag =0;
        //     if(strs[i].equals("*")){
        //         // System.out.print("---"+i+"---\n");
        //         continue;
        //     }
        //     char[] a = strs[i].toCharArray();
        //     Arrays.sort(a);
        //     for(int j=i;j<strs.length;j++){
        //         char[] b = strs[j].toCharArray();
        //         Arrays.sort(b);
        //         if(Arrays.equals(a,b)){
        //             // if(flag==0){
        //             //     ann.add(String.valueOf(a));
        //             //     flag=1;
        //             // }
        //             // System.out.print(String.valueOf(a)+" "+String.valueOf(b)+"\n");
        //             ann.add(strs[j]);
        //             strs[j]="*";
        //         }

        //     }
        //     // if(flag==0){
        //     //     ann.add(String.valueOf(a));
        //     // }
        //     res.add(ann);
        //     // ann.clear();
        // }
        // return res;
    }
}
