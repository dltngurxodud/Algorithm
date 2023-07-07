class Solution {
    public int solution(String number) {
        int answer = 0;
        int a = 0;

        for (char c : number.toCharArray()) {
            a += Character.getNumericValue(c);
            // 문자를 수자 값으로 반환하는 메서드. 그렇지 않을 경우 -1을 반환
        }
        answer = a % 9;

        return answer;
    }
}