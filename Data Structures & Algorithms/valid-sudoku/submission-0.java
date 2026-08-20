class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] box = new boolean[9][10];

        int i,j,x,bx;

        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                x=board[i][j]-'0';

                bx = (i/3)*3+(j/3);

                if(rows[i][x]||cols[j][x]||box[bx][x]){
                    return false;
                }
                rows[i][x] = true;
                cols[j][x] = true;
                box[bx][x] = true;
                
            }
        }
        return true;
    }
}
