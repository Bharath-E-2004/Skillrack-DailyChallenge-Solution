import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        int[][] matrix = new int[row][col];

        // Reading matrix input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // Checking for specific 3x3 pattern
        for (int i = 0; i <= row - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                if (matrix[i][j] == 1 &&
                    matrix[i + 1][j] == 0 &&
                    matrix[i + 2][j] == 1 &&
                    matrix[i][j + 1] == 0 &&
                    matrix[i][j + 2] == 1 &&
                    matrix[i + 1][j + 1] == 1 &&
                    matrix[i+2][j+1]==0 &&
                    matrix[i + 1][j + 2] == 0 &&
                    matrix[i + 2][j + 2] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
/*
The program must accept an integer matrix of size R°C containing only Os and is as the input.

The program must print the number of occurrences of the following pattern in the given

matrix.

101

010

101

Boundary Condition(s):

3 <= R, C <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

Output Format:

The first line contains an integer value representing the number of occurrences of the given pattern in the matrix.

Example Input/Output 1:

Input:

5 6

001100

010101

001010

110101

001011

Output

3
*/
