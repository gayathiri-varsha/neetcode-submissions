class Solution {
    public int countSeniors(String[] details) {
        List<String> age = Arrays.stream(details).filter( s -> Integer.parseInt(s.substring(11,13))>60).toList();
        return age.size();
    }
}