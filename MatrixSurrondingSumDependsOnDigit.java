import java.util.*;

public class Hello {

    // Direction arrays (row and column offsets)
    static int[] dr = {-1, -1, -1,  0,  1,  1,  1,  0};
    static int[] dc = {-1,  0,  1,  1,  1,  0, -1, -1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(sum(mat, i, j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int sum(int[][] mat, int r, int c) {

        int D = mat[r][c];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 8 && count < D; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (isValid(nr, nc, mat)) {
                sum += mat[nr][nc];
                count++;
            }
        }
        return sum;
    }

    public static boolean isValid(int r, int c, int[][] mat) {
        return r >= 0 && c >= 0 && r < mat.length && c < mat[0].length;
    }
}

/*
The program must accept an integer matrix of size R°C containing only digits from 1 to 8 as the input. For each digit D in the matrix, the program must print the sum of the first D surrounding digits as the output. If the number of surrounding digits of D is less than D, then the program must print the sum of all the surrounding digits of D..

The order of surrounding digits is given below.

top-left, top, top-right, right, bottom-right, bottom, bottom-left and left.

Boundary Condition(s):

2 <= R, C <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space.

Output Format:

The first R lines, each contains C integers separated by a space representing the sum of surrounding digits based on the given conditions.

Example Input/Output 1:

Input:

3  3 

7 5 2 
3 8 3 
2 4 1

Output:

16 23 11

20 27 8

11 15 8
*/
