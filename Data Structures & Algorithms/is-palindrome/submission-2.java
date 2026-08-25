class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("string: "+s);
       String r= new StringBuilder(s).reverse().toString();
       System.out.print("reverse: "+r);
       if(s.equalsIgnoreCase(r)){
            return true;
       }
       return false; 
    }
}
