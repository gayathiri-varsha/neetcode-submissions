class Solution {
    public int maxDifference(String s) {
        int j,x,k=0, n=s.length(),max=0,min=Integer.MAX_VALUE;
        int[] count = new int[27];


        for(char i:s.toCharArray()){
            x=i-'a';
            count[x]++;

            // j=count[x];
            // if( j>max){
            //     max=j;
            //     System.out.println("max"+max);
            // }
            // if(x%2==0 && (j<min ||x==k)){
            //     min=j;
            //     k=x;
            //     System.out.println("min"+min);
            // }
        }
        System.out.println("count : "+Arrays.toString(count));

        for(int p:count){
            if(p>max && p%2!=0){
                max=p;
                System.out.println("max"+max);
            }
            if(p<min && p%2==0 && p!=0){
                min =p;
                System.out.println("min"+min);
            }
        }
                System.out.println("max :"+max +"  min : "+min);

        return max-min;
    }
}