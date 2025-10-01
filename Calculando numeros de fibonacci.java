import java.util.Scanner;

public class Main {
    static final int MOD = 2017;

    static long[][] multiply(long[][] A, long[][] B) {
        long[][] C = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    static long[][] power(long[][] M, long n) {
        if (n == 1) return M;
        if (n % 2 == 0) {
            long[][] half = power(M, n / 2);
            return multiply(half, half);
        } else {
            return multiply(M, power(M, n - 1));
        }
    }

    static long fibonacci(long n) {
        if (n == 1 || n == 2) return 1;
        long[][] base = {{1, 1}, {1, 0}};
        long[][] result = power(base, n - 1);
        return result[0][0] % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(fibonacci(n));
    }
}