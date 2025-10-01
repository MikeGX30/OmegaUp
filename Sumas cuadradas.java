import java.util.*;

public class Main {
    static int N, K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        int resultado = contarFormas(N, K, 1);
        System.out.println(resultado);

        scanner.close(); 
    }

    static int contarFormas(int n, int k, int minBase) {
        if (k == 0) {
            return (n == 1) ? 1 : 0; 
        }
        if (n < 0) return 0;

        int formas = 0;
        for (int i = minBase; i * i <= n; i++) {
            formas += contarFormas(n - i * i, k - 1, i);
        }
        return formas; 
    }
}