import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = 0;

        int M = sc.nextInt(), N = sc.nextInt();

        while (M > 0 || N > 0) {

            if (M % 10 == N % 10) {

                System.out.print(M % 10 > N % 10 ? M % 10 : N % 10);

                p = 1;

            }

            N /= 10;

            M /= 10;
        }

        if (p == 0) {
            System.out.println(-1);
        }

        System.exit(0);
    }
}
