class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("*").append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i =0;
        List<String> res = new ArrayList<>();
        while(i<str.length()){
            int deli = str.indexOf('*',i);
            System.out.println("deli:"+deli);
            int length = Integer.parseInt(str.substring(i,deli));
            i=deli+1;
            System.out.println("length:"+length);
            res.add(str.substring(i,i+length));
            i+=length;
            System.out.println("i-->"+i);
        }
    return res;
    }
}
