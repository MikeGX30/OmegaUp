import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        char[] chars = input.toCharArray();
        Arrays.sort(chars); 

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            char c = chars[i];
            int count = 1;
            while (i + count < chars.length && chars[i + count] == c) {
                count++;
            }
            sb.append(count).append(c); 
            i += count;
        }

        System.out.println(sb.toString());
    }
}