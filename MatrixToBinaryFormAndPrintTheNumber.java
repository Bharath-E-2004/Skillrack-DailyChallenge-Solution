import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        char ch[][] = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
        }

        int k = sc.nextInt();

        for (int i = 0; i < row; i += k) {
            for (int j = 0; j < col; j += k) {

                String bin = "";
                for (int a = 0; a < k; a++) {
                    for (int b = 0; b < k; b++) {
                        bin += ch[i + a][j + b];
                    }
                }

                System.out.print(Integer.parseInt(bin, 2) + " ");
            }
            System.out.println();
        }

        System.exit(0);
    }
}
/*
The program must accept an integer matrix of size R°C and an integer K as the input. The matrix contains only Os and 1s. The values of R and C are always divisible by K. For each K'K submatrix, the program must print an integer whose binary representation is formed using the bits in the submatrix.

Boundary Condition(s):

2<=RC <=50 1 <= K <= 5

Input Format:

The first line contains R. and C. separated by a space. The next R lines each contains C integer values separated by a space, The R+2nd line contains K

Output Format:

The first R/K lines, each contains C/K integer values separated by a space.
*/
