class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = String.valueOf(a);
        String str1 = String.valueOf(b);
        
        String result = str + str1;
        int result1 = 2 * a * b;
        
        int c = Integer.valueOf(result);
        int d = result1;
        
        if (c > d) {
            return c;
        } else if (d > c) {
            return d;
        } else {
            return c;
        }
        

    }
}