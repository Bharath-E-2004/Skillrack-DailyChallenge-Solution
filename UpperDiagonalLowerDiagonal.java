import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int first = N-1;

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = sc.nextInt();

                if (first >= i + j) {
                    sum1 += val;
                }

                if (first <= i + j) {
                    sum2 += val;
                }
            }
        }

        System.out.println(sum1 + "\n" + sum2);
        System.exit(0);
    }
}
