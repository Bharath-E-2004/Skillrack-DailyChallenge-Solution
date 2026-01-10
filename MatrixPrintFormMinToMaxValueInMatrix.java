import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int rMin = 0, cMin = 0, rMax = 0, cMax = 0;

        // Read matrix and find min & max
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < min) {
                    min = mat[i][j];
                    rMin = i;
                    cMin = j;
                }

                if (mat[i][j] > max) {
                    max = mat[i][j];
                    rMax = i;
                    cMax = j;
                }
            }
        }

        int startRow = Math.min(rMin, rMax);
        int endRow   = Math.max(rMin, rMax);
        int startCol = Math.min(cMin, cMax);
        int endCol   = Math.max(cMin, cMax);

        // Print smallest submatrix
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
The program must accept an integer matrix of size R°C containing only unique integers as the input. The program must print the smallest possible submatrix having the minimum integer and the maximum integer in the matrix.

Boundary Condition(s):

2 <= R, C<=50

1<= Matrix element value <= 10^4

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

Output Format:

The lines contain the smallest possible submatrix having the minimum integer and the maximum integer in the matrix.

Example Input/Output 1:

Input

56

73 31 19 10 27 12

82 66 15 23 64 89

17 40 74 41 99 38

46 79 91 28 57 35

94 97 45 55 33 56

Output:

10 27

23 64

41 99

Explanation:

The minimum integer in the matrix is 10.

The maximum integer in the matrix is 99.

So the smallest submatrix with 10 and 99 is given below.

10 27

23 64

41.99
*/
