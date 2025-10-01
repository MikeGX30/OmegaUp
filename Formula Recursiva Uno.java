import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if (n <= 5) {
            return 1;
        } else {
            return f(n - 2) * 5;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(f(n));
        scanner.close(); 
    }
}