class Solution {
    public int countSeniors(String[] details) {
        int sum =0;
        // List<String> age = Arrays.stream(details).filter( s -> Integer.parseInt(s.substring(11,13))>60).toList();
        // return age.size();
        for(String s : details){
            int age = Integer.parseInt(s.substring(11,13)); 
            if(age>60){
                sum++;
            }
        }
        return sum;
    }
}