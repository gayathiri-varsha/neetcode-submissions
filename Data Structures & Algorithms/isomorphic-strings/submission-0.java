class Solution {
    public boolean isIsomorphic(String s, String t) {
        int index =0;
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            
                if( t.indexOf(t.charAt(i))!=s.indexOf(s.charAt(i))){
                    return false;
                }

            
        }
        return true;
       
    }
}