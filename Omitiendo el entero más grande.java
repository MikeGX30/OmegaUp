import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] != max) {
                count++;
            }
        }

        System.out.println(count);
        for (int i = 0; i < N; i++) {
            if (arr[i] != max) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        scanner.close(); 
    }
}