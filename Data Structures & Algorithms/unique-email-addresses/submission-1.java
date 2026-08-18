class Solution {
    public int numUniqueEmails(String[] emails) {
        int i,c=0,n=emails.length;
        HashSet<String> set = new HashSet<>();
        for(i=0;i<n;i++ ){
            StringBuffer s = new StringBuffer(emails[i]);
            int dot = s.lastIndexOf(".");
            int last = s.indexOf("@");
            int plus = s.indexOf("+");
            if(s.indexOf("+")!=-1){
                s.delete(s.indexOf("+"),s.indexOf("@"));
            }
            while(s.indexOf(".")<s.indexOf("@")){
                s.deleteCharAt(s.indexOf("."));
            }
            System.out.println(s);
            set.add(String.valueOf(s));
        }
        return set.size();
    }
}