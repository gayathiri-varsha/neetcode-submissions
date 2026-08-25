class Solution {
    int[] memo;
    public int climbStairs(int n) {
         memo = new int[n];
        Arrays.fill(memo,-1);
            return steps(n,0);
    }
        
        public int steps(int n,int i){
            if(i==n){
                return 1;
            }
            if(i>n){
                return 0;
            }
            if(memo[i]!=-1) return memo[i];
            
            return memo[i]= steps(n,i+1)+steps(n,i+2);
        }

    
}
