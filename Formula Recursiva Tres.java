import java.util.Scanner;

public class Main {

    public static long f(int n) {
        if (n <= 5) {
            System.out.println(1); 
            return 1;
        } else {
            long valor = f(n - 2) * 5; 
            System.out.println(valor); 
            return valor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        f(n);

        scanner.close(); 
    }
}