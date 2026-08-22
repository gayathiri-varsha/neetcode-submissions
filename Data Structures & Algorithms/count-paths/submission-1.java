class Solution {
    int[][] memoization;
    public int uniquePaths(int m, int n) {
        memoization = new int[m][n];
        for(int[] it : memoization){
            Arrays.fill(it,-1);
        }
        return recursive(0,0,m,n);
    }
    public int recursive(int i,int j,int m,int n){
            if(i>=m || j>=n){
                return 0;
            }
            if(i==m-1 && j==n-1){
                return 1;
            }
            if(memoization[i][j] != -1){
                return memoization[i][j];
            }
            return memoization[i][j] = recursive(i+1,j,m,n)+recursive(i,j+1,m,n);
        }
    }

