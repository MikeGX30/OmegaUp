import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n / 2; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i] + arr[n - 1 - i]);
        }
        
        System.out.println();
        scanner.close();
    }
}