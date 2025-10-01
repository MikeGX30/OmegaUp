import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        if (p == 0) {
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        } else if (p == 1) {
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
} 