class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (char ch : control.toCharArray()) {
            if (ch == 'w') {
                n += 1;
            } else if (ch == 's') {
                n -= 1;
            } else if (ch == 'd') {
                n += 10;
            } else if (ch == 'a') {
                n -= 10;
            }
        }

        return n;
    }
}