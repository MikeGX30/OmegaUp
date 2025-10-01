import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean semimagico = true;
        int suma = 0;

        for (int j = 0; j < N; j++) {
            suma += matriz[0][j];
        }

        for (int i = 1; i < N && semimagico; i++) {
            int fila = 0;
            for (int j = 0; j < N; j++) {
                fila += matriz[i][j];
            }
            if (fila != suma) {
                semimagico = false;
            }
        }

        for (int j = 0; j < N && semimagico; j++) {
            int col = 0;
            for (int i = 0; i < N; i++) {
                col += matriz[i][j];
            }
            if (col != suma) {
                semimagico = false;
            }
        }

        int diag1 = 0;
        for (int i = 0; i < N; i++) {
            diag1 += matriz[i][i];
        }
        if (diag1 != suma) semimagico = false;

        int diag2 = 0;
        for (int i = 0; i < N; i++) {
            diag2 += matriz[i][N - 1 - i];
        }
        if (diag2 != suma) semimagico = false;

        System.out.println(semimagico ? 1 : 0);
        scanner.close(); 
    }
}