import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[] count = new int[col];

        // Count the number of 0s in each column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = sc.nextInt();
                count[j] += (val ^ 1); // Add 1 if val == 0, else 0
            }
        }

        Arrays.sort(count); // Sort count array

        // Print transformed matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((count[j] <= i ? 1 : 0) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
  Sort Columns Number of Os

The program must accept an integer matrix of size R°C as the input. The matrix contains only Os and 1s. The program must sort the integers in each column of the matrix. Then the program must sort the columns based on the number of Os in the columns of the matrix. Finally, the program must print the revised matrix as the output.

Boundary Condition(s):

2 <= R, C <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

Output Format:

The first R lines contain the revised matrix.

Example Input/Output 1:

Input:

65

01100

01001

01100

11001

10100

00000

Output

00000

00000

10000

11000

11110

11110
*/
