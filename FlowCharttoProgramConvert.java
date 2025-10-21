import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int ctr = n2;

        while (ctr >= n1 || n2 <= n3) {
            if (ctr >= 1) {
                System.out.print(ctr);
            } else {
                System.out.print(1);
            }

            System.out.print(" ");

            if (n2 <= n3) {
                System.out.print(n2);
            } else {
                System.out.print(n3);
            }

            System.out.println();
            ctr--;
            n2++; // Assuming you meant to increment n2 here
        }
    }
}
