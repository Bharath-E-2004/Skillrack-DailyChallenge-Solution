import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Check if the current position falls within the hash pattern region
                if (((i == K || i == N - K +1) && (j>=K && j<=N-K+1))|| ((j == K || j == N - K+1) && (i>=K && i<=N-K+1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

/*
The program must accept two integers N and K as the input.
The program must form a grid of asterisks of size N°N. 
Then the program must replace the asterisks in the Kth border of the grid with the hash symbols(#), Finally, the program must print the N'N grid as the output.

Boundary Condition(s):

2 <= N <= 100

1 <= K <= (N+1)/2

Input Format:

The first line contains N and K separated by a space.

Output Format:

The first N lines, each contains N characters separated by a space.
*/
