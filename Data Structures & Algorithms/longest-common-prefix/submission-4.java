class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length,i,j,c=0;
        int min=Integer.MAX_VALUE;
        String mini ="",minres="";
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int k=Arrays.mismatch(strs[i].toCharArray(),strs[j].toCharArray());
                if(k==-1){
                    mini=strs[i];
                }else{
                mini=strs[i].substring(0,k);
                }
            }
            if(mini.length() < min){
                min = mini.length();
                minres=mini;
            }
        }
        return minres;


        //     m=strs[i].length();
        //     if(m<min){
        //         min=m;
        //         mini = strs[i];
        //     }
        // }


    }
}