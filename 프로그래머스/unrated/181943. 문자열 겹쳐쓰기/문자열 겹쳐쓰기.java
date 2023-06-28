class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String sub = my_string.substring(0, s);
        
        String sub2 = my_string.substring(s+overwrite_string.length());
        
        String sub1 = overwrite_string;
        
        return sub + sub1 + sub2 ;
    }
}