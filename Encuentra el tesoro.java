import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (matriz[0][0] == matriz[0][2] &&
            matriz[1][1] == matriz[1][1] &&
            matriz[2][2] == matriz[2][0]) {
            System.out.println("Tesoro encontrado");
        } else {
            System.out.println("Sigue buscando");
        }

        scanner.close(); 
    }
}