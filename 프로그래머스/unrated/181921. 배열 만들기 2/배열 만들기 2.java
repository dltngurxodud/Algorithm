import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(i)) {
                result.add(i);
            }
        }
        
        if (result.isEmpty()) {
            return new int[] {-1};
        } else {
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
    
    private boolean isZeroOrFive(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}