import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        int matrix[][] = new int[row][col];

        // Reading the matrix
        for (int i = 0; i < row * col; i++) {
            matrix[i / col][i % col] = sc.nextInt();
        }

        int k = sc.nextInt(); // Number of rotations
        int r1 = row / 2, c1 = col / 2;

        while (k-- > 0) {
            int[][] temp = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i < r1 && j < c1)
                        temp[i][j] = matrix[i + r1][j];               // Top-left to bottom-left
                    else if (i < r1 && j >= c1)
                        temp[i][j] = matrix[i][j - c1];               // Top-right to top-left
                    else if (i >= r1 && j < c1)
                        temp[i][j] = matrix[i][j + c1];               // Bottom-left to bottom-right
                    else
                        temp[i][j] = matrix[i - r1][j];               // Bottom-right to top-right
                }
            }

            matrix = temp;
        }

        // Printing the final matrix
        for (int[] mat : matrix) {
            for (int val : mat)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}

/*
The program must accept an integer matrix of size R°C and an integer K as the input. The program must rotate the four quadrants within the given matrix K times in the clodovise direction.
Then the program must print the revised matrix as the output

Note: The values of R and C are always even.

Boundary Condition(s):

2 < R,C < 50

1 Matrix element value <= 10^5

16 K 100

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space. The (R+2)th line contains K.

Output Format:

The first R lines, each contains C integers separated by a space.

Example Input/Output 1:

Input:

4 4

10 20 11 22

30 40 33 44

55 66 50 60

77 88 70 80

2

Output:

50 60 55 66

70 80 77 88

11 22 10 20

33 44 30 40
*/
