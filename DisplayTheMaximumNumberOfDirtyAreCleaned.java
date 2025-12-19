import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] mat = new char[N][N];

        // Read matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }

        int L = sc.nextInt();
        int max = 0;

        // Horizontal sweep
        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < L; j++)
                if (mat[i][j] == '*') count++;

            max = Math.max(max, count);

            for (int j = L; j < N; j++) {
                if (mat[i][j] == '*') count++;
                if (mat[i][j - L] == '*') count--;
                max = Math.max(max, count);
            }
        }

        // Vertical sweep
        for (int j = 0; j < N; j++) {
            int count = 0;

            for (int i = 0; i < L; i++)
                if (mat[i][j] == '*') count++;

            max = Math.max(max, count);

            for (int i = L; i < N; i++) {
                if (mat[i][j] == '*') count++;
                if (mat[i - L][j] == '*') count--;
                max = Math.max(max, count);
            }
        }

        System.out.print(max);
    }
}
/*
The program must accept a character matrix of size N°N representing the floor of a room as the input. Each hash symbol indicates that the area is clean. Each asterisk indicates that the area is dirty. A floor sweeper of length L is available to clean the room. The program must print the maximum number of dirty areas that can be cleaned in one sweep vertically or horizontally as the output.

Boundary Condition(s):

2 <= N <= 50 1<=L<= N

Input Format:

The first line contains N. The next N lines, each contains N characters separated by a space. The N+2nd line contains L

Output Format:

The first line contains an integer representing the maximum number of dirty areas that can be cleaned in one sweep vertically or horizontally.
*/
