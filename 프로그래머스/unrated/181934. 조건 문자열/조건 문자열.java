class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (ineq.equals("<")) {
            if (n < m) {
                return 1;
            } else if (eq.equals("!")) {
                return 0;
            }
        } 
        
        if (ineq.equals(">")) {
            if (n > m) {
                return 1;
            } else if (eq.equals("!")) {
                return 0;
            }
        }
        
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                if (n <= m) {
                    return 1;
                } else if (eq.equals("!")) {
                    return 0;
                }
            }
        }
        
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                if (n >= m) {
                    return 1;
                } else if (eq.equals("!")) {
                    return 0;
                }
            }
        }
        
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                if (n <= m) {
                    return 1;
                } else if (eq.equals("!")) {
                    return 0;
                }
            }
        }
        
        return answer;
    }
}