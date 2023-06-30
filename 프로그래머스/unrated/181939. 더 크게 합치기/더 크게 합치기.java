class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = String.valueOf(a);
        String str1 = String.valueOf(b);
        
        String result = str + str1; 
        String result1 = str1 + str; 
        
        int a1 = Integer.valueOf(result);
        int b1 = Integer.valueOf(result1);
        
        if (a1 > b1) {
            return a1;
        } else if (b1 > a1) {
            return b1;
        } else {
            return a1;
        }
        
    }
}