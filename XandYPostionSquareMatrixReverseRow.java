import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        // Reading matrix values
        for (int i = 0; i < row * col; i++) {
            matrix[i / col][i % col] = sc.nextInt();
        }

        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;
        int k = sc.nextInt();

        // Reverse rows in the specified square submatrix
        for (int i = 0; i < k / 2; i++) {
            for (int j = 0; j < k; j++) {
                int r1 = x + i;
                int r2 = x + k - 1 - i;
                int c = y + j;

                int temp = matrix[r1][c];
                matrix[r1][c] = matrix[r2][c];
                matrix[r2][c] = temp;
            }
        }

        // Output the resulting matrix
        for (int[] arr : matrix) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
The program must accept an integer matrix of size R*C and three integers X, Y, K 
as the input. The integers X and Y represents the position of the top-left element of a square submatrix. The integer K represents the size of the square submatrix. The program must flip the specified submatrix(i.e., reverse the rows of the submatrix) in the given matrix a
nd print the revised matrix as the output.
*/
