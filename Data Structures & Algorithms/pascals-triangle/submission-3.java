class Solution {
    public List<List<Integer>> generate(int numRows) {
     int i,j,c;
    List<List<Integer>> row = new ArrayList<>();
    row.add(List.of(1));
     for(i=1;i<numRows;i++){
        List<Integer> col = new ArrayList<>();
        for(j=0;j<=i;j++){
            if(j==0 || j==i){
                 col.add(1);
            }else{
            col.add(j,row.get(i-1).get(j-1) +row.get(i-1).get(j)) ;
        }
        }
        row.add(col);
     } 
     return row;  
    }
}