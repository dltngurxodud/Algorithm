import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = Character.getNumericValue(A.charAt(i));
            sum += num;
        }
        System.out.println(sum);
    }
}