import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
        
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}