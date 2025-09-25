import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int first = val * 2 - 2;

        // Top line
        System.out.println("-".repeat(first) + "*");

        // Middle pattern
        for (int i = 1; i < val - 1; i++) {
            System.out.println(
                "-".repeat(first - i * 2) + "*" +
                "-".repeat(2 * i - 1) +
                "*"+
                "-".repeat(2 * i - 1) +
                "*"
            );
        }

        // Bottom line
        System.out.print("*");
        for (int i = 0; i < val*2-2; i++) {
            System.out.print("-*");
        }
        System.out.println();

        sc.close();
    }
}
