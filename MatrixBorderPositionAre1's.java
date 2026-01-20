import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];

        for (int i = 0; i < R; i++) {
            String row = sc.next();
            for (int j = 0; j < C; j++) {
                mat[i][j] = row.charAt(j) - '0';
            }
        }

        int maxSize = Math.min(R, C);

        for (int size = maxSize; size >= 2; size--) {
            for (int i = 0; i <= R - size; i++) {
                for (int j = 0; j <= C - size; j++) {

                    if (isBorderOne(mat, i, j, size)) {
                        System.out.println(size);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }

    static boolean isBorderOne(int[][] mat, int r, int c, int size) {
        for (int i = 0; i < size; i++) {
            if (mat[r][c + i] != 1) return false;              // top
            if (mat[r + size - 1][c + i] != 1) return false;  // bottom
            if (mat[r + i][c] != 1) return false;              // left
            if (mat[r + i][c + size - 1] != 1) return false;   // right
        }
        return true;
    }
}
/*
The program must accept an integer matrix of size R°C containing only Os and 1s as the input. The program must print the size of the largest square submatrix of the minimum size 2 where all the elements in the border are 1s. If there is no such submatrix, then the program must print -1 as the output.

Boundary Condition(s):

2R, C<= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

Output Format:

The first line contains an integer value representing the size of the largest square submatrix or -1 based on the given conditions.

Example Input/Output 1:

Input:

6 8

00000110

11100000

00111111

11110110

11010110

00011111

Output:

4

Explanation:

The largest square submatrix of size 4*4 with 1s in the border is highlighted below.

00000110

11100000

00111111

11110110

11010110

00011111

Example Input/Output 2:

Input:

4 3

110

101

011

110

Output:

-1

*/
