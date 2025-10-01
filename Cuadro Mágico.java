import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        
        boolean esMagico = true;

        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != 15) {
                esMagico = false;
            }
        }

        for (int j = 0; j < 3; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 3; i++) {
                sumaCol += m[i][j];
            }
            if (sumaCol != 15) {
                esMagico = false;
            }
        }

        int diag1 = m[0][0] + m[1][1] + m[2][2];
        int diag2 = m[0][2] + m[1][1] + m[2][0];
        
        if (diag1 != 15 || diag2 != 15) {
            esMagico = false;
        }
        
        if (esMagico) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        scanner.close(); 
    }
}