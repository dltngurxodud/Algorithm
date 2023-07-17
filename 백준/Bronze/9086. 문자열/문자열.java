import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String arr[] = new String[T];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j].substring(0, 1));
            System.out.println(arr[j].substring(arr[j].length() -1));
        }
    }
}