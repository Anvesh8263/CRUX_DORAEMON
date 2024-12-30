import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            int remainder = x % n;
            int diff;

            if (remainder <= n / 2) {
                diff = remainder;
            } else {
                diff = n - remainder;
            }
            System.out.println(diff);
        }
        sc.close(); // Close the scanner to prevent resource leaks. Important!
    }
}
