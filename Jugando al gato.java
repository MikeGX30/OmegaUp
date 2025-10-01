import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            String line = scanner.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        boolean ganaX = ganador(board, 'x');
        boolean ganaO = ganador(board, 'o');

        if (ganaX) {
            System.out.println("Roots!:D");
        } else if (ganaO) {
            System.out.println("Velafloow 8)");
        } else {
            System.out.println("Bailo Verta :S");
        }

        scanner.close(); 
    }

    private static boolean ganador(char[][] b, char c) {
        for (int i = 0; i < 2; i++) {
            if (b[i][0] == c && b[i][1] == c && b[i][2] == c) return true;
        }

        for (int j = 0; j < 3; j++) {
            if (b[0][j] == c && b[1][j] == c && b[2][j] == c) return true;
        }

        if (b[0][0] == c && b[1][1] == c && b[2][2] == c) return true;
        if (b[0][2] == c && b[1][1] == c && b[2][0] == c) return true;

        return false; 
    }
}