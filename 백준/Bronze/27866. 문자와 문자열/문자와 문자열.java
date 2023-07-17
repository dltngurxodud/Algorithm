import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        
        char[] chArr = a.toCharArray();
        
        for (int i = 0; i < chArr.length; i++){
            if (i + 1 == b){
                System.out.print(chArr[i]);
            }
        }
    }
}