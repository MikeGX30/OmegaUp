import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] copia = Arrays.copyOf(A, N);
        Arrays.sort(copia);
        int mediana = copia[N / 2];
        int indice = -1;
        for (int i = 1; i < N; i++) {
            if (A[i] == mediana) {
                indice = i;
                break;
            }
        }
        System.out.println(mediana + " " + indice);
    }
}