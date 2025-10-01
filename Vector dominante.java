import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
        b[i] = scanner.nextInt();
    }

    boolean cumple = true;
    for (int i = 0; i < n; i++) {
        if (a[i] <= b[i]) {
            cumple = false;
            break;
        }
    }

    if (cumple) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }
}


}