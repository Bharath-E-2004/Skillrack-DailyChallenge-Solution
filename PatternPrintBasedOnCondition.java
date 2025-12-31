import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Upper half including middle
        for (int i = 0; i < N; i++) {
            System.out.print("-".repeat(N - i - 1));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }

        // Lower half
        for (int i = N - 2; i >= 0; i--) {
            System.out.print("-".repeat(N - i - 1));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }
    }
}
