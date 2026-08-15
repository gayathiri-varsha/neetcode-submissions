class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length,i,j;
        List<String> lst= new ArrayList<>();
        for(i=0;i<n-1;i++){
            if(words[i].equals("*")){
                    continue;
                }
            for(j=i+1;j<n;j++){
                
                
                if(words[j].contains(words[i])  ){
                    lst.add(words[i]);
                    words[i]="*";
                    break;
                }else if(words[i].contains(words[j])){
                    lst.add(words[j]);
                    System.out.print(words[i] + " ");
                    words[j]="*";
                    
                }
            }
            
        }
        return lst;
    }
}